package Seminar04.RedBlackTree;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        final RedBlackTree tree = new RedBlackTree();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                try {
                    System.out.print("--> ");
                    int value = Integer.parseInt(reader.readLine());
                    tree.add(value);
                    System.out.println(tree.toString());
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
