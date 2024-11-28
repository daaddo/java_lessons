package it.cascella.grafi;

import java.util.HashMap;
import java.util.Map;

public class DistanceGraph<T, ID> {
    private Map<ID,GraphNode<T,ID>> graphNodeMap = new HashMap<>();
    private Map<ID, Map<GraphNode<T,ID>,Long>> graphEdgeMap = new HashMap<>();

    public void addNode(ID id, T value){
        graphNodeMap.put(id, new GraphNode<>(id,value));
    }
    public void addNode(GraphNode<T,ID> node){
        graphNodeMap.put(node.getId(),node);
    }

    public void addEdge(ID from, ID to, long distance){
        GraphNode<T,ID> fromNode = graphNodeMap.get(from);
        GraphNode<T,ID> toNode   = graphNodeMap.get(to);
        if(fromNode == null|| toNode == null){
            throw new IllegalArgumentException("Node not found");
        }
        graphEdgeMap.computeIfAbsent(from, k -> new HashMap<>()).put(toNode, distance);
    }

    public boolean existsPath(ID from, ID to){
        return false;
    }
}
