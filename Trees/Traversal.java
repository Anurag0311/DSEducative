package com.anurag.Trees;

public class Traversal {

	
	//PreOrder Traversal
	public static void preTraverse(Node root) {

		if (root == null) return;

		System.out.print(root.getData() + ",");
    preTraverse(root.getLeftChild());
    preTraverse(root.getRightChild());

	}
	
	//Inorder Traversal
	public static void inTraverse(Node root) {

		if (root == null) return;

		inTraverse(root.getLeftChild());
		System.out.print(root.getData() + ",");
		inTraverse(root.getRightChild());

	}

	//Postorder Traversal
	public static void postTraverse(Node root) {

		if (root == null) return;

		postTraverse(root.getLeftChild());
		postTraverse(root.getRightChild());
		System.out.print(root.getData() + ",");

	}

	
}
