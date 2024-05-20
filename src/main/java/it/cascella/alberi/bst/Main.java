package it.cascella.alberi.bst;

public class Main {
    public static void main(String[] args) {
        BST bst = new BST();
        /*while(true){
            System.out.println("inserisci numero");

            bst.insert(value);
        }*/
        bst.insert(50);
        bst.insert(40);
        bst.insert(60);
        bst.insert(70);
        bst.insert(10);
        bst.insert(20);
        bst.insert(100);
        bst.insert(80);
        bst.insert(65);
        bst.preVisit();
        System.out.println("Post-------------------Visita");
        bst.postVisit();
        System.out.println("in-------------------Visita");
        bst.inVisit();
        System.out.println("Min-------------------");
        System.out.println(bst.getMin());
        System.out.println("Max-------------------");
        System.out.println(bst.getMax());
        System.out.println("find");
        System.out.println(bst.find(63));
    }

}
