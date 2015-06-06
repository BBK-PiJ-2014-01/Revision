package Question2;

import Question2.Base;
import Question2.Derived;

/**
 * Created by Pierre on 05/06/2015.
 */
public class BaseDerivedMain {
    public static void main(String[] args) {
        Base b = new Derived();
        b.methodOne(0);
    }
}