package com.anurag.Arrays;

//In this problem, you have to implement the void reArrange(int[] arr) method, 
//which will sort the elements, such that all the negative elements appear 
//at the left and positive elements appear at the right.

class CheckReArrange {

	  public static void reArrange(int[] arr) {

	    int[] dup = new int[arr.length];
	    int j=0, k=arr.length-1;

	    for(int i=0; i< arr.length; i++){
	      if(arr[i]<0){
	        dup[j++] = arr[i];
	      }else {
	        dup[k--] = arr[i];
	      }
	    }
	    for(int i=0; i< arr.length; i++){
	      arr[i] = dup[i];
	    }

	    //Write - Your - Code        
	  }
	}
