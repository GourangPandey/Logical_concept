package Com.TKA.sep;

public class MainPrime {
	public static void main(String[] args) {

		boolean result = PrimrNum.isprime(7);
		System.out.println(result ? "Number is Prime Number" : "Number is Not Prime Number");
		System.out.println("******************************");
		int n = 20;
		System.out.println("Prime Number between " + n + "are :");
		for (int i = 1; i <= Math.sqrt(n); i++) {

			if (PrimrNum.isprime(i)) {
				System.out.println(i);
			}
		}
		System.out.println("******************************");
	}

}
