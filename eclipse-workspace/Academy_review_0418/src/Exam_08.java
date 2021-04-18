//생성자
class Exam_08 {
	public static void main(String[] args) {
		사람5 a홍길동 = new 홍길동();
		System.out.printf("== 홍길동 정보 ==\n");
		System.out.printf("이름 : %s\n", a홍길동.이름); // 홍길동
		System.out.printf("나이 : %s\n", a홍길동.나이); // 22
		
		사람5 a홍길순 = new 홍길순();
		System.out.printf("== 홍길순 정보 ==\n");
		System.out.printf("이름 : %s\n", a홍길순.이름); // 홍길순
		System.out.printf("나이 : %s\n", a홍길순.나이); // 22
	}
}


//생성자로 만든 매서드는 리턴 타입이 없다 / 함수명 = 클래스명
class 사람5 {
	String 이름;
	int 나이;

	사람5() { 
		this.나이 = 22;
	}
}

class 홍길동 extends 사람5 {
	홍길동() {
		this.이름 = "홍길동";
	}
}

class 홍길순 extends 사람5 {
	홍길순() {
		this.이름 = "홍길순";
	}
}