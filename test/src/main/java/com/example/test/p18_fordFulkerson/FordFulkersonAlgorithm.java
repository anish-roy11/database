package com.example.test.p18_fordFulkerson;

import java.util.LinkedList;
import java.util.Queue;

public class FordFulkersonAlgorithm {

	static final int vertexCount = 6; // Number of vertices in the given graph

	// Returns tne maximum flow from s to t in the given graph
	int fordFulkerson(int graph[][], int s, int t) {
		int u, v;

		// Create a residual graph and fill the residual graph with the given capacities
		// in the original graph
		int rGraph[][] = new int[vertexCount][vertexCount];
		for (u = 0; u < vertexCount; u++) {
			for (v = 0; v < vertexCount; v++) {
				rGraph[u][v] = graph[u][v];
			}

		}

		int parent[] = new int[vertexCount]; // This array is filled by BFS and to store path

		int max_flow = 0; // There is no flow initially

		// Augument the flow while there is path from source to sink
		while (bfs(rGraph, s, t, parent)) {
			// Find minimum residual capacity of the edhes along the path filled by BFS. Or
			// we can say find the maximum flow through the path found.
			int path_flow = Integer.MAX_VALUE;
			for (v = t; v != s; v = parent[v]) {
				u = parent[v];
				path_flow = Math.min(path_flow, rGraph[u][v]);
			}

			// update residual capacities of the edges and reverse edges along the path
			for (v = t; v != s; v = parent[v]) {
				u = parent[v];
				rGraph[u][v] -= path_flow;
				rGraph[v][u] += path_flow;
			}

			// add path flow to overall flow
			max_flow += path_flow;
		}

		// Return the overall flow
		return max_flow;
	}

	// Returns true if there is a path from source 's' to sink 't' in
	// residual graph. Also fills parent[] to store the path
	boolean bfs(int rGraph[][], int s, int t, int parent[]) {
		boolean visited[] = new boolean[vertexCount];
		for (int i = 0; i < vertexCount; ++i) {
			visited[i] = false;
		}

		// Create a queue, enqueue source vertex and mark source vertex as visited
		Queue<Integer> queue = new LinkedList<>();
		queue.add(s);
		visited[s] = true;
		parent[s] = -1;

		// Standard BFS Loop
		while (!queue.isEmpty()) {
			int u = queue.poll();

			for (int v = 0; v < vertexCount; v++) {
				if (!visited[v] && rGraph[u][v] > 0) {
					// If we find a connection to the sink node, then there is no point in BFS
					// anymore. We just have to set its parent and can return true
					if (v == t) {
						parent[v] = u;
						return true;
					}
					queue.add(v);
					parent[v] = u;
					visited[v] = true;
				}
			}
		}

		// We didn't reach the sink
		return false;
	}
	
	
	
	
	
	
	
	
	

	// Driver program to test above functions
	public static void main(String[] args) throws Exception
	
	{
		// Let us create a graph shown in the above example
		//here each value represents the capacities between two nodes
		// i.e graph[i][j] represents the capacity between ith to jth node
		int graph[][] = new int[][] { 
			{ 0, 16, 13, 0, 0, 0 }, 
			{ 0, 0, 10, 12, 0, 0 }, 
			{ 0, 4, 0, 0, 14, 0 },
			{ 0, 0, 9, 0, 0, 20 }, 
			{ 0, 0, 0, 7, 0, 4 }, 
			{ 0, 0, 0, 0, 0, 0 } 
			};
			
		FordFulkersonAlgorithm fordFulkersonAlgorithmObj1 = new FordFulkersonAlgorithm();

		System.out.println("The maximum possible flow is " + fordFulkersonAlgorithmObj1.fordFulkerson(graph, 0, 5));
	}
}


