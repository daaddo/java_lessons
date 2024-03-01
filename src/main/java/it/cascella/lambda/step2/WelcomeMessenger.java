package it.cascella.lambda.step2;

@FunctionalInterface
public interface WelcomeMessenger {
    String generateWelcomeMessage(String name);
}
