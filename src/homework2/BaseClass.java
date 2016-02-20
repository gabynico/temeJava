package homework2;

public class BaseClass {

    public void m1(){
        System.out.println("BaseClass - m1" + "call ->" + m2());
    }
    protected String m2(){
        return "BaseClass - m2";
    }
}
