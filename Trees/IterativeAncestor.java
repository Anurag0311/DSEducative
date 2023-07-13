package com.anurag.Trees;

/*
 * Find Ancestors of Given Node in Binary Search Tree
 INPUT:
 bst = {
        6 -> 4,9
    4 -> 2,5
    9 -> 8,12
    12 -> 10,14
}

				6
			   / \
			  4   9
			 / \  | \
			2	5 8	 12
					 / \
					10 14 
where parent -> leftChild,rightChild

k = 10

OUTPUT:
6,9,12,
 */

public class IterativeAncestor{
	// Iterative Function to print all ancestors of a given key 
		public static String findAncestors(Node root, int k) { 
			
			String result = ""; 
			Node tempNode = root; 
			while(tempNode != null && tempNode.getData() != k){ 
				result = result + tempNode.getData() + ","; 
				if(k <= tempNode.getData()){ 
					tempNode = tempNode.getLeftChild(); 
				} else{ 
					tempNode = tempNode.getRightChild(); 
				} 
			} 
			if(tempNode == null){ 
				return ""; 
			} 
			return result; 
		}

}
