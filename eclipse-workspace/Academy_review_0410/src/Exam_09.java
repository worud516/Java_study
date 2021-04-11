//문제 - 레퍼런스변수에 값 할당과정 설명
class Exam_09 {
	public static void main(String[] args) {
		// 오직 자동차 리모콘만 저장 할 수 있는 변수 `a자동차`를 만든다.
		// `a자동차` 에는 자동차 클래스로 만든 리모콘(쓰레기 리모콘)이 들어가게 된다.
		자동차4 a자동차;

		// 자동차 설계도(클래스)로 자동차 객체를 변수 외!부!에 만든다.
		// 자동차 객체는 자신을 조종할 수 있는 리모콘(this)를 가지고 태어난다. 즉 자동차 객체 만들 때 자동차 리모콘도 같이 만들어진다.
		// 자동차 객체는 자신이 들고 있는 리모콘(this)를 복사해서 반환한다.
		// a자동차 안에 들어있던 쓰레기 리모콘이 진짜 리모콘으로 대체된다.
		a자동차 = new 자동차4();

		// `a자동차` 변수에 안에 있는 리모콘의 `달리다` 버튼을 누른다.
		// 해당 신호가 리모콘과 연결되어 있는 자동차 객체에 전달되어 `달리다` 기능이 실행된다.
		a자동차.달리다();

		// 모든 객체들은 서로를 평생 볼 수 없다.
		// 모든 객체들은 서로를 원격조종한다.
	}
}

// 자동차 설계도!, 절대 자동차가 아니다.!!!
class 자동차4 {
	// 이 메서드(함수)의 2가지 용도
	// - 실제 기능
	// - 리모콘 버튼
	void 달리다() {
		System.out.println("자동차가 달립니다.");
	}
}