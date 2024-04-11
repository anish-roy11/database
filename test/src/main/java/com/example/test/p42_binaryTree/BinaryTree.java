package com.example.test.p42_binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

	// Root of Binary Tree
    TreeNode root; // root should point to a Node



    // Constructor 1
    BinaryTree(int key) 
    { 
    	root = new TreeNode(key);
    }


    // Constructor 2
    BinaryTree() 
    { 
    	root = null; 
    }



    int maxDepth(TreeNode treeNode)
    {
        if (treeNode == null) {
            return 0;
        }
        else
        {
            /* compute the depth of each subtree */
            int lDepth = maxDepth(treeNode.left);
            int rDepth = maxDepth(treeNode.right);

            /* use the larger one */
            if (lDepth > rDepth) {
                return (lDepth + 1);
            }
            else
            {
                return (rDepth + 1);
            }
        }
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

    public  void bfs(TreeNode root) {
        if (root == null) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root); //similar to queue.add(root)

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            System.out.print(current.key + " ");

            if (current.left != null) {
                queue.add(current.left);
            }

            if (current.right != null) {
                queue.add(current.right);
            }
        }
    }
    

    
}
