package Class;

public class Exam2 {
	public static void main(String[] args) {
		Car myCar1 = new Car();
		Car myCar2 = new Car();
		
		myCar1.color = "red";
		myCar2.color = "black";
		
		myCar1.speedUp();
		myCar2.wiper();
		
		System.out.println("myCar1�� �� : " + myCar1.color);
		System.out.println("myCar2�� �� : " + myCar2.color);
		
		System.out.println("myCar1�� �ӵ� : " + myCar1.speed);
		System.out.println("myCar2�� �ӵ� : " + myCar2.speed);
		
		System.out.println("myCar1�� ������ �۵����� : " + myCar1.wiperOn);
		System.out.println("myCar2�� ������ �۵����� : " + myCar2.wiperOn);
	}
}
