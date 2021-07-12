package Constructor;

public class Constructor {
	public static void main(String[] args) {
		Aclass a = new Aclass();
		
		System.out.println(a);
		
	}
}


class Aclass{
	// 기본생성자(default 생성자)
	public Aclass() {
		System.out.println("Aclass 기본생성자( )");
	}
}
