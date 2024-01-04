package OOP_1618.ADHOC.KE5.Filter;

interface FilterPredicate<T> {
  boolean isMatching(T candidate);
}
