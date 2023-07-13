package com.anurag.HashTable;

import java.util.HashSet;

import com.anurag.LinkedList.SinglyLinkedList;

//Remove Duplicate from a Linked List Using Hashing

public class RemoveDuplicatesChallenge {

	 public static <V> void removeDuplicatesWithHashing(SinglyLinkedList<V> list) {
	        SinglyLinkedList<V>.Node current = list.headNode;
	        SinglyLinkedList<V>.Node prevNode = list.headNode;
	        //will store all the elements that we observe once
	        HashSet<V> visitedNodes = new HashSet<V>();

	        if (!list.isEmpty() && current.nextNode != null) {
	            while (current != null) {
	                //check if already visited then delete this node
	                if (visitedNodes.contains(current.data)) {
	                    //deleting the node by undating the pointer of previous node
	                    prevNode.nextNode = current.nextNode;
	                    current = current.nextNode;
	                } else {
	                    //if node was not already visited then add it to the visited set
	                    visitedNodes.add(current.data);
	                    //moving on to next element in the list
	                    prevNode = current;
	                    current = current.nextNode;
	                }
	            }
	        }
	    }
}
