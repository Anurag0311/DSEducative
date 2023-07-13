package com.anurag.Arrays;

//Given an array, find the sum of contiguous subarray with the largest sum


public class FindMax {

	 public static int findMaxSumSubArray(int[] arr) {
	 int currMax=arr[0];
	 int globalMax=arr[0];
	 for(int i=0;i<arr.length;i++) {
		 if(currMax<0) {// currMax is changed to arr[i] if currMax less than 0
			 currMax=arr[i];
		 }
		 else { //if currMax is not less than 0 than we add arr[i] to currMax
			 currMax+=arr[i];
		 }
		 
		 if(currMax>globalMax) { //if currMax greater than globalMax then currMax is assigned to globalMax
			 globalMax=currMax;
		 }
	 }
	 return globalMax;
	 
	 }
}
