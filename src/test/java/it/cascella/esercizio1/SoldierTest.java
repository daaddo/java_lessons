package it.cascella.esercizio1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SoldierTest {

    @Test
    void getName() {
        Soldier s1 = new Soldier("Mario", "Rossi", 20, "Caporale");
        assertEquals("Mario", s1.getName());
    }

    @Test
    void setName() {
    }

    @Test
    void getSurname() {
    }

    @Test
    void setSurname() {
    }

    @Test
    void getAge() {
    }

    @Test
    void setAge() {
    }

    @Test
    void getRank() {
    }

    @Test
    void setRank() {
    }
}