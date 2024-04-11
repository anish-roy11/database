package com.example.test.p16_3_graphForNodesUsingMap;



import java.util.*;

public class GraphForNodesUsingMap_List {

    private Map<String, List<GraphNode>> adjList;

    //constructor
    public GraphForNodesUsingMap_List() {
        adjList = new HashMap<>();
    }



    public void addNode(String nodeId) {
        adjList.put(nodeId, new ArrayList<>());
    }


    public void addEdge(String src, String dest, int weight) {
        GraphNode graphNodeObj1=new GraphNode(dest,weight);
        adjList.get(src).add(graphNodeObj1);

        // For an undirected graph
        GraphNode graphNodeObj2=new GraphNode(src,weight);
        adjList.get(dest).add(graphNodeObj2);
    }



    public void printGraph()
    {
        for (Map.Entry<String, List<GraphNode>> mapEntry : adjList.entrySet())
        {
            String nodeId = mapEntry.getKey();
            System.out.println("Node " + nodeId + " is connected to: ");
            for (GraphNode graphNode1 : mapEntry.getValue())
            {
                System.out.println(graphNode1.getNodeId() + " with weight "+ graphNode1.getWeight());

            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        GraphForNodesUsingMap_List graph = new GraphForNodesUsingMap_List();

        //Add nodes in the graph
        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");
        graph.addNode("D");
        graph.addNode("E");
        graph.addNode("F");


        // Adding edges
        graph.addEdge("A", "B", 0);
        graph.addEdge("A", "C", 0);
        graph.addEdge("A", "D", 0);
        graph.addEdge("B", "C", 0);
        graph.addEdge("B", "E", 0);
        graph.addEdge("C", "D",0);
        graph.addEdge("C", "F",0);
        graph.addEdge("D", "E",0);
        graph.addEdge("D", "F",0);
        graph.addEdge("E", "F",0);



        graph.printGraph();
    }
}
