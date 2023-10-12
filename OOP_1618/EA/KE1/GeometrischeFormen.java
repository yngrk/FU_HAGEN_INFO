package OOP_1618.EA.KE1;

public class GeometrischeFormen {
  public static void main(String[] args) {
    String form = args[0];
    if (form.equals("Quadrat")) {
      System.out.println("Vier Ecken");
      System.out.println("Vier Symmetrieachsen");
      System.out.println("Ist punktsymmetrisch");
      System.out.println("Ist geschlossen");
    } else if (form.equals("Kreis")) {
      System.out.println("Keine Ecken");
      System.out.println("Unendlich viele Symmetrieachsen");
      System.out.println("Ist punktsymmetrisch");
      System.out.println("Ist geschlossen");
    } else if (form.equals("Dreieck")) {
      System.out.println("Drei Ecken");
      System.out.println("Drei Symmetrieachsen");
      System.out.println("Kann punktsymmetrisch sein, wenn es ein gleichseitiges Dreieck ist");
      System.out.println("Ist geschlossen");
    } else if (form.equals("Rechteck")) {
      System.out.println("Vier Ecken");
      System.out.println("Zwei Symmetrieachsen");
      System.out.println("Kann punktsymmetrisch sein, wenn es ein Quadrat ist");
      System.out.println("Ist geschlossen");
    } else if (form.equals("Ellipse")) {
      System.out.println("Keine Ecken");
      System.out.println("Zwei Achsen");
      System.out.println("Kann punktsymmetrisch sein, wenn die Achsen gleich lang sind");
      System.out.println("Ist geschlossen");
    } else if (form.equals("Parallelogramm")) {
      System.out.println("Vier Ecken");
      System.out.println("Keine Symmetrieachsen (außer bei einem Rechteck oder Quadrat)");
      System.out.println(
          "Kann punktsymmetrisch sein, wenn die gegenüberliegenden Seiten gleich lang sind und die Ecken sich in der Mitte treffen");
      System.out.println("Ist geschlossen");
    } else if (form.equals("Pentagon")) {
      System.out.println("Fünf Ecken");
      System.out.println("Fünf Symmetrieachsen");
      System.out.println("Kann punktsymmetrisch sein, wenn es ein regelmäßiges Fünfeck ist");
      System.out.println("Ist geschlossen");
    } else if (form.equals("Raute")) {
      System.out.println("Vier Ecken");
      System.out.println("Zwei Symmetrieachsen ");
      System.out.println("Kann punktsymmetrisch sein, wenn die Winkel gleich sind");
      System.out.println("Ist geschlossen");
    } else if (form.equals("Sechseck ")) {
      System.out.println("Sechs Ecken");
      System.out.println("Sechs Symmetrieachsen ");
      System.out.println("Kann punktsymmetrisch sein, wenn es ein regelmäßiges Sechseck ist");
      System.out.println("Ist geschlossen");
    } else if (form.equals("Trapez")) {
      System.out.println("Vier Ecken");
      System.out.println("Keine Symmetrieachsen");
      System.out.println(
          "Kann punktsymmetrisch sein, wenn die beiden nichtparallelen Seiten gleich lang sind und die Ecken sich in der Mitte treffen");
      System.out.println("Ist geschlossen");
    }
  }
}
