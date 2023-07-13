package com.anurag.StackQueue;

//Implement Queue Using Stack

public class QueueWithStack<V> {

	Stack<V> stack1;
	Stack<V> stack2;
	
	public QueueWithStack(int maxSize){
		this.stack1=new Stack<V>(maxSize);
		this.stack2=new Stack<V>(maxSize);
	}
	
	public void enqueue(V value) {
		stack1.push(value);
	}
	
	public V dequeue() {
	//Adds all the element of stack1 to stack2 so that first element in stack1 is
	// last in stack2 so we can easily pop it and again add all the data back in stack1
		while(!stack1.isEmpty()) {
			stack2.push(stack1.pop());
		}
		V deletedData=stack2.pop();
		while(!stack2.isEmpty()) {
			stack1.push(stack2.pop());
		}
		return deletedData;
	}
	
}
