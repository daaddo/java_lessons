package it.cascella.annotations.example;

import java.lang.reflect.Method;

public class FightManager {
    private static FightManager instance = null;

    private FightManager() {
    }

    public static FightManager getInstance() {
        if (instance == null) {
            instance = new FightManager();
        }
        return instance;
    }

    public boolean fight(Unit attacker, Unit defender) {

        try {
            Method fightMethod = attacker.getClass().getMethod("fight", Unit.class);
            if (fightMethod.isAnnotationPresent(Bugged.class)) {
                Bugged annotation = fightMethod.getAnnotation(Bugged.class);
                System.out.println("[WARNING] Found annotation Bugged on method fight of class " + attacker.getClass().getName());
                if (annotation.note() != null && !annotation.note().isEmpty()) {
                    System.out.println("[WARNING] Note: " + annotation.note());
                }
            }
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
        attacker.fight(defender);
        if (defender.getHealth() <= 0) {
            return true;
        }
        return false;
    }
}
