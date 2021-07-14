package Polymorphism;

public class Polymorphism2 {
	public static void main(String[] args) {
		Animal lion1 = new Lion();
		Lion lion2 = new Lion();
		
		Animal rabbit1 = new Rabbit();
		Animal monkey1 = new Monkey();
		
		
		Zookeeper james = new Zookeeper();
		
		james.feed(lion1);
		james.feed(lion2);
		
		james.feed(rabbit1);
		james.feed(monkey1);
		
		
		
	}
}

class Animal{
	void breath() {
		System.out.println("������");
	}
}
class Lion extends Animal{
	public String toString(){
		return "����";
	}
}
class Rabbit extends Animal{
	public String toString(){
		return "�䳢";
	}
}
class Monkey extends Animal{
	public String toString(){
		return "������";
	}
}
class Zookeeper{
	void feed(Animal animal) {
		System.out.println(animal + "���� �����ֱ�");
	}
}
