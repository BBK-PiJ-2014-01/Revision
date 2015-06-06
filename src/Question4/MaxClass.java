package Question4;

import Question4.C;

/**
 * Created by Pierre on 05/06/2015.
 */
public class MaxClass {
    public static void main(String args[]) {
        try {
            C c = new C();
            System.out.println(c.max(13, 29));
            } catch (RuntimeException rte) {
            System.out.println(rte);
            } finally {
            System.out.println("In finally of main");
            }
        }
    }

