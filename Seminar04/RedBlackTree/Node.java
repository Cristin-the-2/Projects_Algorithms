package Seminar04.RedBlackTree;

public class Node {
    public Integer value;
    public Color color;
    public Node leftChild;
    public Node rightChild;

    public Node(Color color, int value) {
        this.color = color;
        this.value = value;
        this.leftChild = null;
        this.rightChild = null;
    }

    @Override
    public String toString() {
        return "Node {" + "value = " + value + ", color = " + color + "} ";
    }

}