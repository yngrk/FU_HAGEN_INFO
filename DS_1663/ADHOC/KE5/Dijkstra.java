package DS_1663.ADHOC.KE5;

import java.util.ArrayList;
import java.util.Arrays;

class Dijkstra {
  static void searchAdjMatrix(int[][] adjMatrix, float[] dist, int[] parent, int source) {
    int size = adjMatrix.length;
    boolean[] visited = new boolean[size];
    dist[source] = 0;

    for (int n = 0; n < size; n++) {
      // find lowest dist index
      int minIndex = -1;
      float minWeight = Float.MAX_VALUE;

      for (int i = 0; i < dist.length; i++) {
        if (!visited[i] && minWeight > dist[i]) {
          minIndex = i;
          minWeight = dist[i];
        }
      }

      if (minIndex == -1) {
        return;
      }

      visited[minIndex] = true;

      // check distances
      for (int i = 0; i < size; i++) {
        if (dist[minIndex] + adjMatrix[minIndex][i] < dist[i]) {
          // update dist if a shorter path is found
          dist[i] = dist[minIndex] + adjMatrix[minIndex][i];
          parent[i] = minIndex;
        }
      }
    }
  }

  static void searchAdjList(ArrayList<ArrayList<Edge>> adjList, float[] dist, int[] parent, int source) {
    int nodes = adjList.size();
    boolean[] visited = new boolean[nodes];

    dist[source] = 0;

    for (int n = 0; n < nodes; n++) {
      // find min dist
      int minIndex = -1;
      float minWeight = Float.MAX_VALUE;

      for (int i = 0; i < dist.length; i++) {
        if (!visited[i] && minWeight > dist[i]) {
          minIndex = i;
          minWeight = dist[i];
        }
      }

      if (minIndex == -1) {
        return;
      }

      visited[minIndex] = true;

      for (int i = 0; i < adjList.get(minIndex).size(); i++) {
        int dstIndex = adjList.get(minIndex).get(i).getDst();
        float dstWeight = adjList.get(minIndex).get(i).getWeight();

        if (dist[minIndex] + dstWeight < dist[dstIndex]) {
          dist[dstIndex] = dist[minIndex] + dstWeight;
          parent[dstIndex] = minIndex;
        }
      }
    }
  }

  public static void main(String[] args) {
    WeightedDirectedGraph g = new WeightedDirectedGraph();
    int size = g.getAdjMatrix().length;
    float[] dist = new float[size];
    int[] parent = new int[size];

    // init
    for (int i = 0; i < size; i++) {
      dist[i] = Float.MAX_VALUE;
      parent[i] = -1;
    }

    /* searchAdjMatrix(g.getAdjMatrix(), dist, parent, 0); */
    searchAdjList(g.getAdjList(), dist, parent, 0);

    System.out.println("dist: " + Arrays.toString(dist));
    System.out.println("parent: " + Arrays.toString(parent));
  }
}
