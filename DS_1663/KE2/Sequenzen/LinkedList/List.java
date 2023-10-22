package DS_1663.KE2.Sequenzen.LinkedList;

class List extends Pos {
  Pos head, last;

  Pos next(Pos p) {
    return p.succ;
  }

  boolean eol(Pos p) {
    return p == last;
  }

  boolean bol(Pos p) {
    return p == head;
  }

  boolean isempty() {
    return next(this.succ) == null;
  }

  List swap(Pos p) {
    Pos q;
    Pos r;

    if (isempty()) {
      return this;
    }

    if (eol(p)) {
      return this;
    }

    if (next(p) == last) {
      q = next(p);
      r = next(q);

      q.succ = r.succ;
      r.succ = q;
      p.succ = r;

      last = r;

    }

    q = next(p);
    r = next(q);

    q.succ = r.succ;
    r.succ = q;
    p.succ = r;

    return this;
  }
}
