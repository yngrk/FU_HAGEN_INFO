package OOP_1618.ADHOC.KE5.Filter;

class PredicateShortName implements FilterPredicate<Person> {
  @Override
  public boolean isMatching(Person person) {
    return person.getName().length() < 5;
  }
}
