package InnerClass;

public class Anonymous1 {
	public static void main(String[] args) {
		OuterClass1 o = new OuterClass1() {
			void a() {
				System.out.println("���Ӱ� ������ �͸�Ŭ���� �޼���");
			}
		};
		o.a();
		OuterClass1 ok = new OuterClass1();
		ok.a();
	}
}

class OuterClass1 {
	void a() {
		System.out.println("method a");
	}

	void b() {

	}
}
