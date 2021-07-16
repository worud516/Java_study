package Interface;

public class Interface {
	public static void main(String[] args) {
		
		B b = new B();
		b.methodA();
		b.methodB();
		
	}
}

interface Ainter{
	final int x = 10; // final 생략가능
	int y = 20; // final 생략가능
	
	abstract void methodA();
	void methodB(); // abstract 생략가능
}

class B implements Ainter{

	@Override
	public void methodA() {
		System.out.println("methodA()");
	}

	@Override
	public void methodB() {
		System.out.println("methodB()");
	}
	
}