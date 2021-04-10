
public class Exam_01 {
	public static void main(String[] args) {
		//정수, 논리, String
		Person a = new Person();
		a.age = 20;
		a.isMarried = false;
		a.name = "Paul";
		a.introduce();
		a.age = 25;
		a.name = "Kan";
		a.isMarried = true;
		a.introduce();
	}
}


class Person{
	int age;
	boolean isMarried;
	String name;
	
	void introduce() { //Method(매서드)
		int age = this.age;
		String name = this.name;
		boolean isMarried = this.isMarried;
		System.out.println("자기소개 시작");
		System.out.printf("이름 : %s\n", name);
		System.out.printf("나이 : %d\n", age);
		System.out.printf("기혼여부 : %s\n", isMarried);
		System.out.printf("자기소개 끝\n");
	}
	
}
