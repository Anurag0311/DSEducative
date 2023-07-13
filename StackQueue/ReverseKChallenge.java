package com.anurag.StackQueue;

//Reversing the First k Elements of a Queue

class ReverseKChallenge {
    public static <V> void reverseK(Queue<V> queue, int k) {

        Stack<V> st = new Stack<V>(k);//stack reverses the data added in the stack

        for(int i= 0; i<k ; i++){
            st.push(queue.top());
            queue.dequeue();
        }

        for(int j=0; j<k; j++){
            queue.enqueue(st.pop());//reverse of the data added in the queue
        }

        int size= queue.getCurrentSize();
        for(int i = 0; i < size - k; i++)
            queue.enqueue(queue.dequeue());//to maintain the order of the queue

    }
}