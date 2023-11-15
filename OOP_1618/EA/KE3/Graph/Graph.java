package OOP_1618.EA.KE3.Graph;

public class Graph {

  protected boolean[][] adjacencyMatrix;
  protected String[] nodes;

  protected int indexOf(String node) throws GraphException {
    for (int i = 0; i < nodes.length; i++) {
      if (node.equals(nodes[i])) {
        return i;
      }
    }
    throw new GraphException();
  }

  public Graph(int nodeNumber) {
    nodes = new String[nodeNumber];
    adjacencyMatrix = new boolean[nodeNumber][nodeNumber];
  }

  public Graph(String[] nodes) {
    this(nodes.length);
    for (int i = 0; i < nodes.length; i++) {
      this.nodes[i] = nodes[i];
    }
  }

  public String getNode(int index) throws GraphException {
    // ...liefert den Namen des Knotens an der
    // durch den Wert des Parameters bezeichneten Position,
    // wenn diese einen Knoten bezeichnet; sonst eine GraphException.
    if (index > nodes.length - 1 || index < 0) {
      throw new GraphException();
    }
    return nodes[index];
  }

  public int getNumberOfNodes() {
    // ...liefert die Anzahl der Knoten zurueck.
    return nodes.length;
  }

  public void setNodes(String[] nodes) {
    // ...weist den ersten k Elementen des Attributs nodes die
    // entsprechenden Werte des Parameters nodes zu. k ist dabei das
    // Minimum aus der Laenge des Attributs und des Parameters.
    int len = nodes.length > getNumberOfNodes() ? getNumberOfNodes() : nodes.length;

    for (int i = 0; i < len; i++) {
      this.nodes[i] = nodes[i];
    }
  }

  public boolean isAdjacent(int index1, int index2) throws GraphException {
    // ...liefert "wahr", wenn die Knoten mit Index
    // index1 und index2 benachbart sind, sonst "falsch".
    if (adjacencyMatrix[index1][index2] != adjacencyMatrix[index2][index1]) {
      throw new GraphException();
    }

    return adjacencyMatrix[index1][index2];
  }

  public boolean isAdjacent(String node1, String node2) throws GraphException {
    // ...liefert "wahr", wenn die Laender mit Namen
    // node1 und node2 benachbart sind, sonst "falsch".
    return isAdjacent(indexOf(node1), indexOf(node2));
  }

  public void addEdge(int index1, int index2) throws GraphException {
    // ...fuegt Kante zwischen den Knoten mit
    // Index index1 und index2 ein, wenn diese
    // Indizes von Laendern sind; sonst eine GraphException.
    if (index1 < 0 || index2 < 0) {
      throw new GraphException();
    }

    if (index1 > getNumberOfNodes() - 1 || index2 > getNumberOfNodes() - 1) {
      throw new GraphException();
    }

    adjacencyMatrix[index1][index2] = true;
    adjacencyMatrix[index2][index1] = true;
  }

  public void addEdge(String node1, String node2) throws GraphException {
    // ...fuegt Kante zwischen den Knoten mit
    // Laendernamen node1 und node2 ein, wenn diese
    // Knoten des Graphen bezeichnen; sonst eine GraphException.
    addEdge(indexOf(node1), indexOf(node2));
  }

}