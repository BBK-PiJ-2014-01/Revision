package Question7;

/**
 * Created by Pierre on 05/06/2015.
 */
public class Thing extends Base {

    public Thing() { System.out.println("Thing constructor"); }

    public Thing(boolean b) { YES = !b; }

    public void myMethod() {
        System.out.println("Thing::myMethod");
        if (YES) {
            anotherMethod(this);
        } else {
            anotherMethod();
        }
    }

    public void aMethod() {
        System.out.println("Thing::aMethod");
        super.anotherMethod();
        myMethod();
    }

    public void anotherMethod(Object o) {
        System.out.println("Thing::anotherMethod");
        ((Base) o).anotherMethod();
    }
}