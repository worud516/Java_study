import java.util.Scanner;

public class Problem_1023 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String a = sc.next();
		String[] arr = a.split("\\.");
		int A = Integer.valueOf(arr[0]);
		int B = Integer.valueOf(arr[1]);
		
		System.out.printf("%d\n%d", A, B);

	}
}