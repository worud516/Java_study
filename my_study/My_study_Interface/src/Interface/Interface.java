package Interface;

public class Interface {
	public static void main(String[] args) {
		
		B b = new B();
		b.methodA();
		b.methodB();
		
	}
}

interface Ainter{
	final int x = 10; // final ��������
	int y = 20; // final ��������
	
	abstract void methodA();
	void methodB(); // abstract ��������
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