package Polymorphism;

public class Downcasting {
	// �ٿ� ĳ���� �� ������ ��
	// 1. �� ĳ���� �� ������ ����
	// 2. ����� �� ��ȯ
	public static void main(String[] args) {
		// �� ĳ����
		Human h1 = new Student("ȫ�浿", 13, "����", 3);
		// h1.study();
		
		// �ٿ� ĳ����
		Student s1 = (Student)h1;
		s1.study();
	}
}


