package Seminar03.SinglyLinkedList;

public class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    public boolean isEmpty() {
        if (this.head != null) {
            return true;
        } else {
            return false;
        }
    }

    public void appendFirst(int value){
        Node newNode = new Node(value);
        newNode.next = this.head;
        this.head = newNode;
    }

    public void appendLast(int value){
        Node current = this.head;
        Node newNode = new Node(value);
        while (current != null) {
            if (current.next == null) {
                current.next = newNode;
                break;
            }
            current = current.next;
        }
    }

    public void deleteFirst(){
        if (this.isEmpty()){
            this.head = this.head.next;
        }
    }

    public void deleteLast(){
        Node current = this.head;
        if (this.isEmpty()) {
            while (current.next != null) {
                if (current.next.next == null) {
                    current.next = null;
                    break;
                }
                current = current.next;
            }
            this.head = null;
        }
    }

    public boolean findValue(int value){
        Node current = this.head;
        while (current != null) {
            if (current.value == value) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void printList(){
        Node current = this.head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }
}
