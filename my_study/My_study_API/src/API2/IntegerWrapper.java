package API2;

public class IntegerWrapper {
	public static void main(String[] args) {
		Integer ii = 30; // auto boxting

		// Integer -> int
		System.out.println(ii.intValue());
		// Integer -> double
		System.out.println(ii.doubleValue());
		// Integer -> float
		System.out.println(ii.floatValue());
		// Integer -> String
		System.out.println(ii.toString());

	}
}
