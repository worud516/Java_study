package JavaUtilPackege;

import java.util.Calendar;

public class Date4 {
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		Calendar endOfYear = Calendar.getInstance();
		Calendar Christmas = Calendar.getInstance();
		
		endOfYear.set(Calendar.MONTH,11);	// month: 12���� ����
		endOfYear.set(Calendar.DATE,31);	// date: 31�Ϸ� ����
		long diff=endOfYear.getTimeInMillis()-today.getTimeInMillis();
		System.out.println("���� ���� ���� ��:"+diff/(24*60*60*1000)+"��");
		
		Christmas.set(2021,11,25);
		diff=Christmas.getTimeInMillis()-today.getTimeInMillis();
		System.out.println("ũ������������ ���� ��:"+diff/(24*60*60*1000)+"��");
}
}
