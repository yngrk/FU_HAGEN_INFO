package OOP_1618.ADHOC.KE4.Parametrisierung;

import java.util.NoSuchElementException;

class ListWithArray<ET> {
  Object[] store;
  int freeIdx;

  ListWithArray(int size) {
    store = new Object[size];
    freeIdx = 0;
  }

  private void expand() {
    Object[] newStore = new Object[store.length * 2];
    for (int i = 0; i < store.length; i++) {
      newStore[i] = store[i];
    }
    store = newStore;
  }

  void addLast(ET e) {
    if (freeIdx >= store.length) {
      expand();
    }
    store[freeIdx] = e;
    freeIdx++;
  }

  ET getLast() {
    if (freeIdx <= 0) {
      throw new NoSuchElementException();
    }
    return (ET) store[freeIdx];
  }

  ET removeLast() {
    if (freeIdx <= 0) {
      throw new NoSuchElementException();
    }
    ET last = getLast();
    store[freeIdx] = null;
    freeIdx--;
    return last;
  }
}
