package Seminar03.DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.appendFirst(1);
        list.appendFirst(2);
        list.appendFirst(3);
        list.appendFirst(4);
        list.appendFirst(5);
        list.appendFirst(6);
        list.appendFirst(7);
        list.printList();
        list.deleteFirst();
        list.printList();
        list.appendLast(0);
        list.appendLast(-1);
        list.printList();
        list.deleteLast();
        list.printList();
        list.bubbleSort();
        list.printList();
    }
}
