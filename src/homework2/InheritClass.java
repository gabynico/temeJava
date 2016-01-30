package homework2;

/**
 * Created by ns on 1/26/2016.
 */
public class InheritClass extends BaseClass {
    @Override
    protected String m2() {
        return  /*super.m2() +*/ " override";
    }

    public static void main(String[] args) {

        InheritClass ii = new InheritClass();
        BaseClass bb = (BaseClass)ii;
        bb.m1();
    }

}
