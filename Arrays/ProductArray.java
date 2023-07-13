package com.anurag.Arrays;

//Given an array,return an array where each index stores the product of all numbers 
//except the number on the index itself


class ProductArray  
{  
	/*
	 * time Comp=O(n)
  public static int[] findProduct(int arr[])  
  {    
    int [] result = new int[arr.length] ;

    for (int i = 0; i < arr.length; i++) { //traverse arr
      int n = 1;
      for(int j = 0; j < arr.length; j++){
          if(i != j){
            n = n * arr[j];
          }
      }
       result[i] = n;
    }
    
    // write your code here

    return result; 
   } 
   */
	
	public static int[] findProduct(int arr[])  
	  { 
	    int n = arr.length;
	    int i, temp = 1; 

	    // Allocation of result array
	    int result[] = new int[n]; 

	    // Product of elements on left side excluding arr[i]
	    for (i = 0; i < n; i++)  
	    { 
	      result[i] = temp; 
	      temp *= arr[i]; 
	    } 

	    // Initializing temp to 1 for product on right side
	    temp = 1; 

	    // Product of elements on right side excluding arr[i] 
	    for (i = n - 1; i >= 0; i--)  
	    { 
	      result[i] *= temp; 
	      temp *= arr[i]; 
	    }

	    return result; 
	  }
}