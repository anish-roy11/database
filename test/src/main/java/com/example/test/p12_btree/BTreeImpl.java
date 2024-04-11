package com.example.test.p12_btree;

import java.util.logging.Logger;

public class BTreeImpl {
	private static Logger logger = Logger.getLogger(BTreeImpl.class.getName());


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BTree t = new BTree(3); // A B-Tree with minimum degree 3
	    t.insert(10);
	    t.insert(20);
	    t.insert(5);
	    t.insert(6);
	    t.insert(12);
	    t.insert(30);
	    t.insert(7);
	    t.insert(17);
	    
	    t.insert(120);
	    t.insert(110);
	    t.insert(150);
	    t.insert(170);
	    t.insert(180);
	    t.insert(130);
	    t.insert(150);
	    t.insert(200);
	    t.insert(190);
	    t.insert(140);
	 
	    String cout = "Traversal of the constructed tree is: ";
	    logger.info("cout=" + cout);
	    t.traverse();
	 
	    int k = 6;
	    if(t.search(k) != null)
	    {
	    	cout = "\nPresent";
	    }
	    else
	    {
	    	cout = "\nNot Present";
	    	
	    }
	    
	    logger.info(k + "=" + cout);
	    
	   // (t.search(k) != null)? cout = "\nPresent" : cout = "\nNot Present";
	 
	    k = 15;
	    if(t.search(k) != null)
	    {
	    	cout = "\nPresent";
	    }
	    else
	    {
	    	cout = "\nNot Present";
	    	
	    }
	    //(t.search(k) != null)? cout << "\nPresent" : cout << "\nNot Present";
	 
	//    return 0;

	    logger.info(k + "=" + cout);
	}

}
