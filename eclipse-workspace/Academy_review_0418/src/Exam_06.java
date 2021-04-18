// 문제 : 아래가 실행되도록 해주세요.
public class Exam_06 {
	public static void main(String[] args) {
		전사 a전사 = new 전사();

		a전사.나이 = 20;
		a전사.a무기 = new 활();
		a전사.a무기 = new 칼2();
	}
}

class 전사{
	int 나이;
	무기2 a무기;
}

class 무기2{	
}

class 활 extends 무기2{
}

class 칼2 extends 무기2{	
}