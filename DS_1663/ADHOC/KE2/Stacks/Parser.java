package DS_1663.ADHOC.KE2.Stacks;

public class Parser {
  public static void main(String[] args) {
    String arithmetic = "((6*(4*28))+(9-((12/4)*2)))";

    Stack operands = new Stack(10);
    Stack operations = new Stack(10);

    Stack numbers = new Stack(10);

    for (int i = 0; i < arithmetic.length(); i++) {
      String c = String.valueOf(arithmetic.charAt(i));

      if (isNumber(c)) {
        numbers.push(new StringElem(c));
      }

      if (!isNumber(c) && !numbers.isempty()) {
        String s = "";

        while (!numbers.isempty()) {
          s = "" + numbers.pop().toString() + s;
        }

        operands.push(new StringElem(s));
      }

      if (isOp(c)) {
        operations.push(new StringElem(c));
      }

      if (c.equals(")")) {
        String operation = operations.pop().toString();
        String b = operands.pop().toString();
        String a = operands.pop().toString();

        operands.push(new StringElem("" + doOp(operation, a, b)));
      }
    }

    System.out.println(operands.toString());
  }

  public static boolean isNumber(String num) throws NumberFormatException {
    try {
      Integer.parseInt(num);
      return true;
    } catch (NumberFormatException e) {
      return false;
    }
  }

  public static boolean isOp(String op) {
    String ops = "+-/*";
    return ops.contains(op);
  }

  public static int doOp(String op, String aStr, String bStr) {
    try {
      int a = Integer.parseInt(aStr);
      int b = Integer.parseInt(bStr);

      switch (op) {
        case "+":
          return a + b;
        case "-":
          return a - b;
        case "*":
          return a * b;
        case "/":
          return a / b;
        default:
          throw new Exception("Operation not found.");
      }
    } catch (Exception e) {
      System.out.println(e);
      return -1;
    }

  }
}
