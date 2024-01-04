package DS_1663.ADHOC.KE5;

import java.util.ArrayList;

class WeightedDirectedGraph {
  private ArrayList<ArrayList<Edge>> adjList;
  private float[][] adjMatrix;

  // example Graph
  WeightedDirectedGraph() {
    int size = 6;

    // create graph representation formats
    adjList = new ArrayList<>();
    adjMatrix = new float[size][size];

    // init
    for (int i = 0; i < size; i++) {
      // populate adjList with empty sublists
      adjList.add(new ArrayList<>());

      // populate adjMatrix with inf weight for all edges
      for (int j = 0; j < size; j++) {
        adjMatrix[i][j] = Float.MAX_VALUE;
      } // end for j
    } // end for i

    // A
    addEdge(0, 1, 30);
    addEdge(0, 5, 90);
    addEdge(0, 4, 100);

    // B
    addEdge(1, 2, 10);
    addEdge(1, 3, 40);

    // C
    addEdge(2, 0, 40);
    addEdge(2, 5, 10);

    // D
    addEdge(3, 4, 30);

    // F
    addEdge(5, 4, 20);
  }

  WeightedDirectedGraph(int numVertices) {
    // create graph representation formats
    adjList = new ArrayList<>();
    adjMatrix = new float[numVertices][numVertices];

    // init
    for (int i = 0; i < numVertices; i++) {
      // populate adjList with empty sublists
      adjList.add(new ArrayList<>());

      // populate adjMatrix with inf weight for all edges
      for (int j = 0; j < numVertices; j++) {
        adjMatrix[i][j] = Integer.MAX_VALUE;
      } // end for j
    } // end for i
  }

  void addEdge(int src, int dst, int weight) {
    adjList.get(src).add(new Edge(src, dst, weight));
    adjMatrix[src][dst] = weight;
  }

  ArrayList<ArrayList<Edge>> getAdjList() {
    return adjList;
  }

  float[][] getAdjMatrix() {
    return adjMatrix;
  }
}
