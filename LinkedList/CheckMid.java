package com.anurag.LinkedList;

//Return Middle Node of the Linked List

public class CheckMid {

	public static <T> Object findMiddle(SinglyLinkedList<T> list) {
	/*	
	 * int size=list.size/2;
		int count=1;
		SinglyLinkedList<T>.Node temp =list.headNode;
		while(count != size) {
			count++;
			temp=temp.nextNode;                                          
		}
		
		
		return temp.data; 
		*/
		
		if (list.isEmpty())
            return null;
        
        //both nodes start from the head
        SinglyLinkedList<T>.Node mid = list.headNode;
        SinglyLinkedList<T>.Node current = list.headNode;
        
        while(mid != null && current != null && current.nextNode != null)
        {
            //current jumps 2 nodes on each iteration
            current = current.nextNode.nextNode;
            //if current is not null (end of list is not reached)
            if(current != null){
                //then mid jumps 1 node
                //mid is always halfway behind current
                mid = mid.nextNode;
            }
        }
        return mid.data;
	}
	
}
