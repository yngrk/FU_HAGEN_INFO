package OOP_1618.ADHOC.KE3.Klassifikation_und_Subtyping;

class Letter extends PostalItem implements Printable {
  private String message;

  Letter(double weight, String message) {
    super(weight);
    this.message = message;
  }

  public void print() {
    System.out.println(message);
  }
}
