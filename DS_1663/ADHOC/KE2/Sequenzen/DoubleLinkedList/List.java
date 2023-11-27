package DS_1663.ADHOC.KE2.Sequenzen.DoubleLinkedList;

class List extends Pos {
  Pos front() {
    return this;
  }

  Pos last() {
    return this.pred;
  }

  Pos next(Pos p) {
    return p.succ;
  }

  Pos previous(Pos p) {
    return p.pred;
  }

  boolean eol(Pos p) {
    return next(p) == null;
  }

  boolean bol(Pos p) {
    return previous(p) == last();
  }

  boolean isempty() {
    return next(front()) == null;
  }

  Pos insert(Pos p, Elem e) {
    Pos q = new Pos();
    q.value = e;

    if (isempty() || eol(p)) {
      q.pred = front();
      q.succ = null;

      this.succ = q;
      this.pred = q;

      return this;
    }

    q.succ = p.succ;
    q.pred = p;
    p.succ.pred = q;
    p.succ = q;

    return this;
  }

  Pos concat(List l) {
    if (isempty()) {
      return l;
    }

    if (l.isempty()) {
      return this;
    }

    Pos p = last();
    Pos q = next(l.front());

    p.succ = q;
    q.pred = p;

    this.pred = l.pred;

    l.succ = null;
    l.pred = null;

    return this;
  }

  Pos find(ElemTest e) {
    Pos p = this;
    while (!eol(p)) {
      p = next(p);
      if (e.check(p.value)) {
        return p;
      }
    }
    return null;
  }

  Pos delete(Pos p) {
    if (this.isempty()) {
      return null;
    }

    if (eol(p)) {
      this.pred = p.pred;
      p.pred.succ = null;

      p.pred = null;

      return this;
    }

    Pos q = p.pred;
    q.succ = p.succ;
    p.succ.pred = q;

    p.succ = null;
    p.pred = null;

    return this;
  }
}
