package homework4;

public class ZsoltTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		//initializing object
		ClassPoint p1 = new ClassPoint();
		p1.setX(1);
		p1.setY(1);
		
		ClassPoint p2 = new ClassPoint();
		p2.setX(2);
		p2.setY(2);
		ClassLine line = new ClassLine();
		line.setPoint1(p1);
		line.setPoint2(p2);
		
		//making copy
		ClassLine line2 = (ClassLine)line.makeCopy();
		//line is different from line2 OK
		System.out.println(line + " <> " + line2);
		//point1 from line is the same with point1 from line2
		System.out.println(line.getPoint1() + " = " + line2.getPoint1());
		//changing x from line point1
		line.getPoint1().setX(12);

		// x from lin2 point1 is changed not OK
		System.out.println(line2.getPoint1().getX());
	}
}
