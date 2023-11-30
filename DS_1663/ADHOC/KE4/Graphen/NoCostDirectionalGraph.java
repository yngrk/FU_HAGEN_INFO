package DS_1663.ADHOC.KE4.Graphen;

import java.util.ArrayList;

class NoCostDirectionalGraph {
  private ArrayList<ArrayList<Integer>> adjList;
  private boolean[][] adjMatrix;

  NoCostDirectionalGraph() {
    int size = 6;
    adjList = new ArrayList<>();
    adjMatrix = new boolean[size][size];

    // init
    for (int i = 0; i < size; i++) {
      adjList.add(new ArrayList<>());
      for (int j = 0; j < size; j++) {
        adjMatrix[i][j] = false;
      }
    }

    // populate
    addEdge(0, 3);
    addEdge(0, 0);
    addEdge(0, 5);
    addEdge(1, 5);
    addEdge(1, 2);
    addEdge(2, 3);
    addEdge(3, 1);
    addEdge(4, 5);
    addEdge(4, 3);
    addEdge(5, 3);
  }

  NoCostDirectionalGraph(int size) {
    adjList = new ArrayList<>();
    adjMatrix = new boolean[size][size];

    // init
    for (int i = 0; i < size; i++) {
      adjList.add(new ArrayList<>());
      for (int j = 0; j < size; j++) {
        adjMatrix[i][j] = false;
      }
    }
  }

  void addEdge(int src, int dst) {
    if (adjList.get(src).contains(dst) || adjMatrix[src][dst]) {
      return;
    }

    adjList.get(src).add(dst);
    adjMatrix[src][dst] = true;
  }

  ArrayList<ArrayList<Integer>> getAdjList() {
    return adjList;
  }

  boolean[][] getAdjMatrix() {
    return adjMatrix;
  }
}
