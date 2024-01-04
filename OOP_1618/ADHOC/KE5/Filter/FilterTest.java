package OOP_1618.ADHOC.KE5.Filter;

import java.util.ArrayList;
import java.util.List;

class FilterTest {
  public static void main(String[] args) {
    ArrayList<Person> source = new ArrayList<>();

    source.add(new Person("LangerNameVollLang", 71));
    source.add(new Person("AnotherLongAssName", 50));
    source.add(new Person("kurz", 88));

    Filter<Person> f = new Filter<Person>(source);

    List<Person> filterResult = f.filter(new PredicateNotFat());

    for (Person p : filterResult) {
      System.out.println(p.getName());
    }
  }
}
