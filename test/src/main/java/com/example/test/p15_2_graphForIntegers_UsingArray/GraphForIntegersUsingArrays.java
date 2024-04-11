package com.example.test.p15_2_graphForIntegers_UsingArray;


// Java program to print DFS traversal
// from a given graph
import java.util.*;

// This class represents a
// directed graph using adjacency
// list representation

public class GraphForIntegersUsingArrays {

    private int vertexCount;

    // Array  of linked lists for
    // Adjacency List Representation
    private LinkedList<Integer>[] adjacencyList;

    
    @SuppressWarnings("unchecked")
	public GraphForIntegersUsingArrays(int vertex_count)
    {
        vertexCount = vertex_count;
        adjacencyList = new LinkedList[vertexCount];
        for (int i = 0; i < vertexCount; ++i)
        {
            adjacencyList[i] = new LinkedList<Integer>();
        }
    }

    // Function to add an edge into the graph
    public void addEdge(int v, int w)
    {
        // Add w to v's list.
        adjacencyList[v].add(w);
    }

    // A function used by DFS
    public void DFSUtil(int vertex, boolean visited[])
    {
        // Mark the current node as visited and print it
        visited[vertex] = true;
        System.out.print(vertex + " ");

        // Recur for all the vertices adjacent to this
        // vertex
        Iterator<Integer> i = adjacencyList[vertex].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n])
                DFSUtil(n, visited);
        }
    }

    // The function to do DFS traversal.
    // It uses recursive DFSUtil()
    public void DFS(int v)
    {
        // Mark all the vertices as
        // not visited(set as
        // false by default in java)
        boolean visited[] = new boolean[vertexCount];

        // Call the recursive helper
        // function to print DFS
        // traversal
        DFSUtil(v, visited);
    }
    
    
    public static void main(String[] args) {

        GraphForIntegersUsingArrays g = new GraphForIntegersUsingArrays(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Following is Depth First Traversal "+ "(starting from vertex 2)");

        // Function call
        g.DFS(2);


        
        //return numberList2;

    }
}


