class Exam_02{
	public static void main(String[] args) {
		사람2 a김철수 = new 김철수2();
		사람2 a김영희 = new 김영희2();
		
		a김철수.배달_음식_주문하다();
		// 영화반점에서 김철수(010-1234-1234)에게 매운 짬뽕(을)를 배달합니다.
		
		a김영희.배달_음식_주문하다();
		// 북경반점에서 김영희(010-4321-4321)에게 안매운 짬뽕(을)를 배달합니다.
		
		a김영희.a좋아하는_음식점 = a김철수.a좋아하는_음식점;
		a김영희.선호하는_음식의_매운정도 = "아주 매운";
		a김영희.선호하는_음식 = "짜장";
		
		a김영희.배달_음식_주문하다();
		// 영화반점에서 김영희(010-4321-4321)에게 아주 매운 짜장(을)를 배달합니다.
	}
}

class 사람2 {
	String 이름;
	String 전화번호;
	String 선호하는_음식의_매운정도;
	String 선호하는_음식;
	음식점 a좋아하는_음식점;
	
	void 배달_음식_주문하다() {
		a좋아하는_음식점.주문(이름, 전화번호, 선호하는_음식, 선호하는_음식의_매운정도);
	}
}

abstract class 음식점2 {
	abstract void 주문(String 주문자명, String 주문자_전화번호, String 음식, String 매운정도);
}

class 영화반점2 extends 음식점2 {
	void 주문(String 주문자명, String 주문자_전화번호, String 음식, String 매운정도) {
		System.out.println("영화반점에서 " + 주문자명 + "(" + 주문자_전화번호 + ")에게 " + 매운정도 + " " + 음식 + "(을)를 배달합니다.");
	}
}

class 북경반점2 extends 음식점2 {
	void 주문(String 주문자명, String 주문자_전화번호, String 음식, String 매운정도) {
		System.out.println("북경반점에서 " + 주문자명 + "(" + 주문자_전화번호 + ")에게 " + 매운정도 + " " + 음식 + "(을)를 배달합니다.");
	}
}

class 김철수2 extends 사람2 {
	김철수2() {
		이름 = "김철수";
		전화번호 = "010-1234-1234";
		a좋아하는_음식점 = new 영화반점();
		선호하는_음식의_매운정도 = "매운";
		선호하는_음식 = "짬뽕";
	}
}

class 김영희2 extends 사람2 {
	김영희2() {
		이름 = "김영희";
		전화번호 = "010-4321-4321";
		a좋아하는_음식점 = new 북경반점();
		선호하는_음식의_매운정도 = "안매운";
		선호하는_음식 = "짬뽕";
	}
}






//Ver.2
//class Main {
//	public static void main(String[] args) {
//		사람 a김철수 = new 김철수();
//		사람 a김영희 = new 김영희();
//
//		a김철수.배달_음식_주문하다();
//		// 영화반점에서 김철수(010-1234-1234)에게 매운 짬뽕(을)를 배달합니다.
//
//		a김영희.배달_음식_주문하다();
//		// 북경반점에서 김영희(010-4321-4321)에게 안매운 짬뽕(을)를 배달합니다.
//
//		a김영희.a좋아하는_음식점 = a김철수.a좋아하는_음식점;
//		a김영희.선호하는_음식의_매운정도 = "아주 매운";
//		a김영희.선호하는_음식 = "짜장";
//
//		a김영희.배달_음식_주문하다();
//		// 영화반점에서 김영희(010-4321-4321)에게 아주 매운 짜장(을)를 배달합니다.
//	}
//}
//
//class 사람 {
//	String 이름;
//	String 전화번호;
//	음식점 a좋아하는_음식점;
//	String 선호하는_음식의_매운정도;
//	String 선호하는_음식;
//
//	void 배달_음식_주문하다() {
//		a좋아하는_음식점.주문(이름, 전화번호, 선호하는_음식의_매운정도, 선호하는_음식);
//	}
//}
//
//class 김철수 extends 사람 {
//	김철수() {
//		이름 = "김철수";
//		전화번호 = "010-1234-1234";
//		a좋아하는_음식점 = new 영화반점();
//		선호하는_음식의_매운정도 = "매운";
//		선호하는_음식 = "짬뽕";
//	}
//}
//
//class 김영희 extends 사람 {
//	김영희() {
//		이름 = "김영희";
//		전화번호 = "010-4321-4321";
//		a좋아하는_음식점 = new 북경반점();
//		선호하는_음식의_매운정도 = "안매운";
//		선호하는_음식 = "짜장";
//	}
//}
//
//abstract class 음식점 {
//	String 이름;
//
//	void 주문(String 주문자명, String 주문자_전화번호, String 음식, String 매운정도) {
//		System.out.println(이름 + "에서 " + 주문자명 + "(" + 주문자_전화번호 + ")에게 " + 매운정도 + " " + 음식 + "(을)를 배달합니다.");
//	}
//}
//
//class 영화반점 extends 음식점 {
//	영화반점() {
//		이름 = "영화반점";
//	}
//}
//
//class 북경반점 extends 음식점 {
//	북경반점() {
//		이름 = "북경반점";
//	}
//}
