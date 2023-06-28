package it.cascella;

import org.junit.jupiter.api.Disabled;

import static org.junit.jupiter.api.Assertions.*;
@Disabled
class FrazioneTest {

    @org.junit.jupiter.api.Test
    void sum() {
        Frazione f = new Frazione(5,5);
        Frazione d = new Frazione(5,5);
        f.sum(d);
        int numeratore = f.getNumeratore();
        int denominatore = f.getDenominatore();
        assertEquals(50,numeratore);
        assertEquals(25,denominatore);
    }

    @org.junit.jupiter.api.Test
    void simplify() {
    }
}