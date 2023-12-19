package it.cascella.lambda.step1;

@FunctionalInterface
public interface Printer {
    void print(String s);

    /*//non posso avere più di un metodo astratto
    //ma posso avere metodi di default
    default void print(String s, int times) {
        for (int i = 0; i < times; i++) {
            print(s);
        }
    }
    //e dei metodi statici
    static void print(String s, int times, Printer printer) {
        for (int i = 0; i < times; i++) {
            printer.print(s);
        }
    }

    //è però consigliabile non avere metodi statici e di default*/
}
