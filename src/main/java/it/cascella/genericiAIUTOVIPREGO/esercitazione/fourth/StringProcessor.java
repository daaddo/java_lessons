package it.cascella.genericiAIUTOVIPREGO.esercitazione.fourth;

public class StringProcessor implements Processor<String>{

    @Override
    public void process(String item) {
        System.out.println(item);
    }
}
