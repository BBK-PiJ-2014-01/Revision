package Question10;

/**
 * Created by Pierre on 06/06/2015.
 */
public class Thing extends AClass {
    public int getValue() {
        return super.getValue() * 2;
    }

    public static int getNum() {
        return 200;
    }

    public void aMethod() {
        super.aMethod();
        System.out.println("Thing::aMethod");
    }

    public static void main(String[] args) {
        Thing t = new Thing();
        t.aMethod();
    }
}