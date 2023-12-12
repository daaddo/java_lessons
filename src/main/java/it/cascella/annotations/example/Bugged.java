package it.cascella.annotations.example;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Bugged {
    String note() default "This method is bugged";
}
