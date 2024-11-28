package it.cascella.patterns.factory.step0;

import it.cascella.patterns.factory.step0.model.Item;
import it.cascella.patterns.factory.step0.model.Potion;
import it.cascella.patterns.factory.step0.model.Shield;
import it.cascella.patterns.factory.step0.model.Weapon;

public class ItemGenerator {

    private static int id = 0;

    public enum ItemType {
        WEAPON, SHIELD, POTION
    }

    //Questo metodo è noto come Simple Factory, è un pattern di progettazione.
    //Non è un vero e proprio pattern ma è un modo di scrivere il codice che ci permette di creare oggetti in modo semplice.
    public static Item generateItem(ItemType type) {
        id++;
        return switch (type) {
            case WEAPON -> {
                //generate a random number between 10 and 30
                int damage = (int) (Math.random() * 20) + 10;
                yield new Weapon(id, "Spada", damage);
            }
            case SHIELD -> new Shield(id, "Scudo", 50);
            case POTION -> {
                //generate a random number between 1 and 3
                int grade = (int) (Math.random() * 3) + 1;
                String name = switch (grade) {
                    case 1 -> "Pozione minore";
                    case 2 -> "Pozione media";
                    case 3 -> "Pozione maggiore";
                    default -> "Pozione";
                };
                yield new Potion(id, name, grade * 30 + (grade == 3 ? 20 : 0));
            }
        };
    }

}
