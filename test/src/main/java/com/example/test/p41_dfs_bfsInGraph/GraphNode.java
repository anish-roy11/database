package com.example.test.p41_dfs_bfsInGraph;

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
