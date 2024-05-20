package it.cascella.alberi.bst;

public class BST {
    private Node root=null;
    private int count;


    public boolean find(int value){
        return root.find(value);
    }
    public void insert(int value){
        if (root==null){
            root = new Node(value);
        }else{
            root.insert(value);
        }
    }
    public void preVisit(){
        if(root==null){
            System.out.println("vuoto");
            return;
        }
        root.preVisita(root);
    }

    public void postVisit() {
        if(root==null){
            System.out.println("vuoto");
            return;
        }
        root.postVisita(root);
    }
    public void inVisit() {
        if(root==null){
            System.out.println("vuoto");
            return;
        }
        root.inVisita(root);
    }
    public int getMin(){
        if(root==null){
            System.out.println("vuoto");
            return 0;
        }
        return root.getMin();
    }
    public int getMax(){
        if(root==null){
            System.out.println("vuoto");
            return 0;
        }
        return root.getMax();
    }
}
