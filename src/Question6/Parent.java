package Question6;

/**
 * Created by Pierre on 05/06/2015.
 */
public class Parent extends GrandParent {
    @Override
    public boolean good() {
        System.out.println(getAge());
        System.out.println(GrandParent.getMore());
        return getAge() < GrandParent.getMore();
    }

    public int getAge() {
        return 42;
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Ahh.........!");
    }
}