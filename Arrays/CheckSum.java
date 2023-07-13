package com.anurag.Arrays;


//Given an array and a number "n", find two numbers from the array that sums up to "n"

public class CheckSum {
		//Brute Force time comp=O(n2)
	/*
	  public static int[] findSum(int[] arr, int n) 
	  {    
	    int[] result = new int[2]; // to store the pair of values.
	    
	    for (int i = 0; i < arr.length; i++) { //traverse arr
	      for (int j = i + 1; j < arr.length; j++) { //traverse arr again
	        if (arr[i] + arr[j] == n) { // find where sum is equal to n
	          result[0] = arr[i];
	          result[1] = arr[j];
	          return result; // return the pair of numbers
	        }
	      }
	    }
	    return arr;  
	  }
	*/
	
	  //Optimized solution time comp(nlogn)
	public static int partition(int[] arr, int low, int high) { 
	    int pivot = arr[high];  
	    int i = (low - 1); // index of smaller element 
	    for (int j = low; j < high; j++) { 
	      // If current element is <= to pivot 
	      if (arr[j] <= pivot) { 
	        i++; 

	        // swap arr[i] and arr[j] 
	        int temp = arr[i]; 
	        arr[i] = arr[j]; 
	        arr[j] = temp; 
	      } 
	    } 

	    // swap arr[i+1] and arr[high] (or pivot) 
	    int temp = arr[i + 1]; 
	    arr[i + 1] = arr[high]; 
	    arr[high] = temp; 

	    return i + 1; 
	  } 

	  public static void sort(int[] arr, int low, int high) { 
	    if (low < high) { 
	      int pi = partition(arr, low, high); 
	      sort(arr, low, pi - 1); 
	      sort(arr, pi + 1, high); 
	    } 
	  } 

	  //Return 2 elements of arr that sum to the given value
	  public static int[] findSum(int[] arr, int n) {
	    //Helper sort function that uses the Quicksort Algorithm
	    sort(arr, 0, arr.length - 1);   //Sort the array in Ascending Order

	    int Pointer1 = 0;    //Pointer 1 -> At Start
	    int Pointer2 = arr.length - 1;   //Pointer 2 -> At End

	    int[] result = new int[2];
	    int sum = 0;

	    while (Pointer1 != Pointer2) {

	      sum = arr[Pointer1] + arr[Pointer2];  //Calulate Sum of Pointer 1 and 2

	      if (sum < n) 
	        Pointer1++;  //if sum is less than given value => Move Pointer 1 to Right
	      else if (sum > n) 
	        Pointer2--; 
	      else {
	        result[0] = arr[Pointer1];
	        result[1] = arr[Pointer2];
	        return result; // containing 2 number 
	      }
	    }
	    return arr; 
	  } 
  
	
}
