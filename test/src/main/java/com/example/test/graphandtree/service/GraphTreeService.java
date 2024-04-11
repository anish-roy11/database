package com.example.test.graphandtree.service;


// Java program to print DFS traversal
// from a given graph
import java.io.*;
import java.util.*;

// This class represents a
// directed graph using adjacency
// list representation

public class GraphTreeService {

    private int vertexCount;

    // Array  of linked lists for
    // Adjacency List Representation
    private LinkedList<Integer> adjacencyList[];

    // Constructor
    @SuppressWarnings("unchecked")
    public GraphTreeService(int vertex_count)
    {
        vertexCount = vertex_count;
        adjacencyList = new LinkedList[vertexCount];
        for (int i = 0; i < vertexCount; ++i)
        {
            adjacencyList[i] = new LinkedList();
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
}
