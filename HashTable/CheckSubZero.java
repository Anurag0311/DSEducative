package com.anurag.HashTable;

import java.util.HashMap;

//Find If a Subarray with a Sum Equal to 0 Exists


public class CheckSubZero {
	

	  public static boolean findSubZero(int[] arr) {

	    //Use HashMap to store Sum as key and index i as value till sum has been calculated.
	    //Traverse the array and return true if either 
	    //arr[i] == 0 or sum == 0 or HashMap already contains the sum
	    //If you completely traverse the array and havent found any of the above three
	    //conditions then simply return false.
	    HashMap < Integer,Integer > hMap = new HashMap < >();

	    int sum = 0;

	    // Traverse through the given array
	    for (int i = 0; i < arr.length; i++) {
	      sum += arr[i];

	      if (arr[i] == 0 || sum == 0 || hMap.get(sum) != null) return true;

	      hMap.put(sum, i);
	    }

	    return false;
	  }

}
