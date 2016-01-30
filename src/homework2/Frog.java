package homework2;

/**
 * Created by ns on 1/26/2016.
 */
public class Frog extends Amphibian{
    @Override
    protected void m1() {
        super.m1();
        System.out.println("Method m1 override in class Frog");
    }

    public static void main(String[] args) {
        Frog f = new Frog();
        Amphibian a = (Amphibian)f;
        a.m1();
    }
}
