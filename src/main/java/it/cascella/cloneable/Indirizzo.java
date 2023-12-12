package it.cascella.cloneable;

public class Indirizzo implements  Cloneable{
    private String via;
    private String citta;

    public Indirizzo(String via, String citta) {
        this.via = via;
        this.citta = citta;
    }

    public String getVia() {
        return via;
    }

    public void setVia(String via) {
        this.via = via;
    }

    public String getCitta() {
        return citta;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }

    @Override
    public Indirizzo clone() {
        try {
            Indirizzo clone = (Indirizzo) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "Indirizzo{" +
                "via='" + via + '\'' +
                ", citta='" + citta + '\'' +
                '}';
    }
}
