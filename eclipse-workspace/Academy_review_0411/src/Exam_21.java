// 문제 : 아래와 같이 출력 되도록 해주세요.

class Exam_21 {
	public static void main(String[] args) {
		int 결과1 = Math2.nToMSum(2, 3);
		System.out.println("결과1 : " + 결과1);
		// 출력 : 결과1 : 5

		int 결과2 = Math2.nToMSum(5, 10);
		System.out.println("결과2 : " + 결과2);
		// 출력 : 결과2 : 45
	}
}

class Math2 {
	static int nToMSum(int a, int b) {
		int c = 0;
		for (int i = a; i <= b; i++) {
			c += i;
		}
		return c;
	}
}
