package it.cascella.alberi.bst;

public class Node {
    private int value;
    private Node left = null;
    private Node right = null;

    public Node(int value) {
        this.value = value;
    }
    //preOrder
    public void preVisita(Node root){
        if (root !=null){
            System.out.println(root.value);
            preVisita(root.left);
            preVisita(root.right);
        }
    }
    public void inVisita(Node root){
        if (root !=null){
            inVisita(root.left);
            System.out.println(root.value);
            inVisita(root.right);
        }
    }
    public void postVisita(Node root){
        if (root !=null){
            postVisita(root.left);
            postVisita(root.right);
            System.out.println(root.value);
        }
    }
    public boolean find(int value){
        if (value==this.value){
            return true;
        }
        if (value<this.value){
            if (left==null){
                return false;
            }
            boolean found = left.find(value);
            if (found){
                return true;
            }
        }
        else  {
            if (right==null){
                return false;
            }
            boolean found = right.find(value);
            return found;
        }
        return false;
    }
    public void insert(int value){

        if (value< this.value){
            if (this.left==null){
                this.left = new Node(value);
            }else {
                this.left.insert(value);
            }
        }
        else{
            if (this.right==null){
                this.right = new Node(value);
            }else {
                this.right.insert(value);
            }
        }
    }
    public int getMin(){
        if (left != null){
            return left.getMin();
        }
        return value;
    }
    public int getMax(){
        if (right != null){
            return right.getMax();
        }
        return value;
    }
    public boolean isLeaf(){
        return left==null && right==null;
    }

}
