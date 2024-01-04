package OOP_1618.ADHOC.KE5.Filter;

import java.util.ArrayList;
import java.util.List;

class Filter<T> {
  private List<T> sourceList;

  Filter(List<T> sourceList) {
    this.sourceList = sourceList;
  }

  List<T> filter(FilterPredicate<T> filterPredicate) {
    ArrayList<T> resultList = new ArrayList<>();

    for (T element : sourceList) {
      if (filterPredicate.isMatching(element)) {
        resultList.add(element);
      }
    }

    return resultList;
  }
}
