package OOP_1618.EA.KE1;

public class Summierer {
  public static void main(String[] args) {
    Summierer summierer = new Summierer();
    int n = Integer.parseInt(args[0]);

    System.out.println("Ergebnis kleiner Gauss: " + summierer.kleinerGauss(n));
    System.out.println("Ergebnis mit for-Schleife: " + summierer.forSumme(n));
    System.out.println("Ergebnis rekursiv: " + summierer.rekursiveSumme(n));
  }

  int kleinerGauss(int n) {
    return (n * (n + 1)) / 2;
  }

  int forSumme(int n) {
    int res = 0;
    for (int i = 1; i <= n; i++) {
      res += i;
    }
    return res;
  }

  int rekursiveSumme(int n) {
    if (n == 1) {
      return n;
    }

    return n + rekursiveSumme(n - 1);
  }
}