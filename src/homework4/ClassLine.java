package homework4;

/**
 * Created by ns on 2/5/2016.
 */
public class ClassLine implements  Cloneable{
    private ClassPoint point1;
    private ClassPoint point2;

    public void draw(){
        System.out.println( " Line:" );
    }

    //[ZP] where is the deep copy??? see ZsoltTest
    public Object makeCopy() throws CloneNotSupportedException {
        Object o =  new Object();
        return o = super.clone();
    }

    public ClassPoint getPoint1() {
        return point1;
    }

    public void setPoint1(ClassPoint point1) {
        this.point1 = point1;
    }

    public ClassPoint getPoint2() {
        return point2;
    }

    public void setPoint2(ClassPoint point2) {
        this.point2 = point2;
    }
}
