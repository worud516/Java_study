package Scanner_BigDecimal_DecimalFormat;

import java.util.Scanner;

public class Scanner1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 이력하세요.");
		String name = sc.nextLine();
		
		System.out.println(name);
	}
}
