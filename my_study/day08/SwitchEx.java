package day08;

public class SwitchEx {
	public static void main(String[] args) {
		// �� �� ���� ���� å ���� ���� ��Ʈ�� ���
		int book=11;

		switch(book/10) {
		case 0: //10�ǹ̸�
			System.out.println("���� �� ����ϼ���!");
		case 1: //10<=book<20
			System.out.println("å �д� ���� ���ô� ���̽ó׿�!");
		case 2: //20<=book<30
			System.out.println("å�� ����ϴ� ���̽ó׿�!");
		default://30<=book
			System.out.println("����� �ٵ����Դϴ�.");
		
		}
	}

}
