package com.example.test.p13_binarySearchTree;

import java.util.logging.Logger;


public class BinarySearchTreeImpl {
	private static Logger logger = Logger.getLogger(BinarySearchTreeImpl.class.getName());

	public static void main(String[] args)
    {
        BinarySearchTree tree = new BinarySearchTree();
 
        /* Let us create following BST
              50
           /     \
          30      70
         /  \    /  \
       20   40  60   80 */
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
 
        logger.info("Inorder traversal of the given tree:");
        logger.info("   ");
        logger.info("   ");
        logger.info("   ");
        // print inorder traversal of the BST
        tree.inorder();
        
        logger.info("Inorder traversal of the given tree:");
        
            tree.inorder();
      
            //System.out.println("\nDelete 20");
            logger.info("\nDelete 40");
            tree.deleteKey(40);
            
            logger.info("\nInorder traversal of the modified tree");
            //System.out.println("Inorder traversal of the modified tree");
            tree.inorder();
      
            logger.info("\nDelete 30");
            tree.deleteKey(30);
            logger.info( "\nInorder traversal of the modified tree");
            tree.inorder();
      
            logger.info("\nDelete 50");
            tree.deleteKey(50);
            logger.info("\nInorder traversal of the modified tree");
            tree.inorder();
            
            
            
            int minValue = tree.findMinimum();
            logger.info("Minimum value of tree="+minValue);
            
            
            
            int maxValue = tree.findMaximum();
            logger.info("Maximum value of tree="+maxValue);
            
            
            
            boolean isPresent = tree.search(60);
            logger.info("60 is present="+isPresent);
            
            isPresent = tree.search(777);
            logger.info("777 is present="+isPresent);
    }
}



