package com.example.test.p41_dfs_bfsInGraph;

import java.util.*;

public class Graph {
    private int verticesCount;
    private Map<String, List<GraphNode>> adjacencyList2;
    Map<String, Boolean> visited_dfs;
    Map<String, Boolean> visited_bfs;


    // consstructor
    public Graph(int verticesCount) {
        this.verticesCount = verticesCount;
        this.adjacencyList2 = new HashMap<>();
        this.visited_dfs = new HashMap<>();
        this.visited_bfs = new HashMap<>();


    }

    public void addNode(String nodeId) {
        this.adjacencyList2.put(nodeId, new ArrayList<>());
        this.visited_dfs.put(nodeId, false);
        this.visited_bfs.put(nodeId, false);

    }

    public void addEdge(String source, String destination) {
        this.adjacencyList2.get(source).add(new GraphNode(destination, 0));
        this.adjacencyList2.get(destination).add(new GraphNode(source, 0)); //  for an undirected graph
    }

    public void dfs(String startVertex) {
        Stack<String> stack = new Stack<>();
        stack.push(startVertex);
        while (!stack.isEmpty()) {
            String currentVertex = stack.pop();

            if (!visited_dfs.get(currentVertex)) {
                System.out.print(currentVertex + " ");
                visited_dfs.put(currentVertex, true);
            }

            for (GraphNode graphNode1 : adjacencyList2.get(currentVertex)) {
                if (!visited_dfs.get(graphNode1.getNodeId())) {
                    stack.push(graphNode1.getNodeId());
                }
            }
        }
    }


    public void bfs(String startNodeId) {

        Queue<GraphNode> queue = new LinkedList<>();

        visited_bfs.put(startNodeId, true);
        queue.add(new GraphNode(startNodeId,0));

        while (!queue.isEmpty()) {
            GraphNode currentQueueNode = queue.poll();
            System.out.print(currentQueueNode.getNodeId() + " ");

            for (GraphNode neighbourNode : adjacencyList2.get(currentQueueNode.getNodeId())) {
                if (!visited_bfs.get(neighbourNode.getNodeId())) {
                    visited_bfs.put(neighbourNode.getNodeId(),true);
                    queue.add(neighbourNode);
                }
            }
        }
    }
}