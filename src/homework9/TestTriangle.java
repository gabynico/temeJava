package homework9;

import org.junit.*;


public class TestTriangle  {

    Triangle t1;
    Triangle t2;
    Triangle t3;

    String r1;
    String r2;
    String r3;

    @BeforeClass
    public static void oneTimeSetUp() {
        // one-time initialization code
        System.out.println("@BeforeClass - oneTimeSetUp");
    }

    @AfterClass
    public static void oneTimeTearDown() {
        // one-time cleanup code
        System.out.println("@AfterClass - oneTimeTearDown");
    }


    @Before
    public void setUp() throws Exception {
        t1 =new Triangle(5, 5, 5);
        t2 =new Triangle(5, 5, 6);
        t3 =new Triangle(4, 5, 6);
        System.out.println("@Before - setUp");
    }

    @Test
    public void testEquilateral() throws Exception {
        r1 = t1.getType();
        Assert.assertTrue("Test equilateral - OK", "equilateral".equals(r1));
        System.out.println("@Test - testEquilateral");
    }

    @Test
    public void testIsoscele() throws Exception {
        r2 = t2.getType();
        Assert.assertTrue("Test isoscele - OK", "isoscele".equals(r2));
        System.out.println("@Test - testIsoscele");
    }

    @Test
    public void testScalene() throws Exception {
        r3 = t3.getType();
        Assert.assertTrue("Test scalene - OK", "scalene".equals(r3));
        System.out.println("@Test - testScalene");
    }

    @Test(expected = ArithmeticException.class)
    public void divisionWithException() {
        int i = 1/0;
        System.out.println("@Test - ArithmeticException");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("@After - tearDown");
    }
}
