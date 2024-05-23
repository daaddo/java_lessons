package it.cascella.alberi.bst;

public class Node {
    private int value;

    private Node left = null;
    private Node right = null;
    public Node(int value) {
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    //preOrder
    public void preVisita(Node root){
        if (root !=null){
            System.out.println(root.value);
            preVisita(root.left);
            preVisita(root.right);
        }
    }
    public int getValue() {
        return value;
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

    public void deleteNode(int value) {
        if (left!=null && value == left.getValue()){
            if (left.isLeaf()){
                left = null;
                return;
            }
            if (left.getRight() != null) {
                Node toUnion = left.getRight();
                toUnion.insertNode(left.getLeft());
                left = toUnion;
            }
            else{
                left = left.getLeft();
            }
        }
        else if (right!=null&&value == right.getValue()){
            if (right.isLeaf()){
                right = null;
                return;
            }
            if (right.getLeft() != null) {
                Node toUnion = right.getLeft();
                toUnion.insertNode(right.getRight());
                right = toUnion;
            }
            else{
                right = right.getRight();
            }
        }
        else if (value<this.value){
            left.deleteNode(value);
        }
        else if (value>this.value){
            right.deleteNode(value);
        }
    }

    public Node getAllRight() {
        if(right !=null){
            return getAllRight();
        }
        return this;
    }

    public Node getAllLeft() {
        if(left !=null){
            return getAllLeft();
        }
        return this;
    }

    public void insertNode(Node node) {
        if (node.getValue() <value){
            if (left == null){
                left = node;
            }
            else {
                left.insertNode(node);
            }
        }else{
            if (right == null){
                right = node;
            }
            else{
                right.insertNode(node);
            }
        }
    }
}
