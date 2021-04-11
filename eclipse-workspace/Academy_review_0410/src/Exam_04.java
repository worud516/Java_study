//문제 - 객체를 사용하지 않고 두번째 플레이어를 만들어주세요.

public class Exam_04 {
	public static void main(String[] args) {
		palyer a플레이어1;
		a플레이어1 = new palyer();
		a플레이어1.age = 20;
		a플레이어1.name = "홍길동";
		a플레이어1.job = "의적";

		int a플레이어2__age = 22;
		String a플레이어2__name = "홍길순";
		String a플레이어2__job = "의적";

		System.out.printf("%d %s %s\n", a플레이어1.age, a플레이어1.name, a플레이어1.job);
		System.out.printf("%d %s %s", a플레이어2__age, a플레이어2__name, a플레이어2__job);
	}
}

class palyer {
	int age;
	String name;
	String job;
}