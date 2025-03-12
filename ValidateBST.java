package DFS;

public class ValidateBST {

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
    static boolean validateBST(Node node , int min, int max)
    {
        if( node == null)
            return  true;
        if(node.data < min || node.data> max)
            return  false;

        return validateBST(node.left,min,node.data - 1) &&
                validateBST(node.right,node.data+ 1 , max);

    }
    static boolean isBST(Node root)
    {
        if(root == null)
            return true;

        return validateBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }


    public static void main(String[] args)
    {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(20);
        root.right.left = new Node(9);
        root.right.right = new Node(25);

        if (isBST(root)) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}
