package com.anurag.Arrays;

//Given an array of size n, can you find the second maximum element in the array

class CheckSecondMax {
	  
	  public int findSecondMaximum(int[] arr)
	  {

	    int max = 0;
	    for (int i=0 ; i< arr.length; i++){ // to find first maximum
	      if(arr[i] > max){
	          max = arr[i];
	      }
	    }

	    int max2 = 0;
	    for (int i=0 ; i< arr.length; i++){//to find second maximum
	      if(arr[i] > max2 && arr[i] != max){
	          max2 = arr[i];
	      }
	    }

	    // Write - Your - Code
	    return max2;
	  }
	}
