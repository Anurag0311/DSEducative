package com.anurag.StackQueue;

//Next Greater Element Using Stack
//Input: arr = {4,6,3,2,8,1}
//Output: result = {6,8,8,8,-1,-1}

public class NextGreaterChallenge {

	public static int[] nextGreaterElement(int[] arr) {
        int[] result = new int[arr.length];
        Stack<Integer> stack=new Stack<>(arr.length);
        for(int i=arr.length;i>=0;i--) {
        	if(!stack.isEmpty()) {
        		while(!stack.isEmpty() && stack.top()<=arr[i]) {
        			stack.pop();
        		}
        	}
        	if(stack.isEmpty()) {
        		result[i]=-1;
        	}
        	else {
        		result[i]=stack.top();
        		}
        	stack.push(arr[i]);
        }
        return result;
    }
	
}
