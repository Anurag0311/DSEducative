package com.anurag.Arrays;

/*
 Challenge: Remove Even Integers from an Array
 */

public class CheckRemoveEven {

	public static int[] removeEven(int[] arr) {

		// Write - Your - Code- Here
		
		int ind = 0;
		for(int i: arr){//counting number of old integer present inside the array
			if (i%2 != 0){
				ind = ind +1;
			}
		}

		int[] oddArray = new int[ind];
		int ind2 = 0;
		for(int i: arr){  //takes elements that are odd and adds it in odd array
			if (i%2 != 0){
				oddArray[ind2] = i;
				ind2 = ind2 +1;
			}
		}


		return oddArray; // change this and return the correct result array
	}
	
	
	public static void main(String args[]) {
		  
	    int size = 10;
	    int[] arr = new int[size]; //declaration and instantiation 
	  
	    System.out.print("Before removing Even Numbers: "); 
	    for (int i = 0; i < arr.length; i++) {
	      arr[i] = i; // assigning values
	      System.out.print(arr[i] +  " ");
	    }
	    System.out.println();
	  
	    int[] newArr =  removeEven(arr); // calling removeEven
	  
	    System.out.print("After removing Even Numbers: "); 
	    for (int i = 0; i < newArr.length; i++) {
	      System.out.print(newArr[i] +  " "); // prinitng array
	    }
	  }
	
}
