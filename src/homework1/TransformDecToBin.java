package homework1;

/**
 * Created by ns on 1/26/2016.
 */
//[ZP] - 7
public class TransformDecToBin {
	//[ZP] use the closest exception that want to throw(NumberFormatException)
	//[ZP] every time try to choose the best solution not to re-implement an already existing solution
	public static void main(String[] args) throws java.lang.Exception {
		int s = 11;
		String res = "";

		while (s > 0) {
			res = s % 2 + res;
			s /= 2;
		}
		System.out.println(Integer.parseInt(res));
		System.out.println(Integer.toBinaryString(11));
	}
}
