package OOP_1618.ADHOC.KE3.Klassifikation_und_Subtyping;

class PDFDocument implements Printable {
  private String content;

  PDFDocument(String content) {
    this.content = content;
  }

  public void print() {
    System.out.println(content);
  }
}
