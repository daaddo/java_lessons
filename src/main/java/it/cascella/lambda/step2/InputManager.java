package it.cascella.lambda.step2;

import java.util.*;

public class InputManager {
    private static InputManager instance = null;

    private Map<Validable,List<Validator>> validator = new EnumMap(Validable.class);
    private InputManager() {
    }

    public static InputManager getInstance() {
        if (instance == null) {
            instance = new InputManager();
        }
        return instance;
    }
    public void addValidator(Validator validator, Validable validable){
        this.validator.computeIfAbsent(validable, k -> new ArrayList<>());
        this.validator.get(validable).add(validator);
    }
    public void addValidators(Validable validable,Validator ... validators){
        this.validator.computeIfAbsent(validable, k -> new ArrayList<>());
        this.validator.get(validable).addAll(Arrays.stream(validators).toList());
    }

    public boolean validateInput(String toValidate, Validable validable){
        List<Validator> validators = this.validator.get(validable);
        for (Validator validator1 : validators) {
            if (!validator1.validate(toValidate)){
                return false;
            }
        }
        return true;
    }
}
