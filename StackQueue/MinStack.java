package com.anurag.StackQueue;

//Create Stack Where min() Gives Minimum in O(1)
/*
public class MinStack {
    int maxSize;
    int min;
    int top;
    int[] array;
    //constructor
    public MinStack(int maxSize) {
        this.maxSize = maxSize;
        this.array=new int[maxSize];
        this.top=-1;
        this.min=Integer.MAX_VALUE;
    }
    //removes and returns value from stack
    public Integer pop(){
       if(top==-1){
           return null;
       }
       else{
           int deletedValue=array[top];
           top--;
           min=Integer.MAX_VALUE;
           for(int i=0;i<=top;i++){
               if(array[i]<=min){
                   min=array[i];
               }
           }
           return deletedValue;
       }
    }
    //pushes value into the stack
    public void push(Integer value){
        if(top==maxSize-1){
            return;
        }
        top++;
        array[top]=value;
        if(value <= min){
            min=value;
        }
    }
    //returns minimum value in O(1)
    public int min(){
		// Write -- Your -- Code
        return min;
    }
}
*/
public class MinStack {
    int maxSize;
    Stack<Integer> mainStack;
    Stack<Integer> minStack;
    //constructor
    public MinStack(int maxSize) {
        //We will use two stacks mainStack to hold original values
        //and minStack to hold minimum values. Top of minStack will always
        //be the minimum value from mainStack
        this.maxSize = maxSize;
        mainStack = new Stack<>(maxSize);
        minStack = new Stack<>(maxSize);
    }
    //removes and returns value from stack
    public int pop(){
        //1. Pop element from minStack to make it sync with mainStack,
        //2. Pop element from mainStack and return that value
        minStack.pop();
        return mainStack.pop();
    }
    //pushes value into the stack
    public void push(Integer value){
        //1. Push value in mainStack and check value with the top value of minStack
        //2. If value is greater than top, then push top in minStack
        //else push value in minStack
        mainStack.push(value);
        if(!minStack.isEmpty() && minStack.top() < value)
            minStack.push(minStack.top());
        else
            minStack.push(value);
    }
    //returns minimum value in O(1)
    public int min(){
        return minStack.top();
    }
}
