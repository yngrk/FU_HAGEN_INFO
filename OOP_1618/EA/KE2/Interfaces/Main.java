package OOP_1618.EA.KE2.Interfaces;

public class Main {
  public static void main(String[] args) {
    CarFactory cf = new CarFactory();

    /**
     * c) Nicht zulässig da die Methode giveMeACar der Klasse CarFactory
     * ein Objekt des Typs Car zurückgibt. Jedoch ist dem Compiler nicht
     * ersichtlich, dass es sich hierbei um den Subtyp von Car handelt,
     * welcher diese Methode definiert. Das Interface Car hat diese Methode
     * jedenfalls nicht definiert.
     */

    // RealCar rc = cf.giveMeACar();
    // rc.tunePower();

    /**
     * d) Dem Compiler kann durch einen Typecast mitgegeben werden, dass
     * es sich hierbei um das Subtyp RealCar handelt. Dadurch kann
     * nachvollzogen werden, dass die Methode tunePower definiert ist.
     */

    RealCar rc = (RealCar) cf.giveMeACar();
    rc.tunePower();
  }
}
