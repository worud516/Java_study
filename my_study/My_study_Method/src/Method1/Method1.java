package Method1;

public class Method1 {
	public static void main(String[] args) {
		open();
		
		f1(100);
	}
	
	static void open(){
		System.out.println("���� ����");
		System.out.println("�ٴ� û��");
		System.out.println("������ ��");
		System.out.println("���� ����");
	}
	
	static void f1(int x) { //�Լ� ȣ�� �� 100�� ���޹޾Ƽ�, ���޹��� 100�� �������
		System.out.println(x);
	}
}
