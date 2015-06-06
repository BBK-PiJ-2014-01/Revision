package Question6;

/**
 * Created by Pierre on 05/06/2015.
 */
public class Child extends Parent {

    @Override
    public int getAge() {
        return super.getAge() / 2;
    }

    public static int getMore() {
        return 30;
    }
}

