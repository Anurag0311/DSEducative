package com.anurag.HashTable;

//Find Whether an Array is a Subset of Another Array

import java.util.HashSet;

public class CheckSubset {

	static boolean isSubset(int arr1[], int arr2[]) {
	    HashSet<Integer> hset= new HashSet<>(); 
	    // hset stores all the values of arr1 
	    for(int i = 0; i < arr1.length; i++) { 
	      if(!hset.contains(arr1[i])) 
	        hset.add(arr1[i]); 
	    } 

	    // loop to check if all elements of arr2 also 
	    // lies in arr1 
	    for(int i = 0; i < arr2.length; i++) { 
	      if(!hset.contains(arr2[i])) 
	        return false; 
	    } 
	    return true; 
	  }
}
