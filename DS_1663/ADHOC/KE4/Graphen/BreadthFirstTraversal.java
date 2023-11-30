package DS_1663.ADHOC.KE4.Graphen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstTraversal {
  void searchAdjList(ArrayList<ArrayList<Integer>> adjList, boolean[] visited, int src) {
    Queue<Integer> q = new LinkedList<>();
    q.offer(src);
    visited[src] = true;

    while (!q.isEmpty()) {
      int node = q.poll();
      for (int i = 0; i < adjList.get(node).size(); i++) {
        int childNode = adjList.get(node).get(i);
        if (!visited[childNode]) {
          q.offer(childNode);
          visited[childNode] = true;
        }
      }
    }
  }

  void searchAdjMatrix(boolean[][] adjMatrix, boolean[] visited, int src) {
    Queue<Integer> q = new LinkedList<>();
    q.offer(src);
    visited[src] = true;

    while (!q.isEmpty()) {
      int node = q.poll();
      for (int i = 0; i < adjMatrix.length; i++) {
        if (adjMatrix[node][i] && !visited[i]) {
          q.offer(i);
          visited[i] = true;
        }
      }
    }
  }

  public static void main(String[] args) {
    int size = 6;

    NoCostDirectionalGraph g = new NoCostDirectionalGraph();
    boolean[] visited = new boolean[size];

    System.out.println(Arrays.toString(visited));

    BreadthFirstTraversal bfs = new BreadthFirstTraversal();
    /* bfs.searchAdjList(g.getAdjList(), visited, 0); */
    bfs.searchAdjMatrix(g.getAdjMatrix(), visited, 0);

    System.out.println(Arrays.toString(visited));
  }
}
