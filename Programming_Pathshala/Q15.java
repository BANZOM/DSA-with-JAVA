/**
 * Node
 */
class LinkedList {
    Node head;
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    
}

public class Q15 {
    public static void main(String[] args) {
        LinkedList n = new LinkedList();
        n = n.addAtLast(1);
        n = n.addAtLast(5);

        n.printList();
    }
}
