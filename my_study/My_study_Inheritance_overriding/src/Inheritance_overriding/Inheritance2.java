package Inheritance_overriding;

public class Inheritance2 {
	public static void main(String[] args) {
		Leader leader = new Leader();
		leader.say();
	}
}

class Student2{
	void learn() {
		System.out.println("����");
	}
	void eat() {
		System.out.println("��Ա�");
	}
	void say() {
		System.out.println("�ȳ��ϼ���~");
	}
}

class Leader extends Student2{
	void lead() {
		
	}
	void say() { // �޼��� �������̵�
		System.out.println("�����Բ� �λ�");
		super.say();// �θ�Ŭ���� say ȣ��
	}
}
