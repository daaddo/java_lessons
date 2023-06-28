package it.cascella.esercizio1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SoldierTest {

    @Test
    void getName() {
        Soldier s1 = new Soldier("Mario", "Rossi", 20, 2);
        assertEquals("Mario", s1.getName());


    }

    @Test
    void setName() {
        Soldier s1 = new Soldier();
        assertDoesNotThrow(() -> {
            s1.setName("Mario");
            assertEquals("Mario", s1.getName());
        });

        assertThrows(IllegalArgumentException.class, () -> {
            s1.setName(null);
        });

        assertThrows(IllegalArgumentException.class, () -> {
            s1.setName("");
        });
    }

    @Test
    void getSurname() {
        Soldier s1 = new Soldier("Mario", "Rossi", 20, 2);
        assertEquals("Rossi", s1.getSurname());
    }

    @Test
    void setSurname() {
        Soldier s1 = new Soldier();
        assertDoesNotThrow(() -> {
            s1.setSurname("Rossi");
            assertEquals("Rossi", s1.getSurname());
        });

        assertThrows(IllegalArgumentException.class, () -> {
            s1.setSurname(null);
        });

        assertThrows(IllegalArgumentException.class, () -> {
            s1.setSurname("");
        });
    }

    @Test
    void getAge() {
        Soldier s1 = new Soldier("Mario", "Rossi", 20, 2);
        assertEquals(20, s1.getAge());
    }

    @Test
    void setAge() {
        Soldier s1 = new Soldier();
        assertDoesNotThrow(() -> {
            s1.setAge(20);
            assertEquals(20, s1.getAge());
        });

        assertThrows(IllegalArgumentException.class, () -> {
            s1.setAge(17);
        });
    }

    @Test
    void getRank() {
        Soldier s1 = new Soldier("Mario", "Rossi", 20, 2);
        assertEquals(2, s1.getRank());
    }

    @Test
    void setRank() {
        Soldier s1 = new Soldier();
        assertDoesNotThrow(() -> {
            s1.setRank(2);
            assertEquals(2, s1.getRank());
        });

        assertThrows(IllegalArgumentException.class, () -> {
            s1.setRank(0);
        });
    }
}