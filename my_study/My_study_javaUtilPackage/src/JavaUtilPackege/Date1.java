package JavaUtilPackege;

public class Date1 {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		System.out.println("���۽ð� : " + start);
		int a = 0;
		for(int i = 1; i< 10000000; i++) {
			a++;
		}
		long end=System.currentTimeMillis();
		System.out.println("����ð� : " + end);
		System.out.println("�ɸ� �۾� �ð�: " + (end - start));
	}
}
