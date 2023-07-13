package com.anurag.StackQueue;

//Sort values inside a stack

public class SortValuesChallenge { 
	    public static void sortStack(Stack<Integer> stack) {

	      Stack<Integer> tempStack = new Stack<Integer>(stack.getMaxSize());

	      while(!stack.isEmpty()){
	        int temp = stack.pop();
	        if(!tempStack.isEmpty() && temp >= tempStack.top()){
	          tempStack.push(temp);
	        }else{
	          while(!tempStack.isEmpty() && tempStack.top() > temp)
	            stack.push(tempStack.pop());
	          tempStack.push(temp);
	          }
	        }

	        while(!tempStack.isEmpty()){
	          stack.push(tempStack.pop());
	        }
	      
	        // Write -- Your -- Code
	        //RECURSIVE APPROACH
	        /*
	         * public static void insert(Stack<Integer> stack, int value) {
      if(stack.isEmpty()|| value < stack.top())
          stack.push(value);
      else{
          int temp = stack.pop();
          insert(stack,value);
          stack.push(temp);
      }
  }

  public static Stack<Integer> sortStack(Stack<Integer> stack) {
      if(!stack.isEmpty()) {
          int value = stack.pop();
          sortStack(stack);
          insert(stack,value);
      }
      return stack;
  }

	         */
	    }
	}
	
