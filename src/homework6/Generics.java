package homework6;

/**
 * Created by ns on 1/30/2016.
 */
public class Generics<T1,T2> {
    private T1 t1;
    private T2 t2;

    private final static double pi = 3.14;

    Generics( T1 u1, T2 u2 ){
        this.t1 = u1;
        this.t2 = u2;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 u1) {
        this.t1 =u1;
    }

    public T2 getT2() {
        return t2;
    }

    public void setT2(T2 u2) {
        this.t2 = u2;
    }

    public String toPrint(T1 u1, T2 u2){
        return u1 + " , " + u2 + " and static pi = " + this.pi;
    }

    public static void main(String[] args) {
        Generics<String, Integer> g = new Generics<String, Integer>("generics", 1);
        System.out.println(g.toPrint( g.getT1(), g.getT2()));
        g.setT1("aaaaaaaaaa");
        g.setT2(3);
        System.out.println(g.toPrint( g.getT1(), g.getT2()));

    }

}
