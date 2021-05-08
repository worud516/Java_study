package my_task_article.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class util {
	public static String getNowDateStr() {
		SimpleDateFormat format = new SimpleDateFormat ( "yyyy-MM-dd HH:mm:ss");
		Date time = new Date();
		
		return format.format(time);
	}
}