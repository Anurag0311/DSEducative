package com.anurag.Graph;

//Implement Depth First Search

import com.anurag.LinkedList.DoublyLinkedList;
import com.anurag.StackQueue.Stack;

public class CheckDFS {

	public static String dfs(Graph g){
        String result = "";
        //Checking if the graph has no vertices
        if (g.vertices < 1){
            return result;
        }

        //Boolean Array to hold the history of visited nodes (by default-false)
        boolean[] visited = new boolean[g.vertices];
    
        for(int i=0; i<g.vertices; i++) 
        { 
            //Checking whether the node is visited or not 
            if(!visited[i]) 
            { 
                result = result + dfsVisit(g, i, visited); 
            } 
        }
        return result;
    }
    public static String dfsVisit(Graph g, int source, boolean[] visited) {

        String result = "";


        //Create Stack(Implemented in previous lesson) for Depth First Traversal and Push source in it
        Stack<Integer> stack = new Stack<Integer>(g.vertices);

        stack.push(source);

        //Traverse while stack is not empty
        while (!stack.isEmpty()) {

            //Pop a vertex/node from stack and add it to the result
            int current_node = stack.pop();
            result += String.valueOf(current_node);
            
            //Get adjacent vertices to the current_node from the array,
            //and if they are not already visited then push them in the stack
            DoublyLinkedList<Integer>.Node temp = null;
            if(g.adjacencyList[current_node] !=null)
                temp = g.adjacencyList[current_node].headNode;

            while (temp != null) {

                if (!visited[temp.data]) {
                    stack.push(temp.data);
                    
                }
                temp = temp.nextNode;
            }
            //Visit the node     
            visited[current_node] = true;
        }//end of while
        return result;
    }
}
