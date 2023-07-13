package com.anurag.LinkedList;

import java.util.HashSet;

public class SinglyLinkedList<T> {
    //Node inner class for SLL
    public class Node {
        public T data;
        public Node nextNode;

    }

    public Node headNode; //head node of the linked list
    public int size;      //size of the linked list

    //Constructor - initializes headNode and size
    public SinglyLinkedList() {
        headNode = null;
        size = 0;
    }

    //Helper Function that checks if List is empty or not 
    public boolean isEmpty() {
        if (headNode == null) return true;
        return false;
    }

    //Inserts new data at the start of the linked list
    public void insertAtHead(T data) {
        //Creating a new node and assigning it the new data value
        Node newNode = new Node();
        newNode.data = data;
        //Linking head to the newNode's nextNode
        newNode.nextNode = headNode;
        headNode = newNode;
        size++;
    }

    // Helper Function to printList
    public void printList() {
        if (isEmpty()) {
            System.out.println("List is Empty!");
            return;
        }

        Node temp = headNode;
        System.out.print("List : ");
        while (temp.nextNode != null) {
            System.out.print(temp.data.toString() + " -> ");
            temp = temp.nextNode;
        }
        System.out.println(temp.data.toString() + " -> null");
    }
    
    //Inserts new data at the end of the linked list
    public void insertAtEnd(T data) {
        //if the list is empty then call insertATHead()
        if (isEmpty()) {
            insertAtHead(data);
            return;
        }
        //Creating a new Node with value data 
        Node newNode = new Node();
        newNode.data = data;
        newNode.nextNode = null;

        Node last = headNode;
        //iterate to the last element 
        while (last.nextNode != null) {
            last = last.nextNode;
        }
        //make newNode the next element of the last node
        last.nextNode = newNode;
        size++;
    }

    //inserts data after the given prev data node
    public void insertAfter(T data, T previous) {

        //Creating a new Node with value data 
        Node newNode = new Node();
        newNode.data = data;
        //Start from head node
        Node currentNode = this.headNode;
        //traverse the list until node having data equal to previous is found
        while (currentNode != null && !currentNode.data.equals(previous)) {
            currentNode = currentNode.nextNode;
        }
        //if such a node was found
        //then point our newNode to currentNode's nextElement
        if (currentNode != null) {
            newNode.nextNode = currentNode.nextNode;
            currentNode.nextNode = newNode;
            size++;
        }
    }
    
    //Searching operation in linkedlist
    public boolean search(T data) {
    	if(isEmpty()) {//if list is empty return false
    		return false;
    	}
    	SinglyLinkedList<T>.Node temp=this.headNode;//create a node variable to traverse the list
    	while(temp != null) {
    		if(temp.data.equals(data)) {//if temp data is equal to data we are searching return true
    			return true;
    		}
    		temp=temp.nextNode;
    	}
    	return false;
    }
    
    public void deleteAtHead() {
        //if list is empty then simply return
        if (isEmpty())
            return;
        //make the nextNode of the headNode equal to new headNode
        headNode = headNode.nextNode;
        size--;
    }
    
    public void deleteByValue(T data) {
    	if(isEmpty()) {
    		return;
    	}
    	SinglyLinkedList<T>.Node temp=this.headNode;//variable to search the bode to be deleted
    	SinglyLinkedList<T>.Node prev=this.headNode;//variable just before the temp used for deletion
    	while(temp != null) {
    		if(temp.data.equals(data)) {
    			prev.nextNode=temp.nextNode;
    			break;
    		}
    		prev=temp;// assign temp to prev for deletion
    		temp=temp.nextNode;
    	}
    }
    
    //Find the length of the Linked List
    public int length() {
    	int count=0;
    	SinglyLinkedList<T>.Node temp=this.headNode;
    	while(temp != null) {
    		count++;
    		temp=temp.nextNode;
    	}
    	return count;
    }
    
    public void removeDuplicatesWithHashing() {
        Node current = this.headNode;
        Node prevNode = this.headNode;
        //will store all the elements that we observe once
        HashSet<T> visitedNodes = new HashSet<T>();

        if (!isEmpty() && current.nextNode != null) {
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