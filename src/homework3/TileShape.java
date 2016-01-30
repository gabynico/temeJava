package homework3;

/**
 * Created by ns on 1/30/2016.
 */
public class TileShape extends Tile implements Shape {
    public void draw() {
        System.out.println("This a tile with area of: " + this.getArea());
    }

    //public int  getArea() { return 10;}

    public static void main(String[] args) {
        TileShape tileShape = new TileShape();
        tileShape.setHeight(10);
        tileShape.setWidth(10);
        Shape shape = tileShape;
        shape.draw();
    }
}