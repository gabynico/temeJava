package homework4;

public class ClassTest {

    public static void main(String[] args)  {
        int r = 9;

        ClassShape s = new ClassShape();

        ClassCircle c1 = new ClassCircle();
        ClassCircle c2 = new ClassCircle();

        ClassLine l1 = new ClassLine();
        ClassLine l2 = new ClassLine();

        ClassPoint p1 = new ClassPoint();
        ClassPoint p2 = new ClassPoint();
        ClassPoint p3 = new ClassPoint();
        ClassPoint p4 = new ClassPoint();

        ClassPoint pc1 = new ClassPoint();
        ClassPoint pc2 = new ClassPoint();

        p1.setX(1);
        p1.setY(1);
        p2.setX(2);
        p2.setY(2);
        p3.setX(3);
        p3.setY(3);
        p4.setX(4);
        p4.setY(4);

        l1.setPoint1(p1);
        l1.setPoint1(p2);
        l2.setPoint1(p3);
        l2.setPoint1(p4);

        pc1.setX(5);
        pc1.setY(5);
        pc2.setX(6);
        pc2.setY(6);

        c1.setCenter(pc1);
        c1.setRadius(r);
        c2.setCenter(pc2);
        c2.setRadius(r);

        s.setC1(c1);
        s.setC2(c2);
        s.setL1(l1);
        s.setL2(l2);

        System.out.println("Shape:" + "\n" +
                "Circle 1:" + "\n" + "Radius:" + s.getC1().getRadius() +
                "\n" + "Center:" +
                "x:" + s.getC1().getCenter().getX() + ";" +
                "y:" + s.getC1().getCenter().getY() + "\n" +
                "Circle 2:" + "\n" + "Radius:" + s.getC2().getRadius() +
                "\n" + "Center:" +
                "x:" + s.getC2().getCenter().getX() +  ";" +
                "y:" + s.getC2().getCenter().getY() + "\n" +
                /*"Line 1:" + "\n" +
                "Point 1:" + "\n" +
                "x:" + s.getL1().getPoint1().getX() +
                "y:" + s.getL1().getPoint1().getY() +
                "Point 2:" + "\n" +
                "x:" + s.getL1().getPoint2().getX() +
                "y:" + s.getL1().getPoint2().getY() +
                "Line 2:" + "\n" +
                "Point 1:" + "\n" +
                "x:" + s.getL2().getPoint1().getX() +
                "y:" + s.getL2().getPoint1().getY() +
                "Point 2:" + "\n" +
                "x:" + s.getL2().getPoint2().getX() +
                "y:" + s.getL2().getPoint2().getY() +*/
                "hashCode:" + s.hashCode()
        );

        ClassPoint clone_p1 = null;
        try {
            clone_p1 = (ClassPoint)p1.makeCopy();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        ClassPoint clone_p2 = null;
        try {
            clone_p2 = (ClassPoint)p2.makeCopy();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        ClassPoint clone_p3 = null;
        try {
            clone_p3 = (ClassPoint)p3.makeCopy();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        ClassPoint clone_p4 = null;
        try {
            clone_p4 = (ClassPoint)p4.makeCopy();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        ClassLine clone_l1 = null;
        try {
            clone_l1 = (ClassLine)l1.makeCopy();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        ClassLine clone_l2 = null;
        try {
            clone_l2 = (ClassLine)l2.makeCopy();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        if (clone_l1 != null) {
            clone_l1.setPoint1(clone_p1);
        }
        if (clone_l1 != null) {
            clone_l1.setPoint2(clone_p2);
        }
        if (clone_l2 != null) {
            clone_l2.setPoint1(clone_p3);
        }
        if (clone_l2 != null) {
            clone_l2.setPoint2(clone_p4);
        }

        ClassPoint clone_pc1 = null;
        try {
            clone_pc1 = (ClassPoint)pc1.makeCopy();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        ClassPoint clone_pc2 = null;
        try {
            clone_pc2 = (ClassPoint)pc2.makeCopy();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        ClassCircle clone_c1 = null;
        try {
            clone_c1 = (ClassCircle)c1.makeCopy();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        ClassCircle clone_c2 = null;
        try {
            clone_c2 = (ClassCircle)c2.makeCopy();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        if (clone_c1 != null) {
            clone_c1.setCenter(clone_pc1);
        }
        if (clone_c2 != null) {
            clone_c2.setCenter(clone_pc2);
        }


        ClassShape clone_s = null;
        try {
            clone_s = (ClassShape)s.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        if (clone_s != null) {
            clone_s.setC1(clone_c1);
        }
        if (clone_s != null) {
            clone_s.setC2(clone_c2);
        }
        if (clone_s != null) {
            clone_s.setL1(clone_l1);
        }
        if (clone_s != null) {
            clone_s.setL2(clone_l2);
        }
        
        
        System.out.println("Shape:" + "\n" +
                "Circle 1:" + "\n" + "Radius:" + clone_s.getC1().getRadius() +
                "\n" + "Center:" +
                "x:" + clone_s.getC1().getCenter().getX() + ";" +
                "y:" + clone_s.getC1().getCenter().getY() + "\n" +
                "Circle 2:" + "\n" + "Radius:" + clone_s.getC2().getRadius() +
                "\n" + "Center:" +
                "x:" + clone_s.getC2().getCenter().getX() +  ";" +
                "y:" + clone_s.getC2().getCenter().getY() + "\n" +
                /*"Line 1:" + "\n" +
                "Point 1:" + "\n" +
                "x:" + clone_s.getL1().getPoint1().getX() +
                "y:" + clone_s.getL1().getPoint1().getY() +
                "Point 2:" + "\n" +
                "x:" + clone_s.getL1().getPoint2().getX() +
                "y:" + clone_s.getL1().getPoint2().getY() +
                "Line 2:" + "\n" +
                "Point 1:" + "\n" +
                "x:" + clone_s.getL2().getPoint1().getX() +
                "y:" + clone_s.getL2().getPoint1().getY() +
                "Point 2:" + "\n" +
                "x:" + clone_s.getL2().getPoint2().getX() +
                "y:" + clone_s.getL2().getPoint2().getY() +*/
                "hashCode:" + clone_s.hashCode()
        );

    }

}
