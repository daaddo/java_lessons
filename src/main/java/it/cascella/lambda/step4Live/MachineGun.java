package it.cascella.lambda.step4Live;

public class MachineGun extends Weapon{
    public MachineGun(String name, int damage) {
        super(name, damage);
    }
    public void shoot(){
        System.out.println("MachineGun.shoot()");
    }

}
