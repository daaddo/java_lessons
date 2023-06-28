package it.cascella.JBBC;

public class DbTest {
    public static void main(String[] args) {
        DbManager.connect();
        DbManager.printFilms(12);
        DbManager.disconnect();
    }
}
