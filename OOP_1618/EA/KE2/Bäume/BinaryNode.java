package OOP_1618.EA.KE2.Bäume;

public class BinaryNode {
  private BinaryNode leftSon, rightSon;
  private int value;

  public BinaryNode(int v) {
    value = v;
  }

  public boolean contains(int v) {
    BinaryNode pointer = this;

    while (pointer != null && pointer.value != v) {
      if (v < pointer.value) {
        pointer = pointer.leftSon;
      } else {
        pointer = pointer.rightSon;
      }
    }

    if (pointer == null) {
      return false;
    }

    return true;
  }

  public void insert(int v) {
    if (contains(v)) {
      return;
    }

    BinaryNode pointer = this;
    BinaryNode parent = this;

    while (pointer != null) {
      if (v < pointer.value) {
        parent = pointer;
        pointer = pointer.leftSon;
      } else {
        parent = pointer;
        pointer = pointer.rightSon;
      }
    }

    if (v < parent.value) {
      parent.leftSon = new BinaryNode(v);
    } else {
      parent.rightSon = new BinaryNode(v);
    }
  }

  public void inorder() {
    /**
     * order: This>Left>Right
     */

    System.out.println(value);

    if (leftSon != null) {
      leftSon.inorder();
    }

    if (rightSon != null) {
      rightSon.inorder();
    }
  }

  public class TestTree {
    public static void main(String[] args) {
      BinaryNode myTree = new BinaryNode(6);
      myTree.insert(5);
      myTree.insert(4);
      myTree.insert(12);
      myTree.insert(11);
      myTree.insert(10);

      myTree.inorder();
    }
  }
}
