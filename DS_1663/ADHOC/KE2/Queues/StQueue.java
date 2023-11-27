package DS_1663.ADHOC.KE2.Queues;

import java.util.Stack;

class StQueue {
  private Stack<Elem> s1 = new Stack<>();
  private Stack<Elem> s2 = new Stack<>();

  boolean isempty() {
    return s1.isEmpty();
  }

  StQueue enqueue(Elem e) {
    s1.push(e);
    return this;
  }

  StQueue dequeue() {
    while (!s1.isEmpty()) {
      s2.push(s1.pop());
    }

    s2.pop();

    while (!s2.isEmpty()) {
      s1.push(s2.pop());
    }

    return this;
  }

  Elem front() {
    Elem e;

    while (!s1.isEmpty()) {
      s2.push(s1.pop());
    }

    e = s2.pop();

    while (!s2.isEmpty()) {
      s1.push(s2.pop());
    }

    return e;
  }

  void print() {
    System.out.println("--- FIRST ---");

    while (!s1.isEmpty()) {
      Elem e = s1.pop();
      s2.push(e);
    }

    while (!s2.isEmpty()) {
      Elem e = s2.pop();
      s1.push(e);
      System.out.println(e.getValue() + ", ");
    }

    System.out.println("--- LAST ---");
  }

  static class Elem {
    private int value;

    Elem(int value) {
      this.value = value;
    }

    int getValue() {
      return value;
    }
  }

  public static void main(String[] args) {
    StQueue s = new StQueue();
    for (int i = 1; i <= 3; i++) {
      s.enqueue(new Elem(i));
    }

    s.print();
  }

}
