package com.anurag.Trees;

//Find the Minimum Value in a Binary Search Tree

public class CheckMin {

	//ITERATIVE
	public static int findMin(Node root) {
        
        if (root == null)
            return -1;
        // In Binary Search Tree, all values in current node's left subtree are smaller 
        // than the current node's value.
        // So keep traversing (in order) towards left till you reach leaf node, and then return leaf node's value
        while (root.getLeftChild() != null) {
            root = root.getLeftChild();
        }
        return root.getData();
    }

	//RECURSIVE
	public static int findMinRec(Node root) {
        // So keep traversing (in order) towards left till you reach leaf node,
        //and then return leaf node's value
        if (root == null)
            return -1;
        else if (root.getLeftChild() == null)
            return root.getData();
        else
            return findMin(root.getLeftChild());

    }


}
