package Class;

public class Exam2 {
	public static void main(String[] args) {
		Car myCar1 = new Car();
		Car myCar2 = new Car();
		
		myCar1.color = "red";
		myCar2.color = "black";
		
		myCar1.speedUp();
		myCar2.wiper();
		
		System.out.println("myCar1의 색 : " + myCar1.color);
		System.out.println("myCar2의 색 : " + myCar2.color);
		
		System.out.println("myCar1의 속도 : " + myCar1.speed);
		System.out.println("myCar2의 속도 : " + myCar2.speed);
		
		System.out.println("myCar1의 와이퍼 작동여부 : " + myCar1.wiperOn);
		System.out.println("myCar2의 와이퍼 작동여부 : " + myCar2.wiperOn);
	}
}
