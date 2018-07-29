package linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList lista = new LinkedList(2);
        for(int i = 0; i < 100; i ++)
        lista.addTail(i);

        LinkedList.printList();
    }
}
