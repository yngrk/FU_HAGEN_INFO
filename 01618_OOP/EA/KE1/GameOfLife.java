public class GameOfLife {
  boolean[][] feld = {
      { false, false, false, false, false },
      { false, false, true, false, false },
      { false, false, true, false, false },
      { false, false, true, false, false },
      { false, false, false, false, false } };

  void print() {
    for (int i = 0; i < feld.length; i++) {
      for (int j = 0; j < feld[i].length; j++) {
        if (feld[i][j]) {
          System.out.print("o ");
        } else {
          System.out.print(". ");
        }
      }
      System.out.println();
    }
  }

  void nextGeneration() {
    // feld kopieren
    boolean[][] newFeld = new boolean[feld.length][feld[0].length];
    for (int i = 0; i < feld.length; i++) {
      for (int j = 0; j < feld[0].length; j++) {
        newFeld[i][j] = feld[i][j];
      }
    }

    // Randindizes werden ignoriert da immer false
    for (int i = 1; i < newFeld.length - 1; i++) {
      for (int j = 1; j < newFeld[0].length - 1; j++) {
        int count = 0;
        // Betrache Nachbarfelder
        for (int k = i - 1; k <= i + 1; k++) {
          for (int l = j - 1; l <= j + 1; l++) {
            // mittleres Feld kann ignoriert werden
            if (k == i && l == j) {
              continue;
            }

            if (feld[k][l]) {
              count += 1;
            }
          }
        }

        if (feld[i][j] && count > 1 && count < 4) {
          newFeld[i][j] = true;
        } else if (count < 2 || count > 3) {
          newFeld[i][j] = false;
        } else if (!feld[i][j] && count == 3) {
          newFeld[i][j] = true;
        }
      }
    }
    feld = newFeld;
  }

  public static void main(String[] args) {
    GameOfLife myGame = new GameOfLife();
    for (int i = 0; i < 10; i++) {
      myGame.nextGeneration();
      myGame.print();
      System.out.println();
    }
  }
}