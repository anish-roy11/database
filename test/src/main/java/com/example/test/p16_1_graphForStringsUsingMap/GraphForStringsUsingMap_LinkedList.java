package com.example.test.p16_1_graphForStringsUsingMap;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

class GraphForStringsUsingMap_LinkedList {

    private Map<String, LinkedList<String>> adjList;



    public GraphForStringsUsingMap_LinkedList() {
        adjList = new HashMap<>();
    }



    public void addNode(String nodeName) {
        adjList.put(nodeName, new LinkedList<>());

    }



    public void addEdge(String src, String dest) {
        adjList.get(src).add(dest); //adjList.get(src) returns a LinkedList
        adjList.get(dest).add(src); // For an undirected graph






    }



    public void printGraph()
    {
        for (Map.Entry<String, LinkedList<String>> entry : adjList.entrySet())
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
        GraphForStringsUsingMap_LinkedList graph = new GraphForStringsUsingMap_LinkedList();

        // Adding nodes
        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");
        graph.addNode("D");
        graph.addNode("E");

        // Adding edges
        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
        graph.addEdge("A", "D");
        graph.addEdge("A", "E");
        graph.addEdge("B", "C");
        graph.addEdge("B", "E");
        graph.addEdge("C", "D");
        graph.addEdge("D", "E");

        // Printing the graph
        graph.printGraph();
    }
}

