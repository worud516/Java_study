package SportsMain;

public class SportsMain {

	public static void main(String[] args) {
		Member member1 = new Member();
		Member member2 = new Member();
		Member member3 = new Member();
		Member member4 = new Member();
		
	
		member1.name = "��ö��";
		member1.age = 32;
		member1.gender = "����";
		
		member2.name = "���ȣ";
		member2.age = 28;
		member2.gender = "����";
		
		member3.name = "�̿���";
		member3.age = 24;
		member3.gender = "����";
		
		
		member4.name = "��õ";
		member4.age = 32;
		member4.gender = "����";
		
				
		member1.info();
		member2.info();
		
		Member.centerName = "bye";
		
		member3.info();
		member4.info();
		
		
	}

}


class Member{
	static String centerName = "Hello";
	String name;
	String gender;
	int age;
	
	void info() {
		System.out.println("center Name : " + centerName);
		System.out.println("Name : " + name);
		System.out.println("gender : " + gender);
		System.out.println("age : " + age);
		System.out.println();
	}
	
}