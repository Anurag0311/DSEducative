package com.anurag.HashTable;

import java.util.HashMap;
import java.util.Map;

//First Non-Repeating Integer in an Array


public class CheckFirstUnique {
	
	public static int findFirstUnique(int[] arr) {

        Map<Integer, Integer> countElements = new HashMap<>();
        //If the element does not exist in the HashMap
        //Add that element with value = 0
        //or else update the number of occurrences of that element by adding 1
        for (int i = 0; i < arr.length; i++) {
            if(countElements.containsKey(arr[i])){
                int occurence = countElements.get(arr[i]) + 1;
                countElements.put(arr[i], occurence);
            }
            else
                countElements.put(arr[i], 0); 
        }
        //Traverse the array and check the number of occurrences
        //Return the first element with 0 occurences
        for (int i = 0; i < arr.length; i++) {
            if (countElements.get(arr[i]) == 0) {
                return arr[i];
            }
        }
        //If no such element is found, return -1
        return -1;
    }
}
