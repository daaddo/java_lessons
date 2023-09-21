package it.cascella.genericiAIUTOVIPREGO.esercitazione.second;

import java.util.Objects;

public class Pair<T extends Comparable<T>>{
    private T first;
    private T second;

    public Pair(T first, T second){

        this.first = first;
        this.second = second;
    }
    public void setFirst( T first){
        this.first= first;
    }
    public void setSecond( T second){
        this.second= second;
    }

    public T getFirst(){
        return first;
    }
    public T getSecond(){
        return second;
    }
    public T getBestOne(){
        return first.compareTo(second)>0 ?first:second;
    }
}
