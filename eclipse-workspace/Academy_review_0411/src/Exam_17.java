// 문제 : 구구단을 만들어주세요
// 출력양식
/*
== 2단 ==
2 * 1 = 2
2 * 2 = 4
2 * 3 = 6
...
== 9단 ==
9 * 1 = 9
...
9 * 9 = 81
*/

class Exam_17 {
	public static void main(String[] args) {
		new 구구단출력기().작동();
	}
}

class 구구단출력기 {

	void 작동() {
		for (int i = 2; i < 10; i++) {
			System.out.printf("== %d단 ==\n", i);
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i * j);
			}
		}
	}

}
