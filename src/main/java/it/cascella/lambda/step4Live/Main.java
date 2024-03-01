package it.cascella.lambda.step4Live;

public class Main {
    private static Potion suffix(String name, int value){
        return new Potion("[POZIONE] "+name, value);
    }
    public static void main(String[] args) {

        System.out.println(((Potion) TreasureFactory.create(Main::suffix,"Pozione di rimorchio", 1000)).getName());
        TreasureFactory.createGeneric(MachineGun::new,"super",21).shoot();
    }
}
