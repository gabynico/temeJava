package homework1;

import java.util.ArrayList;
import java.util.Scanner;

// [ZP] please solve warnings.
// [ZP] use Ctrl+Shift+f to format code
// [ZP] use Ctrl+Shift+o to organize imports
// [ZP] 9
public class ComputeAllPrimeNumbers {

	// [ZP] don't need to use the full qualified name
	// [ZP] use ide (intellj or eclise code compression
	public static void main(String[] args) /*throws java.lang.Exception*/ {
		int n;

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		int s = 0;
		ArrayList<String> a = new ArrayList<>();

		for (int i = 0; i <= n; i++) {
			a.add("0");
		}

		for (int i = 2; i <= n; i++) {
			if (a.get(i).equals("0")) {
				for (int j = i + i; j <= n; j += i) {
					a.set(j, "1");
				}
				System.out.print(i + " ");
				s += i;
			}

		}
		System.out.println(s);

	}
}
