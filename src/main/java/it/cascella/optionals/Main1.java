package it.cascella.optionals;

public class Main1 {

    public static String getCodeFromServer(){
        if (Math.random()>0.5) {

            return "asdrubale-A";
        }
        else{
            return null;
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
        String codeFromServer = getCodeFromServer();
        execute(codeFromServer);
        System.err.println("uauauaua");
    }
}
