package com.example.test.p42_binaryTree;

public class BinaryTreeImpl {

    public static void main(String[] args) {
        // Creating a binary tree
        BinaryTree binaryTreeObj1 = new BinaryTree();

        binaryTreeObj1.root = new TreeNode(1);
        binaryTreeObj1.root.left = new TreeNode(2);
        binaryTreeObj1.root.right = new TreeNode(3);
        binaryTreeObj1.root.left.left = new TreeNode(4);
        binaryTreeObj1.root.left.right = new TreeNode(5);
        binaryTreeObj1.root.right.left = new TreeNode(6);
        binaryTreeObj1.root.right.right = new TreeNode(7);



        System.out.println("Breadth-First Search for the binary tree:");
        binaryTreeObj1.bfs(binaryTreeObj1.root);

        System.out.print("\n");




        //create 2nd binary tree
        int depth = 1;
        BinaryTree binaryTreeObj2 = new BinaryTree();
        binaryTreeObj2.root = binaryTreeObj2.createBinaryTreeRecursively(depth);

        System.out.print("\n");
        System.out.println("Printing Binary Tree of Depth " + depth + ":");
        binaryTreeObj2.printTree(binaryTreeObj2.root);







        int depth3 = 2;
        BinaryTree binaryTreeObj3 = new BinaryTree();
        binaryTreeObj3.root = binaryTreeObj3.createBinaryTreeRecursively(depth3);

        System.out.print("\n");
        System.out.println("Printing Binary Tree of Depth " + depth3 + ":");
        binaryTreeObj3.printTree(binaryTreeObj3.root);








        int depth4 = 3;
        BinaryTree binaryTreeObj4 = new BinaryTree();
        binaryTreeObj4.root = binaryTreeObj4.createBinaryTreeRecursively(depth4);

        System.out.print("\n");
        System.out.println("Printing Binary Tree of Depth " + depth4 + ":");
        binaryTreeObj4.printTree(binaryTreeObj4.root);











        int depth5 = 4;
        BinaryTree binaryTreeObj5 = new BinaryTree();
        binaryTreeObj5.root = binaryTreeObj5.createBinaryTreeRecursively(depth5);

        System.out.print("\n");
        System.out.println("Printing Binary Tree of Depth " + depth5 + ":");
        binaryTreeObj5.printTree(binaryTreeObj5.root);


        System.out.println("\nBreadth-First Search for the binaryTreeObj5:\n");
        binaryTreeObj5.bfs(binaryTreeObj5.root);



    }
}
