package Question2;

/**
 * Created by Pierre on 05/06/2015.
 */
public class Base {
    public void methodOne() {
        System.out.println("A");
        methodTwo();
    }

    public void methodOne(int a) {
        System.out.println("W");
        methodTwo();
    }

    public void methodTwo() {
        System.out.print("B");
    }
}




