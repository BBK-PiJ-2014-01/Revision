package Question3;

import Question3.Constructor;

/**
 * Created by Pierre on 05/06/2015.
 */
class SubConstructor extends Constructor {
    protected String s;

    SubConstructor(int x) {
        super("label");
        x = this.x;
        System.out.println("[4] x = " + x);
    }

    public SubConstructor(String s) {
        this(12);
        this.s = s;
        x = 19;
        System.out.println("[5] x = " + x);
    }
}