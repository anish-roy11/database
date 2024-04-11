package com.example.test.bst.dto;

import com.example.test.bst.controller.BinarySearchTreeController;

import java.util.logging.Logger;

public class BinarySearchTree {

    private static final Logger logger = Logger.getLogger(BinarySearchTree.class.getName());

    // Root of BST
    Node root;



    // Constructor
    public BinarySearchTree() {
        root = null;
    }



    // Constructor2
    public BinarySearchTree(int value) {
        root = new Node(value);
    }




    // This method mainly calls insertRec()
    public void insert(int key) {
        root = insertRec(root, key);
    }




    /* A recursive function to
       insert a new key in BST */
    public Node insertRec(Node root, int key)
    {

        /* If the tree is empty,
           return a new node */
        if (root == null) {
            root = new Node(key);
            return root;
        }

        /* Otherwise, recur down the tree */
        else if (key < root.key) {
            root.left = insertRec(root.left, key);
        }
        else if (key > root.key) {
            root.right = insertRec(root.right, key);
        }

        /* return the (unchanged) node pointer */
        return root;
    }







    // This method mainly calls InorderRec()
    public void inorder() {
        logger.info("log entry: inorder method");
        inorderRec(root);
        logger.info("log exit: inorder method");
    }

    // A utility function to
    // do inorder traversal of BST
    public void inorderRec(Node root)
    {
        if (root != null) {
            inorderRec(root.left);

            logger.info(""+root.key);
            inorderRec(root.right);
        }
    }







    // This method mainly calls deleteRec()
    public void deleteKey(int key) {
        logger.info("log entry: deleteKey method");
        root = deleteRec(root, key);
    }









    /* A recursive function to
      delete an existing key in BST
     */
    public Node deleteRec(Node root, int key)
    {
        /* Base Case: If the tree is empty */
        if (root == null)
            return root;

        /* Otherwise, recur down the tree */
        if (key < root.key)
            root.left = deleteRec(root.left, key);
        else if (key > root.key)
            root.right = deleteRec(root.right, key);

            // if key is same as root's
            // key, then This is the
            // node to be deleted
        else {
            // node with only one child or no child
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            // node with two children: Get the inorder
            // successor (smallest in the right subtree)
            root.key = minValue(root.right);

            // Delete the inorder successor
            root.right = deleteRec(root.right, root.key);
        }

        return root;
    }






    public int minValue(Node root)
    {
        int minv = root.key;
        while (root.left != null)
        {
            minv = root.left.key;
            root = root.left;
        }
        return minv;
    }








    public boolean search(int key)  {
        root = search_Recursive(root, key);
        if (root!= null)
        {
            logger.info(key +" is present in BST");
            return true;
        }

        else
        {
            logger.info(key +" is not present in BST");
            return false;
        }

    }





    //recursive insert function
    public Node search_Recursive(Node root, int key)  {
        // Base Cases: root is null or key is present at root
        if (root==null || root.key==key)
        {
            return root;
        }

        // val is greater than root's key
        if (root.key > key)
        {
            return search_Recursive(root.left, key);
        }

        // val is less than root's key
        return search_Recursive(root.right, key);
    }



}