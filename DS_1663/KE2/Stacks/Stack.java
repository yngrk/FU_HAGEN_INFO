package DS_1663.KE2.Stacks;

// Stack Darstellung im Array
class Stack {
  int size;
  int top = 0;
  Elem[] arr;

  boolean isempty() {
    return arr[top] == null && top == 0;
  }

  Stack(int size) {
    this.size = size;
    arr = new Elem[size];
  }

  Stack push(Elem e) {
    // full
    if (top == size - 1) {
      return this;
    }

    if (isempty()) {
      arr[0] = e;
      return this;
    }

    arr[top + 1] = e;
    top += 1;
    return this;
  }

  Elem pop() {
    if (isempty()) {
      return null;
    }

    Elem e;

    e = arr[top];
    arr[top] = null;

    if (top > 0) {
      top -= 1;
    }

    return e;
  }

  public String toString() {
    String s = "";
    for (int i = 0; i <= top; i++) {
      s += " " + arr[i];
    }
    return s;
  }
}
