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

	SportsCar(String color, int speedLimit) { 	// ���� �߻� ���� : �ڽ�Ŭ�������� ������ ȣ�� ��, �θ�Ŭ������ 
		super(color);										// ����Ʈ �����ڰ� �ڵ����� ȣ��Ǳ� ������ �θ��� ����Ʈ �����ڰ� �����ؾ� �Ѵ�.
		this.color = color;
		this.speedLimit = speedLimit;
	}
}