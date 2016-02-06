package homework4;

/**
 * Created by ns on 2/5/2016.
 */
public class ClassShape implements Cloneable {

    private ClassCircle c1;
    private ClassCircle c2;

    private ClassLine l1;
    private ClassLine l2;

    public void draw(){
         System.out.println( " Shape:" );
    }

    public Object clone() throws CloneNotSupportedException {
        Object o =  new Object();
        return o = super.clone();
    }

    public ClassCircle getC1() {
        return c1;
    }

    public void setC1(ClassCircle c1) {
        this.c1 = c1;
    }

    public ClassCircle getC2() {
        return c2;
    }

    public void setC2(ClassCircle c2) {
        this.c2 = c2;
    }

    public ClassLine getL1() {
        return l1;
    }

    public void setL1(ClassLine l1) {
        this.l1 = l1;
    }

    public ClassLine getL2() {
        return l2;
    }

    public void setL2(ClassLine l2) {
        this.l2 = l2;
    }
}
