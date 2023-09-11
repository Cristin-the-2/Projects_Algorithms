package Seminar04.RedBlackTree;

import java.util.ArrayList;
import java.util.List;

public class RedBlackTree {
    private Node root;

    public boolean containsWhile(int value) {
        Node node = root;
        while (node != null) {
            if (node.value == value) {
                return true;
            }
            if (node.value > value) {
                node = node.leftChild;
            } else {
                node = node.rightChild;
            }
        }
        return false;
    }

    public boolean contains(int value){
        if (root == null) {
            return false;
        }
        return contains(root, value);
    }

    private boolean contains(Node node, int value){
        if (node.value == value) {
            return true;
        } else {
            if (node.value > value) {
                return contains(node.leftChild, value);
            } else {
                return contains(node.rightChild, value);
            }
        }
    }

    public boolean add(int value) {
        if (root != null) {
            boolean result = addNote(root, value);
            root = rebalance(root);
            root.color = Color.BLACK;
            return result;
        } else {
            root = new Node(Color.BLACK, value);
            return true;
        }
    }

    private boolean addNote(Node node, int value) {
        if (node.value == value) {
            return false;
        } else {
            if (node.value > value) {
                if (node.leftChild != null) {
                    boolean result = addNote(node.leftChild, value);
                    node.leftChild = rebalance(node.leftChild);
                    return result;
                } else {
                    node.leftChild = new Node(Color.RED, value);
                    return true;
                }
            } else {
                if (node.rightChild != null) {
                    boolean result = addNote(node.rightChild, value);
                    node.rightChild = rebalance(node.rightChild);
                    return result;
                } else {
                    node.rightChild = new Node(Color.RED, value);
                    return true;
                }
            }
        }
    }

    private Node rebalance(Node node) {
        Node result = node;
        boolean needRebalance;
        do {
            needRebalance = false;
            if (result.rightChild != null && result.rightChild.color == Color.RED &&
                    (result.leftChild == null || result.leftChild.color == Color.BLACK)) {
                needRebalance = true;
                result = rightSwap(result);
            }
            if (result.leftChild != null && result.leftChild.color == Color.RED &&
                    result.leftChild.leftChild != null && result.leftChild.leftChild.color == Color.RED) {
                needRebalance = true;
                result = leftSwap(result);
            }
            if (result.leftChild != null && result.leftChild.color == Color.RED &&
                    result.rightChild != null && result.rightChild.color == Color.RED) {
                needRebalance = true;
                colorSwap(result);
            }
        } while (needRebalance);
        return result;
    }

    private Node rightSwap(Node node) {
        Node rightChild = node.rightChild;
        Node betweenChild = rightChild.leftChild;
        rightChild.leftChild = node;
        node.rightChild = betweenChild;
        rightChild.color = node.color;
        node.color = Color.RED;
        return rightChild;
    }

    private Node leftSwap(Node node) {
        Node leftChild = node.leftChild;
        Node betweenChild = leftChild.rightChild;
        leftChild.rightChild = node;
        node.leftChild = betweenChild;
        leftChild.color = node.color;
        node.color = Color.RED;
        return leftChild;
    }

    private void colorSwap(Node node) {
        node.rightChild.color = Color.BLACK;
        node.leftChild.color = Color.BLACK;
        node.color = Color.RED;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        List<Node> nodes = new ArrayList<>();
        nodes.add(root);
        while (!nodes.isEmpty()) {
            List<Node> children = new ArrayList<>();
            for (Node node : nodes) {
                sb.append(node.toString());
                if (node.leftChild != null) {
                    children.add(node.leftChild);
                }
                if (node.rightChild != null) {
                    children.add(node.rightChild);
                }
            }
            nodes = children;
            sb.append("\n");
        }
        return sb.toString();
    }
}
