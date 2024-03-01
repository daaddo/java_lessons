package it.cascella.lambda.consumers;

import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Consumer<String> c = (String s) -> System.out.println(s);
        Consumer<String> c2 = s-> System.out.println(s.toUpperCase());
        Consumer<String> log = s -> System.out.println("Logging: "+s);
        Consumer<String> c3 = s -> System.out.println("Ciao ");
        /*c.andThen(c2).accept("cIcaio");*/
        List.of("a","b","c").forEach(c3.andThen(c2).andThen(log));


    }
}
