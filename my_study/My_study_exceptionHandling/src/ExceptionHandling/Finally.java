package ExceptionHandling;

public class Finally {
	public static void main(String[] args) {
		// �ܺη� ����
		int a = 0;
		int b = 2;
		try {
			System.out.println("�ܺη� ����");
//			int c = b/a;
			int c = b/3;
		}
		catch (ArithmeticException e) {
			System.out.println("������ �߻��Ͽ����ϴ�.");
		}
		finally {
			System.out.println("������ ��������");
		}
	}
}
