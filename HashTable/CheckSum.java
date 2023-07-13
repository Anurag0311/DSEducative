package com.anurag.HashTable;

import java.util.HashSet;
import java.util.Set;

//Find Two Numbers that Add Up to "n"

public class CheckSum {

	public static int[] findSum(int[] arr, int n) 
	  {
	    int[] result = new int[2];
	    Set<Integer> set = new HashSet<Integer>();
	    for(int i: arr) 
	    {
	      if(set.contains(n - i)){
	          result[0] = i;
	          result[1] = n - i;
	          break;
	      }
	      set.add(i);
	    }
	    return result;   // return the elements in the array whose sum is equal to the value passed as parameter 
	  
	  }
}
