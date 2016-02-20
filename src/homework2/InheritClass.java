package homework2;

public class InheritClass extends BaseClass {
    @Override
    protected String m2() {
        return  /*super.m2() +*/ " override";
    }

    public static void main(String[] args) {

        InheritClass ii = new InheritClass();
        ii.m2();
        ii.m1();

        BaseClass bb = new BaseClass();
        bb.m2();
        bb= ii;

        bb.m2();
    }

}
