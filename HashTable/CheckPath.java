package com.anurag.HashTable;
/*
 * Trace the Complete Path of a Journey
 
Sample Input:
 
map = 
{
    "NewYork" -> "Chicago"
    "Boston" -> "Texas"
    "Missouri" -> "NewYork"
    "Texas" -> "Missouri"
}
    key -> value
    
Sample Output:

"Boston->Texas, Texas->Missouri, Missouri->NewYork, NewYork->Chicago, "
 */

//import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CheckPath {
/*
	public static String tracePath(Map<String,String> map) {

	    String result = "";
	    String start="";
	    ArrayList<String> source=new ArrayList<>();
	    ArrayList<String> destination=new ArrayList<>();
	    for (String sources : map.keySet()){   //using keyset() method for iteration over keySet  
	      source.add(sources);
	    }   
	    for (String destinations : map.values()){//using values() for iteration over keys  
	      destination.add(destinations);   
	    }

	    for(int i=0;i<source.size();i++){
	      if(destination.contains(source.get(i))){
	        continue;
	      }
	      else{
	        start=source.get(i);
	      }
	    }
	    int size=0;
	    while(size < map.size()){
	      result+=start+"->"+map.get(start)+", ";
	      start=map.get(start);
	      size++;
	    }
	    // Write - Your - Code        
	    return result; 
	  }
*/
	
	public static String tracePath(Map < String, String > map) {

	    String result = "";

	    //Create a reverse Map of given map i.e if given map has (N,C) then reverse map will have (C,N) as key value pair
	    //Traverse original map and see if corresponding key exist in reverse Map
	    //If it doesn't exist then we found our starting point.
	    //After starting point is found, simply trace the complete path from original map.

	    HashMap < String,String > reverseMap = new HashMap < >();

	    //To fill reverse map, iterate through the given map
	    for (Map.Entry < String, String > entry : map.entrySet())		
	      reverseMap.put(entry.getValue(), entry.getKey());

	    //Find the starting point of itinerary
	    String from = "";

	    //Check if graph is disconnected
	    int count = 0;

	    for (Map.Entry < String, String > entry: map.entrySet()) {
	      if (!reverseMap.containsKey(entry.getKey())) {
	        count++;
	        from = entry.getKey();
	        //break;
	      }
	    }

	    if(count > 1){
	      return "null"; // Disconnected graph
	    }

	    //Trace complete path
	    String to = map.get(from);

	    while (to != null) {
	      result += from + "->" + to + ", ";
	      from = to;
	      to = map.get(to);
	    }
	    //System.out.println(result);

	    return result;
	  }

	
	
}
