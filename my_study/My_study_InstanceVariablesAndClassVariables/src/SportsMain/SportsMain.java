package SportsMain;

public class SportsMain {

	public static void main(String[] args) {
		Member member1 = new Member();
		Member member2 = new Member();
		Member member3 = new Member();
		Member member4 = new Member();
		
	
		member1.name = "±èÃ¶¼ö";
		member1.age = 32;
		member1.gender = "³²ÀÚ";
		
		member2.name = "±è¹ÎÈ£";
		member2.age = 28;
		member2.gender = "³²ÀÚ";
		
		member3.name = "ÀÌ¿µÈñ";
		member3.age = 24;
		member3.gender = "¿©ÀÚ";
		
		
		member4.name = "°í¼®Ãµ";
		member4.age = 32;
		member4.gender = "³²ÀÚ";
		
				
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