package com.example.test.p38_2_Dijkstra;


import java.util.Map;

public class DijkstraImpl {
    public static void main(String[] args) {
        Graph graph = new Graph();

        graph.addNode("0");
        graph.addNode("1");
        graph.addNode("2");
        graph.addNode("3");
        graph.addNode("4");
        graph.addNode("5");
        graph.addNode("6");
        graph.addNode("7");
        graph.addNode("8");

//        graph.addNode(1);
//        graph.addNode(2);
//        graph.addNode(3);
//        graph.addNode(4);
//        graph.addNode(5);
//        graph.addNode(6);
//        graph.addNode(7);
//        graph.addNode(8);
//
//        graph.addEdge(0, 1, 4);
//        graph.addEdge(0, 7, 8);
//        graph.addEdge(1, 2, 8);
//        graph.addEdge(1, 7, 11);
//        graph.addEdge(2, 3, 7);
//        graph.addEdge(2, 8, 2);
//        graph.addEdge(2, 5, 4);
//        graph.addEdge(3, 4, 9);
//        graph.addEdge(3, 5, 14);
//        graph.addEdge(4, 5, 10);
//        graph.addEdge(5, 6, 2);
//        graph.addEdge(6, 7, 1);
//        graph.addEdge(6, 8, 6);
//        graph.addEdge(7, 8, 7);


        graph.addEdge("0", "1", 4);
        graph.addEdge("0", "7", 8);
        graph.addEdge("1", "2", 8);
        graph.addEdge("1", "7", 11);
        graph.addEdge("2", "3", 7);
        graph.addEdge("2", "8", 2);
        graph.addEdge("2", "5", 4);
        graph.addEdge("3", "4", 9);
        graph.addEdge("3", "5", 14);
        graph.addEdge("4", "5", 10);
        graph.addEdge("5", "6", 2);
        graph.addEdge("6", "7", 1);
        graph.addEdge("6", "8", 6);
        graph.addEdge("7", "8", 7);






        Map<String, Integer> distances;
        //distances = graph.dijkstra("0");
        //printDistances(distances, "0");


        distances = graph.dijkstra("1");
        printDistances(distances, "1");


        distances = graph.dijkstra("2");
        printDistances(distances, "2");


        distances = graph.dijkstra("3");
        printDistances(distances, "3");


        distances = graph.dijkstra("4");
        printDistances(distances, "4");


        distances = graph.dijkstra("5");
        printDistances(distances, "5");


        distances = graph.dijkstra("6");
        printDistances(distances, "6");


        distances = graph.dijkstra("7");
        printDistances(distances, "7");


        distances = graph.dijkstra("8");
        printDistances(distances, "8");





    }

    public static void printDistances(Map<String, Integer> distances, String startVertex)
    {
        System.out.println("Shortest distances from vertex " + startVertex + ":");
        for (Map.Entry<String, Integer> entry : distances.entrySet())
        {
            System.out.println("To " + entry.getKey() + ": " + entry.getValue());
        }
    }
}