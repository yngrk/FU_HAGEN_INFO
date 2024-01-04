package OOP_1618.ADHOC.KE5.Filter;

class PredicateNotFat implements FilterPredicate<Person> {
  @Override
  public boolean isMatching(Person p) {
    return p.getWeight() < 60.0;
  }
}
