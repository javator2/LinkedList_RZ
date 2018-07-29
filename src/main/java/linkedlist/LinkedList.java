package linkedlist;

public class LinkedList {

    private static Node head;
    private static Node last;
    private static int size;

    public LinkedList(Object data) {
        head = new Node(data);
        last = head;
        size ++;
    }

    public int getSize() {
        return size;
    }

    public void add(Object data) {
        Node copy = head;
        head = new Node(data);
        copy.prev = head;
        head.next = copy;
        size ++;
    }

    public void addTail(Object data) {
        Node copy = last;
        last = new Node(data);
        last.prev = copy;
        copy.next = last;
        size ++;
    }

    public Object get(int index) {
        if(index < 0 || index >= size) {}

        Node node = head;
        int counter = 0;
        while((counter ++) != index) {
            node = node.next;
        }
        return node.getData();
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
        private Node prev;

        Node(Object data) {
            this.data = data;
        }

        Object getData() {
            return this.data;
        }
    }
}
