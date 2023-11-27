package OOP_1618.ADHOC.KE4.Parametrisierung;

public class Entry<ET> {
  ET element;
  Entry<ET> next;
  Entry<ET> previous;

  Entry(ET element, Entry<ET> next, Entry<ET> previous) {
    this.element = element;
    this.next = next;
    this.previous = previous;
  }
}
