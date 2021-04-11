// 문제 : 자동차를 올바르게 달리게 해보세요. 그리고 그 과정을 자세히 설명해주세요.

/*
// 과정설명
- 설계도(클래스)를 만든다.
  - 코드 : class 자동차 { void 달리다() { System.out.println("자동차가 달립니다."); } }
- 설계도로 리모콘 변수를 만든다. 
  - 코드 : 자동차 a자동차;
  - 부가설명 : `a자동차` 라는 변수에는 쓰레기 리모콘이 담긴다.
- 설계도로 객체를 만들고 객체를 자신을 조종할 수 있는 리모콘을 `a자동차` 변수에 저장한다.
  - 코드 : a자동차 = new 자동차();
  - 부가설명 : `new 자동차();` 는 객체를 만들고 자신을 조종할 수 있는 리모콘을 제공한다.
  - 부가설명 : `new 자동차();`로 인해 만들어진 새 리모콘이 `a자동차` 변수에 있던 쓰레기 리모콘을 대체한다. 쓰레기 리모콘은 사라진다.
- `a자동차` 변수 안에 있는 리모콘을 사용하여 객체를 원격조종한다.(달리다 버튼을 누른다.)
  - 코드 : a자동차.달리다();
  - 부가설명 : `a자동차` 변수 안에는 자동차 클래스로 만든 리모콘이 들어있다.
  - 부가설명 : `a자동차` 변수 안에 저장된 리모콘에는 버튼이 한개있다.(달리다 버튼)
*/

class Exam10 {
	// 메인 함수
	public static void main(String[] args) {
		// 자동차.달리다(); => 자동차 설계도에게 달리라고 한 꼴

		// 자동차를 조종할 리모콘을 저장할 변수 `a자동차` 를 만든다.
		// 기본적으로 `a자동차` 변수에는 `쓰레기 리모콘`이 담긴다.
		자동차5 a자동차;

		// 자동차 객체를 생성하고 객체를 조종할 리모콘을 `a자동차`에 넣는다.
		a자동차 = new 자동차5();

		// a자동차 변수안에 있는 리모콘에 있는 `달리다` 버튼을 누른다.
		a자동차.달리다();
	}
}

// class => 설계도, 틀(객체를 만들기 위한)
// 설계도로 할 수 있는 2가지
// - 객체 만들기
// - 객체를 조종 할 수 있는 리모콘 만들기
class 자동차5 {
	// 달리다 함수/메서드
	void 달리다() {
		System.out.println("자동차가 달립니다.");
	}
}
