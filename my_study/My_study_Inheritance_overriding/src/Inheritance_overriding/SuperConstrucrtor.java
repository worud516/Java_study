package Inheritance_overriding;

public class SuperConstrucrtor {
	public static void main(String[] args) {
		SportsCar mycar = new SportsCar("red", 300);
		System.out.println(mycar.color);
		System.out.println(mycar.speedLimit);
	}
}

class Car {
	int wheel;
	int speed;
	String color;
	
	// Car(){}
	
	Car(String Color) {
		this.color = color;
	}
}

class SportsCar extends Car {
	int speedLimit;

	SportsCar(String color, int speedLimit) { 	// 오류 발생 이유 : 자식클래스에서 생성자 호출 시, 부모클래스의 
		super(color);										// 디폴트 생성자가 자동으로 호출되기 때문에 부모의 디폴트 생성자가 존재해야 한다.
		this.color = color;
		this.speedLimit = speedLimit;
	}
}