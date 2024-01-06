package OOP_1618.EA.KE5.AnonymeKlassenUndLambda;

public class Main {
  public static void main(String[] args) {
    FunctionOperator op = new FunctionOperator();

    int result = op.operate((input) -> {
      return input % 2 == 0 ? input / 2 : input * 3 + 1;
    }, 27, 1);

    System.out.println(result);
  }
}
