package MethodOverloading;

public class SumEx {

	public static void main(String[] args) {
		
		sum(10,20);
		sum(12.23,33.12);
		sum(10,20,30);
		
	}
	// �ż����� �ű⺯�� Ÿ�Կ� ��ȭ
	static void sum(int x, int y) {
		System.out.println(x+y);;
	}
	
	static void sum(double x, double y) {
		System.out.println(x+y);
	}
	
	// �ż����� �Ű����� ������ ��ȭ
	static void sum(int x, int y, int z) {
		System.out.println(x+y+z);
	}

}
