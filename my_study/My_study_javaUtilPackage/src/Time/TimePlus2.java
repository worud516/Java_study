package Time;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class TimePlus2 {
	public static void main(String[] args) {
		LocalDateTime ld = LocalDateTime.now();
		System.out.println("���� �ð� : " + ld);
		LocalDateTime ld2 = ld.minusHours(5).plusMinutes(30).minusSeconds(4);
		System.out.println("���� �ð� : " + ld2);
		LocalDateTime ld3 = ld2.minusHours(24);
		System.out.println("�ڵ� ��ȯ �ð� : " + ld3);
	}
}
