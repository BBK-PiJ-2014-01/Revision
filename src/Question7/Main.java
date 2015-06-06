package Question7;

/**
 * Created by Pierre on 05/06/2015.
 */
public class Main {

    public static void main(String argv[]) {
        Thing a = new Thing();
        System.out.println(">>>");
        Base b = new Thing(true);
        System.out.println("[[[[");
        a.aMethod();
        System.out.println("---");
        b.anotherMethod();
    }
}