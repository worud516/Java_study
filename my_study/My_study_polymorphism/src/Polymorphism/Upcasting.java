package Polymorphism;

public class Upcasting {
	public static void main(String[] args) {
		Student st1 = new Student("ȫ�浿", 13, "����", 3);
		st1.info();
		st1.study();
		System.out.println(st1.grade);
		
		// ���ɽ���
		Human h1 = new Student("������", 13, "����", 3);
		h1.info();
		// h1.study();
		// System.out.println(h1.grade);
	}
}


class Human{
	String name;
	int age;
	String hobby;
	
	public Human(String name, int age, String hobby) {
		this.name = name;
		this.age = age;
		this.hobby = hobby;
	}
	
	void info() {
		System.out.println("name : " + name);
		System.out.println("age : " + age);
		System.out.println("hobby : " + hobby);
	}
}

class Student extends Human{
	int grade;
	public Student(String name, int age, String hobby, int grade) {
		super(name, age, hobby);
		this.grade = grade;
	}
	void info() { // �������̵�
		super.info();
		System.out.println("grade : " + grade);
	}
	void study() {
		System.out.println("����");
	}
}