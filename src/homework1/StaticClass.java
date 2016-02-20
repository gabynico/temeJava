package homework1;

public class StaticClass {

	private static String str = "abc";

	private static int cnt1;
	private static int cnt2;

	static {
		cnt1 = 10;
		cnt2 = 20;
	}

	//[ZP] - this method should be static (Add a static method that prints both fields.)
	public static void print() {
		System.out.println("cnt1:" + cnt1);
		System.out.println("cnt2:" + cnt2);
		System.out.println("str:" + str);
	}

	//[ZP] don't need the exception
	public static void main(String[] args) /*throws java.lang.Exception*/ {
		StaticClass c = new StaticClass();
		c.print();

	}
}
