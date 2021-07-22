package JavaUtilPackege;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Date2 {
	public static void main(String[] args) {
		// Calender a = new Calender(); 추상클래스이기 때문에 객체를 만들수 없다.
		
		Calendar a = Calendar.getInstance(); // 싱글턴 패턴
		Calendar b = new GregorianCalendar();
		
		System.out.println(a.toString());
		System.out.println(b.toString());
			
		
		
	}
}
