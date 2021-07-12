package Constructor;

public class Constructor3 {
	public static void main(String[] args) {
		Bclass b = new Bclass("Kylis");
		//Bclass b2 = new Bclass(); // 오류 매개변수 생성자를 만드는 순간 디폴트 생성자는 없어짐. 하지만 디폴트 생성자를 만들어 놓으면 사용가능.
		
		
		System.out.println(b.name);
	}
}

class Bclass {
	String name;
	
	Bclass(){}
	
	Bclass(String name){ //매개변수 생성자
		this.name = name;
		System.out.println(name);
	}
}