package com.example.test.p16_3_graphForNodesUsingMap;

public class GraphNode {

    // Member variables of this class
    private String nodeId;
    private int weight;




    // Constructors of this class
    // Constructor 1
    public GraphNode() {}



    // Constructor 2
    public GraphNode(String nodeId, int cost)
    {

        // This keyword refers to current instance itself
        this.nodeId = nodeId;
        this.weight = cost;
    }


    // Constructor 3
    public GraphNode(String nodeId)
    {

        // This keyword refers to current instance itself
        this.nodeId = nodeId;
        this.weight = 0;
    }


    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
