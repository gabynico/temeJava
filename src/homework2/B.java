package homework2;

public class B extends A{
    protected static void print() {
        System.out.println( "from b");
    }

    public static void main(String[] args) {
        B b = new B();
        b.print();  // should print “from b”.
        ((A)b).print(); //should print “from a”.
    }
}
