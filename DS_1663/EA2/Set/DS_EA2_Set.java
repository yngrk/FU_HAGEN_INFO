package DS_1663.EA2.Set;

public class DS_EA2_Set {
  private boolean[] arr;
  private Pointer p;

  private class Pointer {
    private int index;
    private Pointer next;
    private Pointer previous;

    private Pointer(int index) {
      this.index = index;
    }
  }

  public DS_EA2_Set(int max) {
    arr = new boolean[max];
  }

  public boolean isempty() {
    return p == null;
  }

  public DS_EA2_Set insert(int value) {
    if (value > arr.length) {
      return this;
    }

    if (contains(value)) {
      return this;
    }

    arr[value - 1] = true;

    if (isempty()) {
      p = new Pointer(value - 1);
      return this;
    }

    p.next = new Pointer(value - 1);
    p.next.previous = p;
    p = p.next;
    return this;
  }

  public boolean contains(int value) {
    return arr[value - 1];
  }

  public DS_EA2_Set remove() {
    if (isempty()) {
      return this;
    }

    arr[p.index] = false;

    if (p.previous == null) {
      p = null;
      return this;
    }

    p = p.previous;
    p.next = null;

    return this;
  }

}
