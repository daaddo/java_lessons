package it.cascella.optionals.step1;

import java.util.Optional;

public class Main1 {

    public static Optional<String> getCodeFromServer(){
        Optional<String> o = Optional.of("ciao"); // cosi ho creato un optional presente
        Optional<String> a = Optional.ofNullable(null); // cosi ho creato un optional non presente
        if (Math.random()>0.5) {

            return Optional.of("asdrubale-A");
        }
        else{
            return  Optional.ofNullable(null);
        }
    }
    public static void execute(String code){
        String[] split = code.split("-");
        String maincode = split[0];
        String type = split[1];
        System.out.println("Main code = "+maincode);
        System.out.println("type ="+type );
    }

    public static void main(String[] args) {
        System.out.println("server online");
        Optional<String> codeFromServer = getCodeFromServer();
        execute(codeFromServer.orElse("0000-B"));
        System.err.println("uauauaua");
    }
}
