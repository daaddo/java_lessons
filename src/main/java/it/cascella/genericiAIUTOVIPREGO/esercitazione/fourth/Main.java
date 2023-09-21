package it.cascella.genericiAIUTOVIPREGO.esercitazione.fourth;

public class Main {
    public static void main(String[] args) {
        DataProcessor<String> dataProcessor = new DataProcessor<>();
        StringProcessor stringProcessor = new StringProcessor();
        dataProcessor.addData("sdsds");
        dataProcessor.processData(stringProcessor);


        DataProcessor<Integer> dataProcessor1 = new DataProcessor<>();
        PositiveIntegerProcessor posProcessor = new PositiveIntegerProcessor();
        dataProcessor1.addData(-56);
        dataProcessor1.processData(posProcessor);
    }
}
