package Question2;

import Question2.Base;

/**
 * Created by Pierre on 05/06/2015.
 */
public class Derived extends Base {
    public void methodOne(int a) {
        super.methodOne();
        System.out.print("X");
    }

    public void methodOne(Integer a) {
        super.methodOne();
        System.out.print("C");
    }

    public void methodTwo() {
        super.methodTwo();
        System.out.print("D");
    }
}