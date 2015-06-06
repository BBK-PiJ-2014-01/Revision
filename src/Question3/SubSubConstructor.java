package Question3;

/**
 * Created by Pierre on 05/06/2015.
 */
class SubSubConstructor extends SubConstructor {
    private String s;

    public SubSubConstructor() {
        super("item");
        s = super.s;
        x++;
        System.out.println("[6] [s = " + this.s + "] " + this);
    }

    public String toString() {
        return "******* " + super.toString();
    }

    public static void main(String[] args) {
        SubSubConstructor ssc = new SubSubConstructor();
    }
}