package Class;

public class Exam {
	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		System.out.println("�õ� ó�� �ʱ�ȭ :" + myCar.powerOn);
		System.out.println("���� ���� �ʱ�ȭ :" + myCar.color);
		System.out.println("������ �� �ʱ�ȭ :" + myCar.wheel);
		System.out.println("�ӷ� �ʱ�ȭ :" + myCar.speed);
		System.out.println("������ �۵� �ʱ�ȭ :" + myCar.wiperOn);
		
		myCar.power();
		System.out.println("�õ� �޼��� ���� : " + myCar.powerOn );
		
		myCar.power();
		System.out.println("�õ� �޼��� �ٽ� ���� : " + myCar.powerOn );
		
		myCar.color="black";
		System.out.println("���� ���� ���� : " + myCar.color);
	}
}

class Car{
	boolean powerOn;
	String color;
	int wheel;
	int speed;
	boolean wiperOn;
	
	
	void power() {
		powerOn = !powerOn;
	}
	
	void speedUp() {
		speed++;
	}
	
	void speedDown() {
		speed--;
	}
	
	void wiper() {
		wiperOn = ! wiperOn;
	}
	
}