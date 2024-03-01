package it.cascella.lambda.step2;

import java.util.Objects;

public class Main2 {
    //inputmanager deve accettare una lsita di validatori e tutti devono essere validi affinche una stringa passi
    public static void main(String[] args) {
        String nome = "Marco";

        InputManager.getInstance().addValidators(
                Validable.EMAIL,
                (message)-> !message.contains("a")&&!message.contains("donna")&&!message.contains("trans"),
                message -> message!=null
        );
        boolean b = InputManager.getInstance().validateInput(nome, Validable.EMAIL);
        boolean c = InputManager.getInstance().validateInput("odio i neri", Validable.EMAIL);
        System.out.println(b);
        System.out.println(c);

    }
}
