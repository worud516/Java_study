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
		System.out.println("º˚Ω¨±‚");
	}
}
class Lion extends Animal{
	public String toString(){
		return "ªÁ¿⁄";
	}
}
class Rabbit extends Animal{
	public String toString(){
		return "≈‰≥¢";
	}
}
class Monkey extends Animal{
	public String toString(){
		return "ø¯º˛¿Ã";
	}
}
class Zookeeper{
	void feed(Animal animal) {
		System.out.println(animal + "ø°∞‘ ∏‘¿Ã¡÷±‚");
	}
}
