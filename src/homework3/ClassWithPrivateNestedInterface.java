package homework3;

public class ClassWithPrivateNestedInterface {

    // Nu prea am inteles - help
    private interface NestedInterface{
        NestedInterface ni = new NestedInterface() {
            @Override
            public int getI() {
                return 0;
            }
        };
        int getI();
    }

    public static int getI() {
        return NestedInterface.ni.getI();
    }

    ///////////////////////

    private class C1 implements NestedInterface{

        @Override
        public int getI() {
            return 0;
        }
    }
}
