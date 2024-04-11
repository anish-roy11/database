package com.example.test.p16_1_graphForStringsUsingMap;


import java.util.*;

class GraphForStringsUsingMap_List {
	private Map<String, List<String>> adjList;


	
	
    public GraphForStringsUsingMap_List() {
        adjList = new HashMap<>();
    }

    
    
    public void addNode(String nodeName) {
        //adjList.put(nodeName, new LinkedList<>());
        adjList.put(nodeName, new ArrayList<>());

    }

    
    
    public void addEdge(String src, String dest) {
        adjList.get(src).add(dest); //adjList.get(src) returns a List
        adjList.get(dest).add(src); // For an undirected graph

        //System.out.println(adjList.get(dest).getClass().getName());




    }

    
    
    public void printGraph() 
    {
        for (Map.Entry<String, List<String>> entry : adjList.entrySet()) 
        {
            System.out.print("Node " + entry.getKey() + " is connected to: ");
            for (String neighbor : entry.getValue()) 
            {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }
    
    
    public static void main(String[] args) {
    	GraphForStringsUsingMap_List graph = new GraphForStringsUsingMap_List();

        // Adding nodes
        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");
        graph.addNode("D");

        // Adding edges
        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
        graph.addEdge("B", "C");
        graph.addEdge("C", "D");

        // Printing the graph
        graph.printGraph();
    }
}

