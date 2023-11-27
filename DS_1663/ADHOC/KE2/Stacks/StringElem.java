package DS_1663.ADHOC.KE2.Stacks;

class StringElem implements Elem {
  private String value;

  StringElem(String value) {
    this.value = value;
  }

  public String toString() {
    return "" + value;
  }
}
