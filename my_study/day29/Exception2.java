package day29;

public class Exception2 {
	public static void main(String[] args) {
		try {
			int []a= {2,0};
			int b=4;
			int c=b/a[2];
		}
		catch(ArithmeticException e) {
		System.out.println("��� ���� �߻�");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭 ���� ���� �߻�");
			}
		System.out.println("���� ó�� ���� ��");
	}
}

