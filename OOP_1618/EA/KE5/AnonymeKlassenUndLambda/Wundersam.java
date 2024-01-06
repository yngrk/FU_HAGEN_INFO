package OOP_1618.EA.KE5.AnonymeKlassenUndLambda;

public class Wundersam implements IntIntFunction {
  public int perform(int input) {
    return input % 2 == 0 ? input / 2 : input * 3 + 1;
  }
}
