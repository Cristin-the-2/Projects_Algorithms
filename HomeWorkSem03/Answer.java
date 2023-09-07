package HomeWorkSem03;

public class Answer {
    Node head;

    public void reverse() {
        Node prevNode = null;

        while (head != null) {
            Node next = head.next;
            head.next = prevNode;
            prevNode = head;
            head = next;
        }
        head = prevNode;
    }
}
