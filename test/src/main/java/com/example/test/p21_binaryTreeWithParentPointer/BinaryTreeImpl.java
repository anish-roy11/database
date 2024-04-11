package com.example.test.p21_binaryTreeWithParentPointer;

public class BinaryTreeImpl {

    public void createBinaryTree()
    {

        BinaryTree tree = new BinaryTree();

        // Create root
        TreeNode treeNode1 = new TreeNode(1);
        tree.root = treeNode1;


        /* Following is the tree after above statement
           1
          / \
        null null
        */

        TreeNode treeNode2 = new TreeNode(2);
        treeNode1.left = treeNode2;
        treeNode2.parent= treeNode1;
        //tree.root.left = node2;


        TreeNode treeNode3 = new TreeNode(3);
        treeNode1.right = treeNode3;
        treeNode3.parent= treeNode1;
        //tree.root.right = node3;



        /* 2 and 3 become left and right children of 1
              1
             / \
            2   3
           / \ / \
       null null null null */

        TreeNode treeNode4 = new TreeNode(4);
        treeNode2.left = treeNode4;
        treeNode4.parent= treeNode2;


        TreeNode treeNode5 = new TreeNode(4);
        treeNode2.right = treeNode5;
        treeNode5.parent= treeNode2;

        /* 4 becomes left child of 2
               1
              /  \
             2    3
            / \  / \
           4  5 null null
          / \
        null null
        */
    }

    public void getMaxDepthOfBinaryTree()
    {
        BinaryTree tree = new BinaryTree();

        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);

        System.out.println("Height of tree is "
                + tree.maxDepth(tree.root));
    }



    public TreeNode createBinaryTreeRecursively(int depth) {
        if (depth < 0) {
            return null;
        }

        TreeNode root = new TreeNode(depth);
        root.left = createBinaryTreeRecursively(depth - 1);
        root.right = createBinaryTreeRecursively(depth - 1);

        return root;
    }



    public void printTree(TreeNode root) {
        if (root != null) {
            System.out.print(root.key + " ");
            printTree(root.left);
            printTree(root.right);
        }
    }

    public static void main(String[] args)
    {
        BinaryTreeImpl binaryTreeImpl_obj1 = new BinaryTreeImpl();
        binaryTreeImpl_obj1.createBinaryTree();
        binaryTreeImpl_obj1.getMaxDepthOfBinaryTree();



        int depth = 8;
        BinaryTreeImpl binaryTreeImpl_obj2 = new BinaryTreeImpl();
        TreeNode root = binaryTreeImpl_obj2.createBinaryTreeRecursively(depth);

        System.out.println("Binary Tree of Depth " + depth + ":");
        binaryTreeImpl_obj1.printTree(root);

    }
}
