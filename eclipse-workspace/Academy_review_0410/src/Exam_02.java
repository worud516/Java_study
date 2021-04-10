//문제 - 자동차 설꼐도를 만들어주세요.
//문제 - 자동차 객체를 담을 변수를 만들어주세요.
//문제 - 자동차 객체를 만들고 변수에 담아주세요.
//문제 - 자동차 객체마다 서로 다른 최고속력를 가지도록 해주세요.

public class Exam_02 {
	public static void main(String[] args) {
		car a = new car();
		a.MaxSpeed = 320;
		System.out.printf("자동차1의 최고속력 : %d\n", a.MaxSpeed);
		
		car b = new car();
		b.MaxSpeed = 360;
		System.out.printf("자동차1의 최고속력 : %d\n", b.MaxSpeed);

	}
}

class car {
	int MaxSpeed;

}