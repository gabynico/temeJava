package homework4;

/**
 * Created by ns on 2/5/2016.
 */
public /*final*/ class ReadOnlyClass {
    private final int f1;
    private final int f2;


    public ReadOnlyClass(int f1, int f2) {
        this.f1 = f1;
        this.f2 = f2;
    }

    public int add(){
        return this.f1 + this.f2;
    }
}


class ExtendReadOnlyClass extends ReadOnlyClass  {

    private int f3 = 3;

    public ExtendReadOnlyClass(int f1, int f2) {
        super(f1, f2);
    }

    public int add(){
        return super.add()+ f3;
    }


    public static void main(String[] args) {

        ReadOnlyClass r1 = new ReadOnlyClass(1, 2);
        System.out.println(r1.add());

        ReadOnlyClass r2 = new ExtendReadOnlyClass(1, 2);
        System.out.println(r2.add());

    }

}
