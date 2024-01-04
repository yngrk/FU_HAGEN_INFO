package OOP_1618.ADHOC.KE5.Filter;

import java.util.ArrayList;
import java.util.List;

class PalindromeFilterTest {
  public static void main(String[] args) {
    ArrayList<String> source = new ArrayList<>();

    source.add("NotPalindrone");
    source.add("Maoam");

    Filter<String> f = new Filter<String>(source);
    List<String> filtered = f.filter((str) -> {
      StringBuilder sb = new StringBuilder(str);
      String reversed = sb.reverse().toString();

      return str.toLowerCase().equals(reversed.toLowerCase());
    });

    for (String str : filtered) {
      System.out.println(str);
    }
  }
}
