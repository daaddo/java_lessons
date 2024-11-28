package it.cascella.grafi;

public class GraphNode<T, ID> {
    private  ID id;
    private T value;

    public GraphNode(ID id,T value){
        this.id = id;
        this.value = value;
    }

    public ID getId() {
        return id;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
