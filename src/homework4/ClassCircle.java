package homework4;

public class ClassCircle implements Cloneable{

    private ClassPoint center;
    private int radius;
    private  final static double pi = 3.14;

    public void draw(){
        System.out.println( " Circle:" );
    }

    public Object makeCopy() throws CloneNotSupportedException {
         return  super.clone();
    }

    public double area(){
        return pi * this.radius * this.radius;
    }


    public ClassPoint getCenter() {
        return center;
    }

    public void setCenter(ClassPoint center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
