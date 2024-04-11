package com.example.test.p38_1_Dijkstra;


// Java Program to Implement Dijkstra's Algorithm
// Using Priority Queue

// Importing utility classes
import java.util.*;

// Main class DPQ
public class DijkstraAlgorithm2 {

    // Member variables of this class
    private int dist[];
    private Set<Integer> settled;
    private PriorityQueue<Node> pq;
    // Number of vertices
    private int vertexCount;
    List<List<Node> > adjacentList;

    // Constructor of this class
    public DijkstraAlgorithm2(int V)
    {

        // This keyword refers to current object itself
        this.vertexCount = V;
        dist = new int[V];
        settled = new HashSet<Integer>();
        pq = new PriorityQueue<Node>(V, new Node());
    }

    // Method 1
    // Dijkstra's Algorithm
    public void dijkstra(List<List<Node> > adj, int src)
    {
        this.adjacentList = adj;

        for (int i = 0; i < vertexCount; i++)
            dist[i] = Integer.MAX_VALUE;

        // Add source node to the priority queue
        pq.add(new Node(src, 0));

        // Distance to the source is 0
        dist[src] = 0;

        while (settled.size() != vertexCount) {

            // Terminating condition check when
            // the priority queue is empty, return
            if (pq.isEmpty())
                return;

            // Removing the minimum distance node
            // from the priority queue
            int u = pq.remove().node;

            // Adding the node whose distance is
            // finalized
            if (settled.contains(u))

                // Continue keyword skips execution for
                // following check
                continue;

            // We don't have to call e_Neighbors(u)
            // if u is already present in the settled set.
            settled.add(u);

            e_Neighbours(u);
        }
    }

    // Method 2
    // To process all the neighbours
    // of the passed node
    private void e_Neighbours(int u)
    {

        int edgeDistance = -1;
        int newDistance = -1;

        // All the neighbors of v
        for (int i = 0; i < adjacentList.get(u).size(); i++) {
            Node v = adjacentList.get(u).get(i);

            // If current node hasn't already been processed
            if (!settled.contains(v.node)) {
                edgeDistance = v.cost;
                newDistance = dist[u] + edgeDistance;

                // If new distance is cheaper in cost
                if (newDistance < dist[v.node])
                    dist[v.node] = newDistance;

                // Add the current node to the queue
                pq.add(new Node(v.node, dist[v.node]));
            }
        }
    }

    public static void addNode(List<List<Node> > adjacencyList, int sourceNode, int destNode, int cost)
    {
        adjacencyList.get(sourceNode).add(new Node(destNode, cost));
        adjacencyList.get(destNode).add(new Node(sourceNode, cost)); //for undirected graph
    }



    public static void printPath(DijkstraAlgorithm2 dpq, int source)
    {
        // Printing the shortest path to all the nodes
        // from the source node
        System.out.println("The shorted path from node :");

        for (int i = 0; i < dpq.dist.length; i++)
            System.out.println(source + " to " + i + " is "+ dpq.dist[i]);
    }



    // Main driver method
    public static void main(String arg[])
    {

        int vertexCount = 6;
        //int source = 0;

        // Adjacency list representation of the
        // connected edges by declaring List class object
        // Declaring object of type List<Node>
        List<List<Node> > adjacencyList = new ArrayList<List<Node> >();

        // Initialize list for every node
        for (int i = 0; i < vertexCount; i++) {
            List<Node> item = new ArrayList<Node>();
            adjacencyList.add(item);
        }



//        addNode(adjacencyList,0,1,9);
//        addNode(adjacencyList,0,2,6);
//        addNode(adjacencyList,0,3,5);
//        addNode(adjacencyList,0,4,3);
//
//        addNode(adjacencyList,2,1,2);
//        addNode(adjacencyList,2,3,4);



        addNode(adjacencyList,0,1,3);
        addNode(adjacencyList,0,2,1);
        addNode(adjacencyList,0,3,9);
        addNode(adjacencyList,0,4,7);
        addNode(adjacencyList,0,5,4);


        addNode(adjacencyList,1,2,2);

        addNode(adjacencyList,2,3,3);
        addNode(adjacencyList,2,5,2);

        addNode(adjacencyList,3,4,1);

        addNode(adjacencyList,4,5,3);


        // Calculating the single source shortest path
        DijkstraAlgorithm2 dpq = new DijkstraAlgorithm2(vertexCount);

        dpq.dijkstra(adjacencyList, 0);
        printPath(dpq,0);

        dpq = new DijkstraAlgorithm2(vertexCount);
        dpq.dijkstra(adjacencyList, 1);
        printPath(dpq,1);

        dpq = new DijkstraAlgorithm2(vertexCount);
        dpq.dijkstra(adjacencyList, 2);
        printPath(dpq,2);

        dpq = new DijkstraAlgorithm2(vertexCount);
        dpq.dijkstra(adjacencyList, 3);
        printPath(dpq,3);

        dpq = new DijkstraAlgorithm2(vertexCount);
        dpq.dijkstra(adjacencyList, 4);
        printPath(dpq,4);

        dpq = new DijkstraAlgorithm2(vertexCount);
        dpq.dijkstra(adjacencyList, 5);
        printPath(dpq,5);



    }


}


//output:
//
// The shorted path from node :
//0 to 0 is 0
//0 to 1 is 3
//0 to 2 is 1
//0 to 3 is 4
//0 to 4 is 5
//0 to 5 is 3
//The shorted path from node :
//1 to 0 is 3
//1 to 1 is 0
//1 to 2 is 2
//1 to 3 is 5
//1 to 4 is 6
//1 to 5 is 4
//The shorted path from node :
//2 to 0 is 1
//2 to 1 is 2
//2 to 2 is 0
//2 to 3 is 3
//2 to 4 is 4
//2 to 5 is 2
//The shorted path from node :
//3 to 0 is 4
//3 to 1 is 5
//3 to 2 is 3
//3 to 3 is 0
//3 to 4 is 1
//3 to 5 is 4
//The shorted path from node :
//4 to 0 is 5
//4 to 1 is 6
//4 to 2 is 4
//4 to 3 is 1
//4 to 4 is 0
//4 to 5 is 3
//The shorted path from node :
//5 to 0 is 3
//5 to 1 is 4
//5 to 2 is 2
//5 to 3 is 4
//5 to 4 is 3
//5 to 5 is 0