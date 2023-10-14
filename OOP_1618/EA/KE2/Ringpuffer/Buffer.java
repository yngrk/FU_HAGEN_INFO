package OOP_1618.EA.KE2.Ringpuffer;

public class Buffer {
  private Entry first;
  private int size;

  // constructor
  public Buffer(int size) throws IllegalArgumentException {
    if (size < 0) {
      throw new IllegalArgumentException();
    }

    if (size == 0) {
      size = 1;
    }

    /**
     * create inital Entry object with next and previous pointing to itself
     */
    first = new Entry(null, null, null);
    first.next = first;
    first.previous = first;
    this.size += 1;

    /**
     * based on size parameter create new Entry objects
     * the next pointer always points back to first since the
     * newest Entry will be the last in the Buffer
     */
    Entry pointer = first;
    for (int i = 1; i < size; i++) {
      pointer.next = new Entry(null, first, pointer);

      this.size += 1;

      first.previous = pointer.next;

      pointer = pointer.next;
    }
  }

  public void insert(String str) {
    /**
     * insert str in first.element
     * shift all values
     * throw away last Entry element value
     */
    Entry pointer = first.previous;

    while (pointer != first) {
      pointer.element = pointer.previous.element;
      pointer = pointer.previous;
    }

    first.element = str;
  }

  public void print() {
    if (size == 1) {
      System.out.print("[ " + first.element + " ]");
      return;
    }

    System.out.print("[ FIRST:" + first.element + " | ");
    Entry pointer = first.next;
    for (int i = 1; i < size - 1; i++) {
      System.out.print(pointer.element + " | ");
      pointer = pointer.next;
    }
    System.out.println("LAST:" + first.previous.element + " ]");
  }

  private static class Entry {
    private String element;
    private Entry next;
    private Entry previous;

    private Entry(String element, Entry next, Entry previous) {
      this.element = element;
      this.next = next;
      this.previous = previous;
    }
  }
}
