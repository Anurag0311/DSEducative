package com.anurag.Graph;

//Remove Edge from a Directed Graph

public class RemoveEdgeChallenge {
	public static void removeEdge(Graph g, int source, int destination) {
	     //DoublyLinkedList<Integer> temp=null;
	     //if(g.adjacencyList[source] != null){
	     //    temp=g.adjacencyList[source];
	     //}
	    // temp.deleteByValue(destination);
	    g.adjacencyList[source].deleteByValue(destination);
	}
}
