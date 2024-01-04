package DS_1663.ADHOC.KE5;

public class Edge {
  private int src;
  private int dst;
  private float weight;

  Edge(int src, int dst, float weight) {
    this.src = src;
    this.dst = dst;
    this.weight = weight;
  }

  int getSrc() {
    return src;
  }

  int getDst() {
    return dst;
  }

  float getWeight() {
    return weight;
  }
}
