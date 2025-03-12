package DFS;

public class Symmetrictree {
    static class Node{
        int data;
      Node left;
       Node right;

        Node(int key )
        {
            this.data = key;
            this.left = null;
            this.right = null;
        }
    }

    static boolean isSymmetric(Node leftSub , Node rightSub)
    {
        if(leftSub == null && rightSub == null)
            return true;

        if(leftSub == null || rightSub == null
         || rightSub.data != leftSub.data)
            return false;

        return isSymmetric(leftSub.left,rightSub.right) &&
                isSymmetric(rightSub.right,leftSub.left);
    }
    static boolean isBTSymetric(Node root)
    {
        if (root == null)
          return   true;

         return isSymmetric(root.left,root.right);
    }
    public static void main(String[] args)
    {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(2);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(4);
        root.right.right = new Node(3);

        if (isBTSymetric(root)) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}
