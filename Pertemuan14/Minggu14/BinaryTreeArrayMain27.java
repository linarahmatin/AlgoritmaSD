package Minggu14;

public class BinaryTreeArrayMain27 {
    public static void main(String[] args) {
    BinaryTreeArray27 bta = new BinaryTreeArray27();
    
    bta.add(6);
    bta.add(4);
    bta.add(8);
    bta.add(3);
    bta.add(5);
    bta.add(7);
    bta.add(9);
 
    System.out.print("\nIn-Order Traversal      : ");
    bta.traverseInOrder(0);
    System.out.println("\n");

    System.out.print("\nPre-Order Traversal     : ");
    bta.traversePreOrder(0);
    System.out.println("\n");

    System.out.print("\nPost-Order Traversal    : ");
    bta.traversePostOrder(0);
    System.out.println("\n");

    }
}