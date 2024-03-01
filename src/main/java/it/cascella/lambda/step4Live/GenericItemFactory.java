package it.cascella.lambda.step4Live;
@FunctionalInterface
public interface GenericItemFactory<T extends Item> {
    T create(String name, int value);
}
