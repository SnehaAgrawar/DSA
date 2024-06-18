package SinglyLinkedList;

public class LinkedList {

    public class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public boolean insert(int data) {
        Node newNode = new Node(data);
        // check for empty node
        if (head == null) {
            head = newNode;
            tail = newNode;
            return true;
        }

        newNode.next = head;

        head = newNode;

        return true;
    }

    public void display() {
        if (head == null) {
            System.out.println("empty list!!!");
        }

        if (head.next == null) {
            System.out.println(head.data);
        }

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insert(50);
        ll.insert(40);
        ll.insert(30);
        ll.insert(20);
        ll.insert(10);

        ll.display();

    }
}
