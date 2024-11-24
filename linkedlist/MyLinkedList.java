package linkedlist;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {

    Node head;
    private int size;

    LinkedList() {
        head = null;
        size = 0;
    }

    void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
        size++;
    }

    void add(int idx, int data) throws Exception {
        if (idx > size) {
            throw new Exception("Index is greater than size of list.");
        }
        Node newNode = new Node(data);
        if (idx == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            int count = 1;
            Node currentNode = head;
            while (currentNode.next != null && count < idx) {
                currentNode = currentNode.next;
                count++;
            }
            Node temp = currentNode.next;
            currentNode.next = newNode;
            newNode.next = temp;
        }
        size++;
    }

    int remove(int idx) throws Exception {
        if (idx >= size) {
            throw new Exception("Index is greater than size of list.");
        }
        this.size--;
        if (idx == 0) {
            Node temp = head;
            head = head.next;
            temp.next = null;
            return temp.data;
        }

        int count = 1;
        Node currentNode = head;
        while (currentNode.next != null && count < idx) {
            currentNode = currentNode.next;
            count++;
        }
        Node temp = currentNode.next;
        currentNode.next = temp.next;
        temp.next = null;
        return temp.data;
    }

    int getSize() {
        return this.size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node current = head;
        while (current != null) {
            sb.append(current.data);
            if (current.next != null) {
                sb.append(", ");
            }
            current = current.next;
        }
        sb.append("]");
        return sb.toString();
    }
}

public class MyLinkedList {
    public static void main(String[] args) throws Exception {
        LinkedList list = new LinkedList();
        list.add(1);
        System.out.println(list);
        list.add(2);
        System.out.println(list);
        list.add(3);
        System.out.println(list);
        list.add(1, -1);
        list.add(3, 4);
        System.out.println(list);

        try {
            list.remove(4);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        list.remove(3);
        System.out.println(list);

        list.remove(1);
        System.out.println(list);

        System.out.println(list.getSize());
    }
}
