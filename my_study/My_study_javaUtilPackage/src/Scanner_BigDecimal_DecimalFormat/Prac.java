package Scanner_BigDecimal_DecimalFormat;

import java.io.FileInputStream;
import java.util.Scanner;

public class Prac {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("src//Scanner_BigDecimal_DecimalFormat//sample.txt");
			Scanner s = new Scanner(fis);
			while(s.hasNext()) {
				System.out.println(s.nextLine());
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
