package com.anurag.HashTable;

import java.util.HashSet;

import com.anurag.LinkedList.SinglyLinkedList;

//Union and Intersection of Lists Using Hashing

public class CheckUnionIntersection {


    public static <T> SinglyLinkedList<T> unionWithHashing(SinglyLinkedList<T> list1, SinglyLinkedList<T> list2) {
        SinglyLinkedList<T> result = new SinglyLinkedList<T>();

        HashSet<T> visited = new HashSet<T>();
        
        SinglyLinkedList<T>.Node current = list1.headNode; //start from list1's head
        //Keep iterating list1
        while (current!=null) {
            //add elements of list1 into the result if they havent been visited before
            if(!visited.contains(current.data)) {
                result.insertAtHead(current.data);
                visited.add(current.data);
            }
            current = current.nextNode;
        }

        //now start from the head of list2
        current = list2.headNode;

        //Keep iterating list2
        while (current!=null) {
            //add elements of list2 into the result if they havent been visited before
            if(!visited.contains(current.data)) {
                result.insertAtHead(current.data);
                visited.add(current.data);
            }
            current = current.nextNode;
        }
        
        
        return result;
    }

    public static <T> SinglyLinkedList<T> intersectionWithHashing(SinglyLinkedList<T> list1, SinglyLinkedList<T> list2) {
        SinglyLinkedList<T> result = new SinglyLinkedList<T>();

        HashSet<T> visited = new HashSet<T>();
        //start from the head of list1
        SinglyLinkedList<T>.Node current = list1.headNode;
        //Keep iterating list1
        while (current != null) {
            //Add elements to visited set if they have not been visited
            if (!visited.contains(current.data)) {
                visited.add(current.data);
            }
            current = current.nextNode;
        }
        //now take head of list2
        current = list2.headNode;
        //iterate list2
        while (current != null) {
            //add the elements which have been visited before into the result
            if (visited.contains(current.data)) {
                result.insertAtHead(current.data);
                visited.remove(current.data);
            }
            current = current.nextNode;
        }
        return result;
    }

}
