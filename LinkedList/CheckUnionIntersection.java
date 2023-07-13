package com.anurag.LinkedList;

public class CheckUnionIntersection {

	
	public static <T> SinglyLinkedList<T> union(SinglyLinkedList<T> list1, SinglyLinkedList<T> list2) {
        if (list1.isEmpty())
            return list2;
        if (list2.isEmpty())
            return list1;
        //take the head of the first list
        SinglyLinkedList<T>.Node last = list1.headNode;
        //traverse it to the last element
        while (last.nextNode != null) {
            last = last.nextNode;
        }
        //attach the last element of list1 to head of list2
        last.nextNode = list2.headNode;
        //remove duplicates that might have been added now
        list1.removeDuplicatesWithHashing(); //complexity of this function is O(n)
        return list1;

    }
    
    //performs intersection between list
    public static <T> SinglyLinkedList<T> intersection(SinglyLinkedList<T> list1, SinglyLinkedList<T> list2) {
        
        SinglyLinkedList<T> result = new SinglyLinkedList<T>();
        if(list1.isEmpty() || list2.isEmpty()){
            return result;
        }

        SinglyLinkedList<T>.Node totest = list1.headNode;
        

        while(totest != null){
            if(contains(list2, totest.data)){
                result.insertAtHead(totest.data); 
            }

            totest = totest.nextNode;
        }


        return result;
    }

    public static <T> boolean contains(SinglyLinkedList<T> list1, T data){
        SinglyLinkedList<T>.Node curr = list1.headNode;

        while(curr != null){
            if(curr.data.equals(data)){
                return true;
            }
            curr = curr.nextNode;
        }
        return false;

    }

	
}
