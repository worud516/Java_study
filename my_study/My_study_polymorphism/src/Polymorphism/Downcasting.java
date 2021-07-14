package Polymorphism;

public class Downcasting {
	// 다운 캐스팅 시 주의할 점
	// 1. 업 캐스팅 된 변수만 가능
	// 2. 명시적 형 변환
	public static void main(String[] args) {
		// 업 캐스팅
		Human h1 = new Student("홍길동", 13, "게임", 3);
		// h1.study();
		
		// 다운 캐스팅
		Student s1 = (Student)h1;
		s1.study();
	}
}


