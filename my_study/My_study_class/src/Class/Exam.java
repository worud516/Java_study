package Class;

public class Exam {
	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		System.out.println("시동 처음 초기화 :" + myCar.powerOn);
		System.out.println("차의 색상 초기화 :" + myCar.color);
		System.out.println("바퀴의 수 초기화 :" + myCar.wheel);
		System.out.println("속력 초기화 :" + myCar.speed);
		System.out.println("와이퍼 작동 초기화 :" + myCar.wiperOn);
		
		myCar.power();
		System.out.println("시동 메서드 동작 : " + myCar.powerOn );
		
		myCar.power();
		System.out.println("시동 메서드 다시 동작 : " + myCar.powerOn );
		
		myCar.color="black";
		System.out.println("현재 차의 색상 : " + myCar.color);
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