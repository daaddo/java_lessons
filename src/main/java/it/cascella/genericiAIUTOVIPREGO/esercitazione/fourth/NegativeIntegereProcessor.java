package it.cascella.genericiAIUTOVIPREGO.esercitazione.fourth;

public class NegativeIntegereProcessor  implements Processor<Integer>{


    @Override
    public void process(Integer item) {
        if (item >0){
            System.out.println("sce");
            throw new IllegalArgumentException();
        }
        System.out.println(" not sce");
    }
}
