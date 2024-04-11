package com.example.test.p28_dfsTraversal;


import java.util.LinkedList;

class Graph {
    private int verticesCount;
    private LinkedList<Integer>[] adjacencyList;

    @SuppressWarnings("unchecked")
    public Graph(int verticesCount) {
        this.verticesCount = verticesCount;
        adjacencyList = new LinkedList[verticesCount];

        for (int i = 0; i < verticesCount; i++) {
            adjacencyList[i] = new LinkedList<>();
        }
    }

    public void addEdge(int v, int w) {
        adjacencyList[v].add(w);
    }

    public void DFS(int startVertex) {
        boolean[] visited = new boolean[verticesCount];
        DFSUtil(startVertex, visited);
    }

    private void DFSUtil(int vertex, boolean[] visited) {
        visited[vertex] = true;
        System.out.print(vertex + " ");

        for (Integer neighbor : adjacencyList[vertex]) {
            if (!visited[neighbor]) {
                DFSUtil(neighbor, visited);
            }
        }
    }
}