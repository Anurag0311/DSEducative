package com.anurag.Trees;

public class CheckHeight {

	public static int findHeight(Node root) {
	    //Base case, leaf nodes have 0 height
	    if (root == null) return -1;
	    else {
	      return 1 + Math.max(findHeight(root.getLeftChild()),findHeight(root.getRightChild()));
	      // Find Height of left subtree right subtree
	      // Return greater height value of left or right subtree (plus 1)
	    }
	  }
	
}
