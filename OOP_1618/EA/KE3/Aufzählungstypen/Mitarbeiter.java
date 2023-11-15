package OOP_1618.EA.KE3.Aufzählungstypen;

enum Dienstgrad {
  HELFER,
  TRUPPFUEHRER,
  GRUPPENFUEHRER,
  ZUGTRUPPFUEHRER,
  ZUGFUEHRER;

  static void printAll() {
    for (Dienstgrad d : Dienstgrad.values()) {
      System.out.println(d.toString());
    }
  }

  @Override
  public String toString() {
    switch (this) {
      case HELFER:
        return "Helfer";
      case TRUPPFUEHRER:
        return "Truppführer";
      case GRUPPENFUEHRER:
        return "Gruppenführer";
      case ZUGTRUPPFUEHRER:
        return "Zugtruppführer";
      case ZUGFUEHRER:
        return "Zugführer";
      default:
        return "";
    }
  }

  public boolean istVorgesetzterVor(Dienstgrad d) {
    return this.ordinal() > d.ordinal();
  }

  public static void main(String[] args) {
    printAll();

    System.out.println(HELFER.istVorgesetzterVor(GRUPPENFUEHRER));
    System.out.println(TRUPPFUEHRER.istVorgesetzterVor(HELFER));
    System.out.println(GRUPPENFUEHRER.istVorgesetzterVor(GRUPPENFUEHRER));
  }
}
