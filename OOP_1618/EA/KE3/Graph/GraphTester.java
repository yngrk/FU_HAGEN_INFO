package OOP_1618.EA.KE3.Graph;

public class GraphTester {
  public static void main(String[] args) throws GraphException {
    String[] nodes = { "Deutschland", "Frankreich", "Spanien" };
    Graph g = new Graph(nodes);

    g.addEdge("Deutschland", "Frankreich");
    g.addEdge("Frankreich", "Spanien");

    System.out.println(g.isAdjacent("Deutschland", "Spanien"));
    System.out.println(g.isAdjacent("Frankreich", "Spanien"));
  }
}
