package API2;

import java.util.Random;

public class Random1 {
	public static void main(String[] args) {
		Random random1 = new Random();	// seed : ���� �ð�
		Random random4 = new Random();	// seed : ���� �ð�
		Random random2 = new Random(2);	// seed : 2
		Random random3 = new Random(2); // seed : 2	
		System.out.println(System.currentTimeMillis());
		for(int i = 0; i<5;i++) {
			System.out.println("random1 : " + i+"��° ��: " + random1.nextInt(10));
		}
		for(int i = 0; i<5;i++) {
			System.out.println("random4 : " + i+"��° ��: " + random4.nextInt(10));
		}
		for(int i = 0; i<5;i++) {
			System.out.println("random2 : " + i+"��° ��: " + random2.nextInt(10));
		}
		for(int i = 0; i<5;i++) {
			System.out.println("random2 : " + i+"��° ��: " + random3.nextInt(10));
		}
		
	}
}
