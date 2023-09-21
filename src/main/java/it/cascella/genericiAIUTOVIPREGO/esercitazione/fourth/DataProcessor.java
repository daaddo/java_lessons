package it.cascella.genericiAIUTOVIPREGO.esercitazione.fourth;

import java.util.ArrayList;
import java.util.List;

public class DataProcessor<T> {
    private List<T> items;


    public DataProcessor() {
        this.items = new ArrayList<>();
    }
    public void addData(T t){
        items.add(t);
    }
    public void processData(Processor<T> strategy){
        for (T item : items) {
            strategy.process(item);
        }
    }
}
