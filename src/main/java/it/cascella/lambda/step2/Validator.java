package it.cascella.lambda.step2;

@FunctionalInterface
public interface Validator {
    boolean validate(String toValidate);
}
