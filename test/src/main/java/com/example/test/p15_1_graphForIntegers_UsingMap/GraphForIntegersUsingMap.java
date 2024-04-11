package com.example.test.p15_1_graphForIntegers_UsingMap;

import java.util.*;

class GraphForIntegersUsingMap {
	private int vertexCount;
	private Map<Integer, List<Integer>> adjacencyList;

	// Constructor
	public GraphForIntegersUsingMap(int vertexCount) {
		vertexCount = vertexCount;
		adjacencyList = new HashMap<>();
		for (int i = 0; i < vertexCount; i++) 
		{
			adjacencyList.put(i, new LinkedList<>());
		}
	}

	public void addEdge(int src, int dest) {
		adjacencyList.get(src).add(dest);
		adjacencyList.get(dest).add(src); // For an undirected graph
	}

	public void printGraph() {
		for (Map.Entry<Integer, List<Integer>> entry : adjacencyList.entrySet()) 
		{
			System.out.print("Vertex " + entry.getKey() + " is connected to: ");
			for (Integer neighbor : entry.getValue()) 
			{
				System.out.print(neighbor + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
        int vertices = 5;
        GraphForIntegersUsingMap graph = new GraphForIntegersUsingMap(vertices);

        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        graph.printGraph();
    }
}
