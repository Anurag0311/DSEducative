package com.anurag.Arrays;


//Given an array, 
//can you re-arrange the elements such that the first position will have the largest number,
//the second will have the smallest, the third will have the second-largest, and so on.

public class CheckMaxMin {
	
	
	public static void maxMin(int[] arr) {
		int maxId=arr.length-1;
		int minId=0;
		int maxElem=arr[maxId]+1;
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				arr[i]=(arr[maxId]%maxElem)*maxElem;
				maxId--;
			}
			else {
				arr[i]=(arr[minId]%maxElem)*maxElem;
				minId++;
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			arr[i]/=maxElem;
		}
	}
	
}
