import java.util.Arrays;

public class Array_2 {
	public static void main(String[] args) {
		
		// a��� ������ �迭�� ������ ��, �ٷ� �ʱⰪ�� �ִ� ���
		int[] a = new int[] {10, 20, 4, 25, 18};
		
		// b��� ������ �迭�� ������ ��, �ʱⰪ���� �ִ� ��� (new int[] ��������)
		int[] b = {1,2,3,4,5,6,7};
		
		// c��� ������ �迭�� �����ϰ�, 10���� �������� ���� �� �ִ� ũ�� �Ҵ�
		int[] c = new int[10];
		
		// �迭.length: �迭�� ����, �迭�� ��Ұ���
		for(int i=0; i<c.length; i++) {
			c[i] = i;
		}
		
		for(int i=0; i<c.length;i++) {
			System.out.println(c[i]);
		}
		
		// �迭�� ���� ���������� ���
		System.out.println(Arrays.toString(c));
		
		
	}
}
