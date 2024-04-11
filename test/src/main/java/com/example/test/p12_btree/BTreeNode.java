package com.example.test.p12_btree;

import java.util.logging.Logger;



public class BTreeNode {
	
	private static Logger logger = Logger.getLogger(BTreeNode.class.getName());


    int[] keys; // An array of keys
    int t; // Minimum degree (defines the range for number of keys)
    BTreeNode[] child; // An array of child nodes
    int noOfKeys; // Current number of keys
    boolean leaf; // Is true when node is leaf. Otherwise false
 
    
    
    
    
    
    // Constructor
    BTreeNode(int t, boolean leaf) {
        this.t = t;
        this.leaf = leaf;
        this.keys = new int[2 * t - 1];
        this.child = new BTreeNode[2 * t];
        this.noOfKeys = 0;
    }
 
    
    
    
    
    
    
    
    
    
    
    // A function to traverse all nodes in a subtree rooted with this node
    public void traverse() {
 
        // There are n keys and n+1 children, traverse through n keys
        // and first n children
        int i = 0;
        for (i = 0; i < this.noOfKeys; i++) {
 
            // If this is not leaf, then before printing key[i],
            // traverse the subtree rooted with child C[i].
            if (this.leaf == false) {
            	child[i].traverse();
            }
            System.out.print(keys[i] + " ");
        }
 
        // Print the subtree rooted with last child
        if (leaf == false)
        	child[i].traverse();
    }
 
    
    
    
    
    
    
    
    
    
    
    
    // A function to search a key in the subtree rooted with this node.
    BTreeNode search(int k) { // returns NULL if k is not present.
 
        // Find the first key greater than or equal to k
        int i = 0;
        while (i < noOfKeys && k > keys[i])
        {
        	i++;
        }
            
 
        // If the found key is equal to k, return this node
        if (keys[i] == k)
        {
        	return this;
        }
            
 
        // If the key is not found here and this is a leaf node
        if (leaf == true)
        {
        	return null;
        }
            
 
        // Go to the appropriate child
        return child[i].search(k);
 
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    void insertNonFull(int k)
    {
        // Initialize index as index of rightmost element
        int i = noOfKeys-1;
     
        // If this is a leaf node
        if (leaf == true)
        {
            // The following loop does two things
            // a) Finds the location of new key to be inserted
            // b) Moves all greater keys to one place ahead
            while (i >= 0 && keys[i] > k)
            {
                keys[i+1] = keys[i];
                i--;
            }
     
            // Insert the new key at found location
            keys[i+1] = k;
            noOfKeys = noOfKeys+1;
        }
        else // If this node is not leaf
        {
            // Find the child which is going to have the new key
            while (i >= 0 && keys[i] > k)
            {
            	i--;
            }
                
     
            // See if the found child is full
            if (child[i+1].noOfKeys == 2*t-1)
            {
                // If the child is full, then split it
                splitChild(i+1, child[i+1]);
     
                // After split, the middle key of C[i] goes up and
                // C[i] is splitted into two.  See which of the two
                // is going to have the new key
                if (keys[i+1] < k)
                {
                	i++;
                }
                    
            }
            child[i+1].insertNonFull(k);
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    void splitChild(int i, BTreeNode y)
    {
        // Create a new node which is going to store (t-1) keys
        // of y
        BTreeNode z = new BTreeNode(y.t, y.leaf);
        z.noOfKeys = t - 1;
     
        // Copy the last (t-1) keys of y to z
        for (int j = 0; j < t-1; j++)
        {
        	z.keys[j] = y.keys[j+t];
        }
            
     
        // Copy the last t children of y to z
        if (y.leaf == false)
        {
            for (int j = 0; j < t; j++)
            {
            	z.child[j] = y.child[j+t];
            }
                
        }
     
        // Reduce the number of keys in y
        y.noOfKeys = t - 1;
     
        // Since this node is going to have a new child,
        // create space of new child
        for (int j = noOfKeys; j >= i+1; j--)
        	child[j+1] = child[j];
     
        // Link the new child to this node
        child[i+1] = z;
     
        // A key of y will move to this node. Find the location of
        // new key and move all greater keys one space ahead
        for (int j = noOfKeys-1; j >= i; j--)
        {
        	keys[j+1] = keys[j];
        }
            
     
        // Copy the middle key of y to this node
        keys[i] = y.keys[t-1];
     
        // Increment count of keys in this node
        noOfKeys = noOfKeys + 1;
    }
    
}
