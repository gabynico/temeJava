package homework4;

/**
 * Created by ns on 2/5/2016.
 */
public class ClassPoint implements  Cloneable{

    private int x;
    private int y;

    public void draw(){
        System.out.println( " Point:" );
    }

    public Object makeCopy() throws CloneNotSupportedException {
        Object o =  new Object();
        return o = super.clone();
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
