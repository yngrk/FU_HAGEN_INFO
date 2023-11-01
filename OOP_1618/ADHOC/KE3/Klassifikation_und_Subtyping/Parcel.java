package OOP_1618.ADHOC.KE3.Klassifikation_und_Subtyping;

class Parcel extends PostalItem {
  private String contentDescription;

  Parcel(double weight, String contentDescription) {
    super(weight);
    this.contentDescription = contentDescription;
  }

  String getContentDescription() {
    return contentDescription;
  }
}
