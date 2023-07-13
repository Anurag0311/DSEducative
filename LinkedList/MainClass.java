package com.anurag.LinkedList;

class MainClass {
	  public static void main( String args[] ) {
	        SinglyLinkedList<Integer> sll = new SinglyLinkedList<Integer>(); 
	        for (int i = 1; i <= 10; i++) {
				    sll.insertAtEnd(i);
	        }
	        sll.printList();
	       // System.out.println("1: Calling Deletion At Head Function: ");
	       // sll.deleteAtHead();
	       // sll.printList();
	       // System.out.println("2: Calling Deletion At Head Function: ");
	      //  sll.deleteAtHead();
	      //  sll.deleteByValue(9);
	      //  System.out.println(sll.length());
	      //  sll.printList();
	      //  CheckReverse rev=new CheckReverse();
	      //  rev.reverse(sll);
	      //  sll.printList();
	       // CheckLoop cl=new CheckLoop();
	        //System.out.println(cl.detectLoop(sll));
	       // CheckMid cm=new CheckMid();
	       // System.out.println(cm.findMiddle(sll));
	    }
	}