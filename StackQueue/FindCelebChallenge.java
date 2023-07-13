package com.anurag.StackQueue;

/*
 * In this problem, you have to implement findCelebrity() method to find the celebrity
	in a party (matrix) using a stack. 
  A celebrity is someone that everyone knows, but he/she doesn’t know anyone at the party.
 INPUT:
In the party matrix, a particular [row][col] stores acquaintance information for row 
and col. In other words, if [row][col] == 1, then it means row knows col, 
and if it’s zero, then it means row doesn’t know col.
 Remember that everyone knows a celebrity, 
but the celebrity doesn’t know the people at the party.
 party = {
          {0,1,1,0},
          {1,0,1,1},
          {0,0,0,0},
          {0,1,1,0},
                }

numPeople = 4 (Number of rows in party array)  

OUTPUT:
2 (because row Index = 2 is a celebrity)

 *
 *
 */

class FindCelebChallenge {

    public static boolean aqStatus(int[][] party,int x,int y){
        if(party[x][y]==1){
            return true;
        }
        return false;
    }

    public static int findCelebrity(int[][] party, int numPeople) {
        int celebrity = -1;
        Stack<Integer> stack=new Stack<>(numPeople);
        for(int i=0;i<numPeople;i++){
            stack.push(i);
        }
        while(!stack.isEmpty()){

            int x=stack.pop();
            if(stack.isEmpty()){
                celebrity=x;
                break;
            }
            int y=stack.pop();

            if(aqStatus(party,x,y)){
                stack.push(y);
            }
            else{   
                stack.push(x);
                }
        }

        for(int j=0;j<numPeople;j++){

           if (celebrity != j && (aqStatus(party, celebrity, j) || !(aqStatus(party, j, celebrity)))) return -1;
        
        }

        return celebrity;
    }
}