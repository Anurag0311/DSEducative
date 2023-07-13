package com.anurag.LinkedList;

public class PalindromeChallenge {

	public static <T> boolean isPalindrome(DoublyLinkedList<T> list) {
        //Write Your Code Here

        if(list.getSize() == 1 || list.isEmpty())
            return true;

        DoublyLinkedList<T>.Node start = list.getHeadNode(); 
        DoublyLinkedList<T>.Node end = list.getTailNode();


        while(start != null || end != null){
            if(start.data != end.data){
                return false;
            }
            start = start.nextNode;
            end = end.prevNode;
        }

        return true;
    }
	
}
