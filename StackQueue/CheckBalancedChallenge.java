package com.anurag.StackQueue;

/*
 * Check for Balanced Parentheses Using a Stack
 * 
 * INPUT:
 * exp = "{[({})]}"

	OUTPUT:
	True
 */


public class CheckBalancedChallenge {

	public static boolean isBalanced(String exp) {
	       Stack<Character> stack=new Stack<>(exp.length());
	       for(int i=0;i<exp.length();i++){
	           char x=exp.charAt(i);
	           if(x=='}' || x==']' || x==')'){
	               
	               if(stack.isEmpty()){
	                   return false;
	               }
	               if((x=='}' && stack.pop()!='{') || (x==']' && stack.pop()!='[') || (x==')' && stack.pop()!='(')){
	                   return false;
	               }

	           }
	           else{
	               stack.push(x);
	           }
	       }
	       if(!stack.isEmpty()){
	           return false;
	       }
	        return true;
	    }
	
}
