package Constructor;

public class Consttructor4 {
	public static void main(String[] args) {
		Iphone myphone1 = new Iphone();
		
		
		Iphone myphone2 = new Iphone("Iphone 12 Pro max", "Blue", 150);
		
		System.out.println(myphone1.capacity);
		System.out.println(myphone2.capacity);
		
	}
}

class Iphone {
	String model;
	String color;
	int capacity;

	Iphone() {

	}

	Iphone(String model, String color, int capacity) {
		this.model = model;
		this.color = color;
		this.capacity = capacity;
	}
	
	void info() {
		System.out.println("model : " + model);
		System.out.println("color : " + color);
		System.out.println("capacity : " + capacity);
	}
	
}