package it.cascella.annotations.tutorial;

public class Tutorial {
    /*

    Annotations are a form of metadata, that can be added to Java source code.
    Annotations are used to provide instructions to the compiler, or to the runtime environment.*
    Annotations are defined using the @ sign, followed by the annotation name.
*
    Annotations can be applied to classes, methods, fields and other program elements.
*
    Annotations can be processed by compiler tools, or by runtime tools.
**/
    //sono una sorta di metadata che vengono usate in java per dare informazioni al compiler o al runtime environment
    //sono definite con @ seguito dal nome dell'annotation
    //possono essere applicate a classi, metodi, fields e altri elementi del programma
    public static void main(String[] args) {
        System.out.println("Hello World!");
        @SuppressWarnings("unused")
        int x;

        ServerManager.getInstance().connect();
    }
}
