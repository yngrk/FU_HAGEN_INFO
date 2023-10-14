package OOP_1618.ADHOC.EA2.LinkedList1618;

import java.util.NoSuchElementException;

public class LinkedList1618 {
  public Entry header = new Entry(null, null, null);
  public int size;

  public LinkedList1618() {
    header.next = header;
    header.previous = header;
  }

  public Person getLast() throws NoSuchElementException {
    if (size == 0) {
      throw new NoSuchElementException();
    }
    return header.previous.element;
  }

  public Person removeLast() throws NoSuchElementException {
    Entry lastEntry = header.previous;
    if (lastEntry == header) {
      throw new NoSuchElementException();
    }
    lastEntry.previous.next = lastEntry.next;
    lastEntry.next.previous = lastEntry.previous;
    size -= 1;
    return lastEntry.element;
  }

  public void addLast(Person p) {
    Entry newEntry = new Entry(p, header, header.previous);
    header.previous.next = newEntry;
    header.previous = newEntry;
    size += 1;
  }

  public int size() {
    return size;
  }

  public Person getElementAt(int position) throws NoSuchElementException {
    if (position >= size || position < 0) {
      throw new NoSuchElementException();
    }

    Entry currentEntry = header.next;
    for (int i = 0; i < position; i++) {
      currentEntry = currentEntry.next;
    }

    return currentEntry.element;
  }
}
