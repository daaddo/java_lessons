package it.cascella.lambda.step4Live;

public class TreasureFactory {
    public static Item create(ItemFactory factory, String name, int value) {
        return factory.create(name, value);
    }
    public static <T extends Item> T createGeneric(GenericItemFactory<T> factory, String name, int value) {
        return factory.create(name, value);
    }
}
