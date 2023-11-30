package DS_1663.ADHOC.KE4.Graphen;

import java.util.ArrayList;
import java.util.Arrays;

class DepthFirstTraversal {
  void searchAdjList(ArrayList<ArrayList<Integer>> adjList, boolean[] visited, int src) {
    if (visited[src]) {
      return;
    }

    visited[src] = true;
    for (int i = 0; i < adjList.get(src).size(); i++) {
      searchAdjList(adjList, visited, adjList.get(src).get(i));
    }
  }

  void searchAdjMatrix(boolean[][] adjMatrix, boolean[] visited, int src) {
    if (visited[src]) {
      return;
    }

    visited[src] = true;
    for (int i = 0; i < adjMatrix.length; i++) {
      if (adjMatrix[src][i]) {
        searchAdjMatrix(adjMatrix, visited, i);
      }
    }
  }

  public static void main(String[] args) {
    int size = 6;

    NoCostDirectionalGraph g = new NoCostDirectionalGraph();
    boolean[] visited = new boolean[size];

    System.out.println(Arrays.toString(visited));

    DepthFirstTraversal dfs = new DepthFirstTraversal();
    /* dfs.searchAdjList(g.getAdjList(), visited, 0); */
    dfs.searchAdjMatrix(g.getAdjMatrix(), visited, 0);

    System.out.println(Arrays.toString(visited));
  }
}
