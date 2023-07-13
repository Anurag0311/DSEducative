package com.anurag.LinkedList;

//Remove Duplicates From the Linked List

public class RemoveDuplicatesChallenge {

	public static <T> void removeDuplicates(SinglyLinkedList<T> list) {
		SinglyLinkedList<T>.Node current = list.headNode; // will be used for outer loop
        SinglyLinkedList<T>.Node compare = null;     // will be used for inner loop

        while (current != null && current.nextNode != null) {
            compare = current;
            while (compare.nextNode != null) {
                if (current.data.equals(compare.nextNode.data)) { //check if duplicate
                    compare.nextNode = compare.nextNode.nextNode;
                } else {
                    compare = compare.nextNode;
                }
            }
            current = current.nextNode;
		}
		
	}
	
	
}
