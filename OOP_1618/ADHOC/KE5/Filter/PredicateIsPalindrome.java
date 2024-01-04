package OOP_1618.ADHOC.KE5.Filter;

class PredicateIsPalindrome implements FilterPredicate<String> {
  @Override
  public boolean isMatching(String source) {
    StringBuilder sb = new StringBuilder(source);
    String reversed = sb.reverse().toString();

    return source.toLowerCase().equals(reversed.toLowerCase());
  }
}
