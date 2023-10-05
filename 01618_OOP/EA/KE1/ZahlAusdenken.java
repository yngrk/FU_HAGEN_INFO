class ZahlAusdenken {
  public static void main(String[] args) throws Exception {
    try {
      int startzahl = Integer.parseInt(args[0]);
      int ergebnis = startzahl;

      /**
       * addiere 2 zum Betrag von ergebnis
       */
      if (ergebnis > 0) {
        ergebnis = ergebnis + 2;
      } else {
        ergebnis = ergebnis * (-1) + 2;
      }

      /**
       * subtrahiere von ergebnis jeweils 2, solange ergebnis größer als 2 ist
       */
      while (ergebnis > 2) {
        ergebnis = ergebnis - 2;
      }

      int arbeiten = 4;

      /**
       * solange i kleiner oder gleich 20:
       * addiere 2 zu i
       * addiere startzahl zu arbeiten
       */
      for (int i = 2; i <= 20; i = i + 2) {
        arbeiten = arbeiten + startzahl;
      }

      /**
       * ist ergebnis 0:
       * gebe aus "Das kann nicht sein!"
       * 
       * ist ergebnis 1:
       * gebe aus "Die urspruengliche Zahl war ungerade!"
       * 
       * ist ergebnis 2:
       * gebe aus "Die urspruengliche Zahl war gerade!"
       * 
       * in allen anderen Fällen:
       * gebe aus "Fehler!"
       */
      switch (ergebnis) {
        case 0:
          System.out.println("Das kann nicht sein!");
          break;
        case 1:
          System.out.println("Die urspruengliche Zahl war ungerade!");
          break;
        case 2:
          System.out.println("Die urspruengliche Zahl war gerade!");
          break;
        default:
          System.out.println("Fehler!");
      }

      System.out.println("startzahl = " + startzahl);
    } catch (Exception e) {
      System.out.println("ERROR: " + e);
    }
  }
}