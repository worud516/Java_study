// -100부터 25까지의 합을 더한 결과를 출력해주세요.

class Exam11 {
	public static void main(String[] args) {

		int sum = 0;

		for (int i = -100; i <= 25; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}
}