package DFS;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class InvertTree {

    static class Node{
        int  data;
        Node left;
        Node right;

        Node (int key)
        {
            this.data = key;
            this.left = null;
            this.right = null;
        }
    }

    static void invert(Node root)
    {
        if (root == null)
            return;

        invert(root.left);
        invert(root.right);

        Node temp = root.left;
        root.left = root.right;
        root.right = temp;

    }

    static void levelOrder(Node root)
    {
        if (root == null)
            System.out.println("EMpty tree");

        Queue<Node> q = new LinkedList<>();
        LinkedList<LinkedList<Integer>> res = new LinkedList<>();

        q.offer(root);

        while (!q.isEmpty())
        {
            int len = q.size();
            res.add(new LinkedList<>());

                Node curr = q.poll();
                if (curr == null) {
                    System.out.print("N ");
                    continue;
                }
                System.out.print(curr.data + " ");
                q.add(curr.left);
                q.add(curr.right);

        }

    }


    public static void main(String[] args)
    {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

    invert(root);
     levelOrder(root);


    }
}
