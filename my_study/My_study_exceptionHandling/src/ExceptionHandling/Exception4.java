package ExceptionHandling;

public class Exception4 {
	public static void main(String[] args) {
		try {
			methodA();
		} catch (Exception e) {
			System.out.println("���ο��� ó��");
		}
	}

	public static void methodA() throws Exception {
		methodB();
	}

	public static void methodB() throws Exception {
		methodC();
	}

	public static void methodC() throws Exception {
		Exception e = new Exception();
		throw e;
	}
}
