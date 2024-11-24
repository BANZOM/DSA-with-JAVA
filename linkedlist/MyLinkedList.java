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

    void addAtFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
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
    public static void main(String[] args) {
        try {
            System.out.println("=== Testing LinkedList Implementation ===");
            LinkedList list = new LinkedList();
            
            // Test 1: Empty list
            System.out.println("\nTest 1: Empty list");
            System.out.println("Empty list: " + list);
            System.out.println("Size: " + list.getSize());
            
            // Test 2: Adding elements at the end
            System.out.println("\nTest 2: Adding elements at the end");
            list.add(10);
            list.add(20);
            list.add(30);
            System.out.println("After adding 10, 20, 30: " + list);
            
            // Test 3: Adding elements at specific positions
            System.out.println("\nTest 3: Adding at specific positions");
            list.add(0, 5);  // Add at beginning
            list.add(2, 15); // Add in middle
            list.add(5, 35); // Add at end
            System.out.println("After adding 5, 15, 35 at indexes 0, 2, 5: " + list);
            
            // Test 4: Adding at first position
            System.out.println("\nTest 4: Adding at first index");
            list.addAtFirst(1);
            System.out.println("After adding 1 at index: " + list);
            
            // Test 5: Removing elements
            System.out.println("\nTest 5: Removing elements");
            System.out.println("Removed element at index 0: " + list.remove(0));
            System.out.println("After removal: " + list);
            System.out.println("Removed element at index 2: " + list.remove(2));
            System.out.println("After removal: " + list);
            
            // Test 6: Edge cases
            System.out.println("\nTest 6: Edge cases");
            try {
                list.add(10, 100);
                System.out.println("This shouldn't be printed");
            } catch (Exception e) {
                System.out.println("Expected error: " + e.getMessage());
            }
            
            try {
                list.remove(10);
                System.out.println("This shouldn't be printed");
            } catch (Exception e) {
                System.out.println("Expected error: " + e.getMessage());
            }
            
            // Test 7: Final state
            System.out.println("\nTest 7: Final state");
            System.out.println("Final list: " + list);
            System.out.println("Final size: " + list.getSize());
            
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }
    }
}
