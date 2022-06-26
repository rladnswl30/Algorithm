package HackerRank;

import java.util.Scanner;

public class HeightOfABinaryTree {
    public static void main(String[] args) {
        // sample STDIN, STDOUT by Scanner
        //        Scanner scanner = new Scanner(System.in);
        //        String myString = scanner.next();
        //        int myInt = scanner.nextInt();
        //        scanner.close();
        //
        //        System.out.println("myString is : " + myString);
        //        System.out.println("myInt is : " + myInt);

        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while (t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        int height = height(root);
        System.out.println(height);
    }

    public static int height(Node root) {
        int leftHeight = 0;
        int rightHeight = 0;

        if (root.left != null) {
            leftHeight = 1 + height(root.left);
        }

        if (root.right != null) {
            rightHeight = 1 + height(root.right);
        }

        return Math.max(leftHeight, rightHeight);
    }

    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }
}
