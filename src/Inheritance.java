/**
 * Created by Pierre on 10/05/2015.
 */
public class Inheritance {

    public class Base {
        public void Method1() {
            Method2();
            System.out.println("Base Method1");
        }

        public void Method2() {
            System.out.println("Base Method2");
        }
    }

    public class LowerBase extends Base {
        public void Method1() {
            super.Method1();
            System.out.println("LowerBase Method1");
        }

        public void Method2() {
            System.out.println("LowerBase Method2");
        }
    }

    public static void main(String[] args) {
        Inheritance i = new Inheritance();
        i.launch();
    }

    public void launch() {
        Base obj = new LowerBase();
        obj.Method1();
    }

}
