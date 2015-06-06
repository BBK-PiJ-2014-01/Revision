package Question8;

/**
 * Created by Pierre on 05/06/2015.
 */
public class A {

    int i;

    public void incr(int d) {
        if (d > 0) {
            this.i += d;
            this.incr(d - 1);
        }
    }

    @Override
    public String toString() {
        return "A's i is: " + i;
    }
}