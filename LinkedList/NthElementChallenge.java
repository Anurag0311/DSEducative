package com.anurag.LinkedList;

//Return the Nth Node from End

public class NthElementChallenge {

	public static <T> Object nthElementFromEnd(SinglyLinkedList<T> list, int n) {
        // Write -- Your -- Code

        int toCount = list.size - n + 1;

        if(toCount > list.size || list.size == 0)
            return null;

        SinglyLinkedList<T>.Node curr = list.headNode;
        int count =1;

        while(curr != null){
            if(toCount == count)
                return curr.data;
            count++;
            curr = curr.nextNode;
        }
        return null;
    }
	
}
