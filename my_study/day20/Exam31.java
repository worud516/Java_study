package day20;

public class Exam31 {
	public static void main(String[] args) {
		Car mycar=new Car();
		System.out.println("�õ� ó�� �ʱ�ȭ:"+mycar.powerOn);
		System.out.println("���� ���� �ʱ�ȭ:"+mycar.color);
		System.out.println("������ �� �ʱ�ȭ:"+mycar.wheel);
		System.out.println("�ӷ� �ʱ�ȭ:"+mycar.speed);
		System.out.println("������ �۵� �ʱ�ȭ:"+mycar.wiperOn);
		
		mycar.power();
		System.out.println("�õ� �޼��� ����:"+mycar.powerOn);
		mycar.power();
		System.out.println("�õ� �޼��� �ٽ� ����:"+mycar.powerOn);
		
		mycar.color="black";
		System.out.println("���� ���� ����:"+mycar.color);
		
	}

}

class Car{
	boolean powerOn; // �õ�
	String color; //����
	int wheel; //������
	int speed; //�ӷ�
	boolean wiperOn;//������
	
	void power() {powerOn=!powerOn;}//true->false, false->true
	void speedUp() {speed++;}
	void speedDown() {speed--;}
	void wiper() {wiperOn=!wiperOn;}//true->false, false->true
	
}
