package Constructor;

public class Constructor2 {
	public static void main(String[] args) {
		CellPhone myphone = new CellPhone();
	}
}

class CellPhone{
	String model = "Iphone12 Pro Max";
	String color = "Blue";
	int capacity = 150;
	
	CellPhone() {
		System.out.println("model :" + model);
		System.out.println("color :" + color);
		System.out.println("capacity :" + capacity);
	}
	
}
