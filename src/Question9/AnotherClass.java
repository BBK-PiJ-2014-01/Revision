package Question9;

/**
 * Created by Pierre on 05/06/2015.
 */
class AnotherClass {

    int method(int x) {
        try {
            if (x / 2 > 10) {
                x++;
                throw new RuntimeException("Conditional: " + x);
            }
            System.out.println("AnotherClass:: Value of x is " + x);
        }
        catch (RuntimeException ex) {
            System.out.println("In exception - " + ex.getMessage());
            throw new IllegalArgumentException("AnotherClass::Method exception x = " + x);
        }
        catch (Exception e) {
            System.out.println("In general exception");
            throw new RuntimeException("From exception");
            }
        finally {
            x -= 15;
            System.out.println("AnotherClass::finally: " + x);
        }
        return x;
    }
}