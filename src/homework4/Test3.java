package homework4;

/**
 * Created by ns on 2/1/2016.
 */
class Circle {
    private int r;
}

class Shape extends Circle{
}

public class Test3 {
    public static void main(String[] args) {
        Circle c = new Circle();

        System.out.println("c.isInstance(Circle) -> " + Circle.class.isInstance(c));
        System.out.println("c.isInstance(Shape)  -> " + Shape.class.isInstance(c));

        System.out.println("c instanceof Circle -> " + (c instanceof Circle));
        System.out.println("c instanceof Shape -> " + (c instanceof Shape));

        System.out.println("c.getClass() == Circle.class -> " + (c.getClass() == Circle.class));
        System.out.println("c.getClass() == Shape.class -> " + (c.getClass() == Shape.class));

        System.out.println("c.getClass().equals(Circle.class) -> " + c.getClass().equals(Circle.class));
        System.out.println("c.getClass().equals(Shape.class) -> " + c.getClass().equals(Shape.class));

    }
}