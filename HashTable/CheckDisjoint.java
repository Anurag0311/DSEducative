package com.anurag.HashTable;
/*
	Find Whether an Array is a Subset of Another Array
 	 Disjoint arrays mean that their intersection returns 
 	 nothing or there are no common elements in them.
Sample Output:
arr1 = [9,4,3,1,-2,6,5]
arr2 = [7,10,8]

Sample Output:
true
 */

import java.util.HashSet;

public class CheckDisjoint {
	
	public static boolean isDisjoint(int[] arr1, int[] arr2) {

	    //Create an HashSet and store all values of arr1   
	    HashSet < Integer > hSet = new HashSet < >();

	    for (int i = 0; i < arr1.length; i++) {
	      if (!hSet.contains(arr1[i])) hSet.add(arr1[i]);
	    }

	    //Traverse arr2 and check if arr1 contains any arr2 element
	    for (int i = 0; i < arr2.length; i++) {
	      if (hSet.contains(arr2[i])) return false;
	    }
	    return true;
	}
}
