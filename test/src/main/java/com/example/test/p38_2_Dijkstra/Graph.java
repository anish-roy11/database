package com.example.test.p38_2_Dijkstra;

import java.util.*;

public class Graph {

    private Map<String, List<Node>> graph;


    //constructor
    public Graph() {
        graph = new HashMap<>();
    }




    //method to add a node in graph
    public void addNode(String nodeId) {
        graph.put(nodeId, new ArrayList<>());
    }




    //method to add an edge between two nodes in graph
    public void addEdge(String src, String dest, int weight) {

        Node graphNodeObj1=new Node(dest,weight);
        graph.get(src).add(graphNodeObj1);

        // For an undirected graph
        Node graphNodeObj2=new Node(src,weight);
        graph.get(dest).add(graphNodeObj1);
    }






    public Map<String, Integer> dijkstra(String start) {
        Map<String, Integer> distances = new HashMap<>();
        PriorityQueue<Node> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a.distance));

        distances.put(start, 0);
        Node node1 = new Node(start, 0);
        //minHeap.offer(node1);
        minHeap.add(node1);

        while (!minHeap.isEmpty()) {
            Node currentNode = minHeap.poll();

            for (Node neighbor : graph.getOrDefault(currentNode.nodeId, Collections.emptyList())) {
                int newDistance = distances.get(currentNode.nodeId) + neighbor.distance;

                if (!distances.containsKey(neighbor.nodeId) || newDistance < distances.get(neighbor.nodeId)) {
                    distances.put(neighbor.nodeId, newDistance);
                    Node node2 = new Node(neighbor.nodeId, newDistance);
                    //minHeap.offer(new Node(neighbor.vertex, newDistance));
                    minHeap.add(node2);
                }
            }
        }

        return distances;
    }


}


