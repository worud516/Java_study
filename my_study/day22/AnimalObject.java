package day22;

public class AnimalObject {
	public static void main(String[] args) {
		Animal animals[]=new Animal[3];
		for(int i=0;i<3;i++) {
		animals[i]=new Animal();
		}
		
		animals[0].kind="�����";
		animals[0].name="����";
		animals[0].age =1;
		
		animals[1].kind="������";
		animals[1].name="����";
		animals[1].age =3;
		
		animals[2].kind="�����";
		animals[2].name="����";
		animals[2].age =1;
		
		for(int i=0;i<3;i++) {
			animals[i].info();
		}
	}

}
class Animal{
	String kind;
	String name;
	int age;
	void info() {
		System.out.println("kind:"+kind);
		System.out.println("name:"+name);
		System.out.println("age:"+age);
	}
}