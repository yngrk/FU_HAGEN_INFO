package DS_1663.ADHOC.KE5;

import java.util.Arrays;

class Floyd {
  static float[][] searchAdjMatrix(float[][] adjMatrix) {
    int size = adjMatrix.length;

    float[][] shortestPaths = new float[size][size];
    // populate shortestPaths
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        shortestPaths[i][j] = adjMatrix[i][j];
      }
    }

    /* predecessor */
    for (int i = 0; i < size; i++) {
      /* node */
      for (int j = 0; j < size; j++) {
        /* successor */
        for (int k = 0; k < size; k++) {

          if (shortestPaths[i][j] + shortestPaths[j][k] < shortestPaths[i][k]) {
            shortestPaths[i][k] = shortestPaths[i][j] + shortestPaths[j][k];
          }

        }
      }
    }

    return shortestPaths;
  }

  public static void main(String[] args) {
    WeightedDirectedGraph g = new WeightedDirectedGraph();

    float[][] paths = searchAdjMatrix(g.getAdjMatrix());

    for (int i = 0; i < paths.length; i++) {
      System.out.println(Arrays.toString(paths[i]));
    }
  }
}
