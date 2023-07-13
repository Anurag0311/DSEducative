package com.anurag.LinkedList;

import java.util.HashSet;

public class CheckLoop {
	
	public static <T> boolean detectLoop(SinglyLinkedList<T> list) {
		SinglyLinkedList<T>.Node temp=list.headNode;
		HashSet<T> loopDetector=new HashSet<>();//stores the visited elements
		while(temp != null) {
			if(loopDetector.contains(temp.data)) {//return true if a node is present in hashSet
				return true;
			}
			else {
				loopDetector.add(temp.data);//if not present add the node in the hashset
			}
			temp=temp.nextNode;
		}
		
		return false;
		
	}
	
}
