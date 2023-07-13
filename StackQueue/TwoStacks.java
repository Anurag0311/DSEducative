package com.anurag.StackQueue;

//Implement Two Stacks Using One Array

class TwoStacks<V> {
    private int maxSize;
  int top1, top2;
  int maxSize1, maxSize2 ;//Store top value indices of Stack 1 and Stack 2
  private V[] array;

  @SuppressWarnings("unchecked")
  public TwoStacks(int max_size) {
      this.maxSize = max_size;
      this.maxSize1 = this.maxSize / 2 ;
      this.top1 = -1;
      this.maxSize2 = this.maxSize ;
      this.top2 = this.maxSize1 + 1;
      array = (V[]) new Object[max_size];//type casting Object[] to V[]
  }

  //insert at top of first stack
  //insert at top of first stack
  public void push1(V value) {
      if (top1 >= maxSize1) {
          System.err.println("Stack is Full!");
          return;
      }
      array[++top1] = value;
  }

  //insert at top of second stack
  public void push2(V value) {
      if (top2 > maxSize2) {
          System.err.println("Stack is Full!");
          return;
      }
      array[top2++] = value;
  }

  //remove and return value from top of first stack
  public V pop1() {
      if (top1 == -1)
          return null;
      return array[top1--];
  }

  //remove and return value from top of second stack
  public V pop2() {
      if (top2 == maxSize1 + 1)
          return null;
      return array[--top2];
  }
}
