// 문제 : 클래스 5개 이상 만들고 각각을 객체화 하여 메서드를 호출해주세요.

class Exam_15 {
	public static void main(String[] args) {

		사과 a = new 사과();
		a.price();

		바나나 b = new 바나나();
		b.price();

		new 오렌지().price();
		new 포도().price();
		new 딸기().price();
	}
}

class 사과 {
	void price() {
		System.out.println("1500원");
	}

}

class 바나나 {
	void price() {
		System.out.println("1000원");
	}
}

class 오렌지 {
	void price() {
		System.out.println("1500원");
	}
}

class 포도 {
	void price() {
		System.out.println("2000원");
	}
}

class 딸기 {
	void price() {
		System.out.println("3000원");
	}
}
