package Com.TKA.sep;

import java.util.Iterator;

public class PrimrNum {
	public static boolean isprime(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (i % 2 == 0) {
				return false;
			}
		}
		return true;

	}

}
