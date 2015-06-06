package Question6;

/**
 * Created by Pierre on 05/06/2015.
 */

public abstract class GrandParent {
    private final static int HowMuch = 100;

    public abstract boolean good();

    public static int getMore() {
        return HowMuch;
    }

    public void eat() {
        if (good())
            System.out.println("Good!");
        else
            System.out.println("Bad!");
    }
}