package com.anurag.Arrays;

//Right Rotate the Array by One Index

class CheckRotateArray{
	  
	  public static void rotateArray(int[] arr){

	      int[] newa = new int[arr.length];
	      newa[0] = arr[arr.length-1];
	      for(int i=0; i<arr.length - 1; i++){
	        newa[i+1] = arr[i];
	      }
	      for(int i=0; i<arr.length; i++){
	        arr[i] = newa[i];
	      }

	        // Write - Your - Code    
	      
	    }
	}