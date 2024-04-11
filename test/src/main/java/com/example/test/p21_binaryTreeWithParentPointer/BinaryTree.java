package com.example.test.p21_binaryTreeWithParentPointer;

public class BinaryTree {

	// Root of Binary Tree
    TreeNode root; // root should point to a Node



    // Constructors
    BinaryTree(int key) 
    { 
    	root = new TreeNode(key);
    }
    
    
    
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
    

    
}
