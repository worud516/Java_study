package ExceptionHandling;

public class Exception3 {
	public static void main(String[] args) {
		try {
			Exception e = new Exception("���� ����");
			throw e; // ���������� ���ܸ� �߻���Ű�ڴ�, �����ڴ�.
		} catch (Exception e) {
			System.out.println("���ܹ߻�");
			System.out.println(e.getMessage());
		}
	}
}
