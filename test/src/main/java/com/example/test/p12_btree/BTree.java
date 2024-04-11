package com.example.test.p12_btree;

import java.util.logging.Logger;

public class BTree {

	private static Logger logger = Logger.getLogger(BTree.class.getName());

    public BTreeNode root; // Pointer to root node
    public int t; // Minimum degree
 
    
    
    
    
    
    // Constructor (Initializes tree as empty)
    BTree(int t) {
        this.root = null;
        this.t = t;
    }
 
    
    
    
    // function to traverse the tree
    public void traverse() {
    	 if (this.root != null)
         {
         	this.root.traverse();
         }
        System.out.println();
    }
 
    
    
    
    
    // function to search a key in this tree
    public BTreeNode search(int k) {
        if (this.root == null)
        {
        	return null;
        }
            
        else
        {
        	 return this.root.search(k);
        }
           
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    void insert(int k)
    {
        // If tree is empty
        if (root == null)
        {
            // Allocate memory for root
            root = new BTreeNode(t, true);
            root.keys[0] = k;  // Insert key
            root.noOfKeys = 1;  // Update number of keys in root
        }
        else // If tree is not empty
        {
            // If root is full, then tree grows in height
            if (root.noOfKeys == 2*t-1)
            {
                // Allocate memory for new root
                BTreeNode s = new BTreeNode(t, false);
     
                // Make old root as child of new root
                s.child[0] = root;
     
                // Split the old root and move 1 key to the new root
                s.splitChild(0, root);
     
                // New root has two children now.  Decide which of the
                // two children is going to have new key
                int i = 0;
                if (s.keys[0] < k)
                {
                	i++;
                }
                    
                s.child[i].insertNonFull(k);
     
                // Change root
                root = s;
            }
            else  // If root is not full, call insertNonFull for root
            {
            	root.insertNonFull(k);
            }
                
        }
    }
}
