// 문제 : 아래 코드가 실행되도록 해주세요.

class Exam_12 {
	public static void main(String[] args) {
		거북이 a거북이 = new 거북이();

		a거북이.걷다();
		// 출력 => 걷다
		a거북이.수영하다();
		// 출력 => 수영하다
	}
}

class 거북이 {
	void 걷다() {
		System.out.println("걷다");
	}

	void 수영하다() {
		System.out.println("수영하다");
	}
}