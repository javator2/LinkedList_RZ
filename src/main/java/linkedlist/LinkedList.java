package linkedlist;

public class LinkedList {

    private static Node head;
    private static Node last;
    private static int size;

    public LinkedList(Object data) {
        head = new Node(data);
        last = head;
    }

    public void add(Object data) {
        Node copy = head;
        head = new Node(data);
        head.next = copy;
        size ++;
    }

    public void addTail(Object data) {
        Node copy = last;
        last = new Node(data);
        copy.next = last;
        size ++;
    }

    public static void printList() {
        Node temp = head;

        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    class Node {
        private Object data;
        private Node next;

        Node(Object data) {
            this.data = data;
        }

        Object getData() {
            return this.data;
        }
    }
}
