package com.anurag.Arrays;

//Given two sorted arrays, merge them into one array, which should also be sorted.

class CheckMergeArray 
{ 
    // merge arr1 and arr2 into a new result array 
    public static int[] mergeArrays(int[] arr1, int[] arr2) 
    {  
      // write your code here
    int sizeOfArray =  arr1.length + arr2.length;
    int[] arr3 = new int[sizeOfArray];
    int s1 =arr1.length;
    int s2 =arr2.length;
    int i=0, j=0, k=0;


      while(i<s1 && j<s2){ //exits the loop when one of the index of arrays reach their end
      if(arr1[i] < arr2[j])
        arr3[k++] = arr1[i++];
      else
        arr3[k++] = arr2[j++]; 
      }
       
      while(i< s1){ //adds element from 1st array if it is not completely traversed
        arr3[k++] = arr1[i++];
      } 

      while(j< s2){//adds element from 2nd array if it is not completely traversed
        arr3[k++] = arr2[j++];
      } 
      return arr3;
    }
     // make a new resultant array and return your results in that
    
}