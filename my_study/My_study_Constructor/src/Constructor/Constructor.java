package Constructor;

public class Constructor {
	public static void main(String[] args) {
		Aclass a = new Aclass();
		
		System.out.println(a);
		
	}
}


class Aclass{
	// �⺻������(default ������)
	public Aclass() {
		System.out.println("Aclass �⺻������( )");
	}
}
