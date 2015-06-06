package Question8;

/**
 * Created by Pierre on 05/06/2015.
 */
public class B extends A {

    int i;

    @Override
    public void incr(int d) {
        if (d > 0) {
        this.i += d;
        super.incr(d / 2);
        }
    }

    @Override
    public String toString() {
        return super.toString() + " B's i is: " + i;
    }
}