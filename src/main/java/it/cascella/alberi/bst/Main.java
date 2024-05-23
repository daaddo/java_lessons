package it.cascella.alberi.bst;

public class Main {
    public static void main(String[] args) {
        BST bst = new BST();
        /*while(true){
            System.out.println("inserisci numero");

            bst.insert(value);
        }*/
        bst.insert(50);
        bst.insert(45);
        bst.insert(47);
        bst.insert(46);
        bst.insert(48);
        bst.insert(49);
        bst.insert(42);
        bst.insert(33);
        bst.insert(5);
        bst.insert(43);
        bst.insert(39);
        bst.insert(70);
        bst.insert(10);
        bst.insert(20);
        bst.insert(100);
        bst.insert(80);
        bst.insert(65);
        bst.insert(55);
        bst.insert(52);
        bst.insert(57);
        bst.insert(56);
        bst.insert(58);
        bst.insert(59);
        bst.insert(54);
        bst.insert(53);
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
        bst.deleteNode(20);
        bst.inVisit();
    }

}
