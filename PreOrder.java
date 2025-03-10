package DFS;

import java.util.LinkedList;

public class PreOrder {

    static class Node {
        int data;
        Node left, right;

        // Constructor to initialize a new node
        Node(int value) {
            data = value;
            left = null;
            right = null;
        }
    }

    static void printPreorder(Node node) {
        if (node == null)
            return;
        System.out.println(node.data);
        printPreorder(node.left);
        printPreorder(node.right);
    }

    public static void main(String[] args) {
        Node root = new Node(100);
        root.left = new Node(20);
        root.right = new Node(200);
        root.left.left = new Node(10);
        root.left.right = new Node(30);
        root.right.left = new Node(150);
        root.right.right = new Node(300);
        printPreorder(root);
    }
}
