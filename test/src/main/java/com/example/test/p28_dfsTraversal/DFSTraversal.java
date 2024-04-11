package com.example.test.p28_dfsTraversal;





public class DFSTraversal {
    public static void main(String[] args) {
        Graph graph = new Graph(4);

        // Adding edges to the graph
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);

        System.out.println("Depth-First Search (DFS) Traversal:");
        graph.DFS(2); // Starting DFS traversal from vertex 2
    }
}
