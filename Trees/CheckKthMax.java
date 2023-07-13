package com.anurag.Trees;

//Find kth Maximum Value in a Binary Search Tree

public class CheckKthMax {

	public static StringBuilder inOrderTraversal(Node root,StringBuilder result){

		 if (root.getLeftChild() != null){
		   inOrderTraversal(root.getLeftChild(), result);
	  }
   result.append(root.getData() + ",");

   if (root.getRightChild() != null){
		inOrderTraversal(root.getRightChild(), result);
	}
   return result;
	}

	
	public static int findKthMax(Node root, int k) {
	 //Perform In-Order Traversal to get sorted array. (ascending order)
   //Return value at index [length - k]
   StringBuilder result = new StringBuilder(); //StringBuilder is mutable
   result = inOrderTraversal(root, result);

   String[] array = result.toString().split(","); //Spliting String into array of strings
   if ((array.length - k) >= 0){
		return Integer.parseInt(array[array.length - k]);
	}
   return - 1;
	}

}
