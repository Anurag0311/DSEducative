package com.anurag.StackQueue;

//Generate Binary Numbers from 1 to n Using a Queue

public class FindBinChallenge {
    public static String[] findBin(int number) {
    	String[] result=new String[number];
    	Queue<String> bin=new Queue<>(number);
    	bin.enqueue("1");
    	for(int i=0;i<number;i++) {
    		result[i]=bin.dequeue();
    		String s1=result[i]+"0";
    		String s2=result[i]+"1";
    		bin.enqueue(s1);
    		bin.enqueue(s2);
    		
    	}
    	
    	return result;
    }
    

}
