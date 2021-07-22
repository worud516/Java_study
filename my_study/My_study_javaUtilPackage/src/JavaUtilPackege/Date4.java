package JavaUtilPackege;

import java.util.Calendar;

public class Date4 {
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		Calendar endOfYear = Calendar.getInstance();
		Calendar Christmas = Calendar.getInstance();
		
		endOfYear.set(Calendar.MONTH,11);	// month: 12월로 지정
		endOfYear.set(Calendar.DATE,31);	// date: 31일로 지정
		long diff=endOfYear.getTimeInMillis()-today.getTimeInMillis();
		System.out.println("연말 까지 남은 날:"+diff/(24*60*60*1000)+"일");
		
		Christmas.set(2021,11,25);
		diff=Christmas.getTimeInMillis()-today.getTimeInMillis();
		System.out.println("크리스마스까지 남은 날:"+diff/(24*60*60*1000)+"일");
}
}
