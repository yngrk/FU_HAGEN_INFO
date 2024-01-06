package OOP_1618.EA.KE5.AnonymeKlassenUndLambda;

public class FunctionOperator {
  public int operate(IntIntFunction f, int start, int target) {
    int counter = 0;
    int value = start;
    while (value != target) {
      value = f.perform(value);
      counter += 1;
    }
    return counter;
  }
}
