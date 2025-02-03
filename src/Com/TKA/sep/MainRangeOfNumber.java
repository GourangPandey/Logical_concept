package Com.TKA.sep;

import java.util.Iterator;

public class MainRangeOfNumber {
	public static void main(String[] args) {
		System.out.println("Number between 1 to 15 :");
		for (int i = 1; i <= 15; i++) {
			System.out.println(i);
			if (NumberRange.rangeofNum(i)) {
				System.out.println("Number is Divisible with 3 :");
			}
			System.out.println();

		}
		System.out.println("********************");
		System.out.println("Numbers Between 1 to 15");
		for (int i = 1; i <= 15; i++) {
			System.out.println(i);
			if (i % 3 == 0) {
				System.out.print("-divisible by 3");
			}
			System.out.println();
		}
	}

}
