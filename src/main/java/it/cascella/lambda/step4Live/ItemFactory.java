package it.cascella.lambda.step4Live;

@FunctionalInterface
public interface ItemFactory {
    Item create(String name, int value);
}
