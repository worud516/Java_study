// 문제 : 1부터 3까지 출력하는 작업을 10번 해주세요.
// 조건 : 2중 while문 사용

class Exam12 {
	public static void main(String[] args) {
		
		int i = 1;
		int j = 1;
		
		while (i < 11) {
			j = 1;
			while (j < 4) {
				System.out.println(j);
				j++;
			}
			i++;
		}

		// 출력
		// 1
		// 2
		// 3
		// 1
		// 2
		// 3
		// 1
		// 2
		// 3
		// 1
		// 2
		// 3
		// 1
		// 2
		// 3
		// 1
		// 2
		// 3
		// 1
		// 2
		// 3
		// 1
		// 2
		// 3
		// 1
		// 2
		// 3
		// 1
		// 2
		// 3
	}
}