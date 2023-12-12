package it.cascella.annotations.tutorial;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE,ElementType.CONSTRUCTOR})
//specifica su cosa può essere applicata l'annotazione: i possibili valori sono TYPE, METHOD, CONSTRUCTOR, FIELD, PARAMETER, LOCAL_VARIABLE, ANNOTATION_TYPE, PACKAGE,
// TYPE_PARAMETER, TYPE_USE
//TYPE_USE significa che può essere applicata ovunque
//TYPE_PARAMETER significa che può essere applicata solo su un parametro di tipo di un metodo o di un costruttore
//Se si omette il target, l'annotazione può essere applicata ovunque
// per specificare più tipi si usa la notazione array con le graffe tipo:
// @Target({TYPE, METHOD})
@Retention(RetentionPolicy.RUNTIME) //specifica quando l'annotazione è disponibile: i possibili valori sono SOURCE, CLASS, RUNTIME
//in particolare SOURCE significa che l'annotazione è disponibile solo nel codice sorgente,
// CLASS significa che è disponibile solo nel bytecode,
// RUNTIME significa che è disponibile anche a runtime !!!!!!!!!!!!!
//se retention non è specificato, di default è SOURCE
public @interface DoNotTouch {

}
