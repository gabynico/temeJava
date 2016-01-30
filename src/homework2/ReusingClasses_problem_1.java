package homework2;

/**
 * Created by ns on 1/26/2016.
 */
public class ReusingClasses_problem_1 {

    private Integer i = new Integer(0);
    //Can you change the value of a final object argument?
    public int sum( int x, final int y) {
        //y = x +5;
        return x +y;
    }

    public static void main(String[] args) {
        // Can you change the value of a final object argument?
        int i;
        ReusingClasses_problem_1 p1 = new ReusingClasses_problem_1();
        i = p1.sum(2, 3);
        System.out.println(i);

    }
}
