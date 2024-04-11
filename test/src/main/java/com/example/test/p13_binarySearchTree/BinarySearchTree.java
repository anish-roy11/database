package com.example.test.p13_binarySearchTree;

import java.util.logging.Logger;

public class BinarySearchTree {
	private static Logger logger = Logger.getLogger(BinarySearchTree.class.getName());

	// Root of BST
	Node root;

	
	
	
	
	
	// Constructor
	public BinarySearchTree() {
		root = null;
	}
	
	
	
	
	

	public BinarySearchTree(int value) {
		root = new Node(value);
	}
	
	
	
	
	

	// This method mainly calls insertRec()
	public void insert(int key) {
		logger.info("log entry: insert method");
		root = insertRec(root, key);

		logger.info("log exit: insert method");
	}

	
	
	
	
	
	/*
	 * A recursive function to insert a new key in BST
	 */
	public Node insertRec(Node root, int key) {
		// logger.info("log entry: insertRec method");

		/*
		 * If the tree is empty, return a new node
		 */
		if (root == null) {
			root = new Node(key);
			return root;
		}

		/* Otherwise, recur down the tree */
		else if (key < root.key)
			root.left = insertRec(root.left, key);
		else if (key > root.key)
			root.right = insertRec(root.right, key);

		// logger.info("log exit: insertRec method");
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
	public void inorderRec(Node root) {
		// logger.info("log entry: inorderRec method");
		if (root != null) {
			inorderRec(root.left);
			// System.out.println(root.key);
			logger.info("" + root.key);
			inorderRec(root.right);
			// logger.info("log exit: inorderRec method");
		}
	}

	
	
	
	
	
	
	
	
	void deleteKey(int key) {
		logger.info("log entry: deleteKey method");
		root = deleteRec(root, key);
		logger.info("log exit: deleteKey method");
	}
	
	
	
	
	

	/*
	 * A recursive function to delete an existing key in BST
	 */
	Node deleteRec(Node root, int key) {
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

	
	
	
	
	
	
	int minValue(Node root) {
		int minv = root.key;
		while (root.left != null) {
			minv = root.left.key;
			root = root.left;
		}
		return minv;
	}

	
	
	
	
	
	public int findMinimum() {
        if(root==null){
            return -1;
        }
        // processing the left sub tree
        Node current = this.root;
        while (current.left != null) {
            current = current.left;
        }
        return (current.key);
    }
	
	
	
	
	
	
	
	
	public int findMaximum() {
        if(root==null){
            return -1;
        }
        // processing the left sub tree
        Node current = this.root;
        while (current.right != null) {
            current = current.right;
        }
        return (current.key);
    }
	
	
	
	
	
	
	
	
	
	
	
	public boolean search(int data) {
        return searchRec(this.root, data);
    }

	
	
	
	
	
	
	public boolean searchRec(Node root, int data) {
        if (root == null) {
            return false;
        } else if (root.key == data) {
            return true;
        } else if (root.key > data) {
            return searchRec(root.left, data);
        }
        return searchRec(root.right, data);
    }

}
