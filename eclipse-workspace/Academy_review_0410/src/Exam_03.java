//문제 - 1개의 자동차가 3번 달리게 해주세요.
public class Exam_03 {
	public static void main(String[] args) {
		car2 a = new car2();
		
		a.run();
		a.run();
		a.run();
	}
}


class car2{
	void run() {
		System.out.println("자동차가 달립니다.");
	}
	
}
