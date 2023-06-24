package it.cascella.esercizio1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArmyTest {

    @Test
    void addSoldier() {
        Army a1 = new Army();
        Soldier s1 = new Soldier("Mario", "Rossi", 20, 2);
        Soldier s2 = new Soldier("Filiberto", "Astolfi", 20, 2);
        assertDoesNotThrow(() -> {
            a1.addSoldier(s1);
            a1.addSoldier(s2);
            assertEquals(2, a1.getSoldiers().size());
            assertEquals("Mario", a1.getSoldiers().get(0).getName());
            assertEquals("Filiberto", a1.getSoldiers().get(1).getName());
        });
    }

    @Test
    void findOldestSoldier() {
        Army a1 = new Army();
        Soldier s1 = new Soldier("Mario", "Rossi", 20, 2);
        Soldier s2 = new Soldier("Gianni", "Rossi", 43, 2);
        Soldier s3 = new Soldier("Kevin", "Rossi", 19, 2);
        Soldier s4 = new Soldier("Luca", "Rossi", 20, 2);
        a1.addSoldier(s1);
        a1.addSoldier(s2);
        a1.addSoldier(s3);
        a1.addSoldier(s4);

        assertEquals(s2, a1.findOldestSoldier());

    }

    @Test
    void findAllSoldierYoungerThan() {
        Army a1 = new Army();
        Soldier s1 = new Soldier("Mario", "Rossi", 20, 2);
        Soldier s2 = new Soldier("Gianni", "Rossi", 43, 2);
        Soldier s3 = new Soldier("Kevin", "Rossi", 19, 2);
        Soldier s4 = new Soldier("Luca", "Rossi", 20, 2);
        Soldier s5 = new Soldier("Lucia", "Rossi", 20, 2);
        Soldier s6 = new Soldier("Simone", "Rossi", 34, 2);

        a1.addSoldier(s1);
        a1.addSoldier(s2);
        a1.addSoldier(s3);
        a1.addSoldier(s4);
        a1.addSoldier(s5);
        a1.addSoldier(s6);

        a1.findAllSoldierYoungerThan(20).forEach(s -> {
            assertTrue(s.getAge() < 20);
        });
    }

    @Test
    void promote() {
    }

    @Test
    void degradate() {
    }
}