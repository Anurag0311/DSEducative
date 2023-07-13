package com.anurag.LinkedList;

//Reverse The Linked List

public class CheckReverse {

	public static <T> void reverse(SinglyLinkedList<T> list) {
		SinglyLinkedList<T>.Node curr=list.headNode;//traverse through all elements
		SinglyLinkedList<T>.Node next=list.headNode.nextNode;//used to help curr traverse through along with reversing the list
		SinglyLinkedList<T>.Node prev=null;//used to change the nextNode pointer of node to its previous Node
		while(curr != null) {
			next=curr.nextNode;
			curr.nextNode=prev;
			prev=curr;
			curr=next;
		}
		list.headNode=prev;
	}
}