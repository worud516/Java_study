package Inheritance_overriding;

public class Inheritance1 {
	public static void main(String[] args) {
		Student st = new Student();
		
		st.breath();
		st.learn();
		
		Teacher t = new Teacher();
		t.eat();
		t.teach();
	}
}

// 상속시 생성자는 상속되지 않는다.
// 다중상속을 지원하지 않는다.

class Person{
	void breath() {
		System.out.println("숨쉬기");
	}
	void eat() {
		System.out.println("밥먹기");
	}
	void say() {
		System.out.println("말하기");
	}
}


class Student extends Person{
	void learn() {
		System.out.println("배우기");
	}
}

class Teacher extends Person{
	void teach() {
		System.out.println("가르치기");
	}
}