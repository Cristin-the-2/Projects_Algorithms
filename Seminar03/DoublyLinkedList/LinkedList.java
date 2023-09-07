package Seminar03.DoublyLinkedList;

public class LinkedList {
    Node head;
    Node tail;

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    public boolean isEmpty() {
        if (this.head != null) {
            return true;
        } else {
            return false;
        }
    }

    public void appendFirst(int value) {
        Node newNode = new Node(value);
        newNode.next = this.head;
        if (this.isEmpty()) {
            this.head.prev = newNode;
        } else {
            this.tail = newNode;
        }
        this.head = newNode;
    }

    public void appendLast(int value) {
        Node newNode = new Node(value);
        newNode.prev = this.tail;
        if (this.isEmpty()) {
            this.tail.next = newNode;
        } else {
            this.head = newNode;
        }
        this.tail = newNode;
    }

    public void deleteFirst() {
        if (this.isEmpty() & this.head.next != null) {
            this.head = this.head.next;
            this.head.prev = null;
        } else {
            this.head = null;
            this.tail = null;
        }
    }

    public void deleteLast() {
        if (this.isEmpty() & this.tail.prev != null) {
            this.tail = this.tail.prev;
            this.tail.next = null;
        } else {
            this.head = null;
            this.tail = null;
        }
    }

    public boolean findValue(int value) {
        Node current = this.head;
        while (current != null) {
            if (current.value == value) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void printList() {
        Node current = this.head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void bubbleSort() {
        boolean needSort = true;
        while (needSort) {
            needSort = false;
            Node current = this.head;
            while(current.next != null & current != null){
                if (current.value > current.next.value) {
                    int temp = current.value;
                    current.value = current.next.value;
                    current.next.value = temp;
                    needSort = true;
                }
                current = current.next;
            }
        }
    }
}
