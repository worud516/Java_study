package Time;

import java.time.LocalDate;

public class Leap {
	public static void main(String[] args) {
		LocalDate ld= LocalDate.now();
		LocalDate new_ld;
		int count=0;
		
		
		for(int i=1900;i<=2100;i++) {
			new_ld=ld.withYear(i);
			if(new_ld.isLeapYear()) {
				System.out.println(new_ld.getYear()+"�� �����Դϴ�.");
				count++;
			}
		}
		System.out.println("1900�� ���� 2100����� ������ �� "+count+"�� �ֽ��ϴ�.");
	}
}
