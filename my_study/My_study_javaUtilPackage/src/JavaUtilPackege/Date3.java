package JavaUtilPackege;

import java.util.Calendar;

public class Date3 {
	public static void main(String[] args) {
		Calendar a = Calendar.getInstance();

		int year = a.get(Calendar.YEAR);
		int month=a.get(Calendar.MONTH) + 1; //1�� = 0
		int date = a.get(Calendar.DATE);
		
		System.out.println(year + "�� " + month + "�� " + date + "��");
		System.out.println("������ �̹��ֿ��� �� ��° ���ΰ� : ");
		System.out.println(a.get(Calendar.DAY_OF_WEEK));
		
		System.out.println("�̹� �⵵���� ������ �� ��° �ΰ� : ");
		System.out.println(a.get(Calendar.DAY_OF_YEAR));
		
		System.out.println("�̹� ���� ��ĥ���� �ִ°� : ");
		System.out.println(a.getActualMaximum(Calendar.DATE));

	}
}
