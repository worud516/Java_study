package day28;

public class Anonymous3 {
	public static void main(String[] args) {
//		Inter1 i1=new Inter1(); �������̽� ��ü ���� �Ұ�
		Inter1 i1= new Inter1() {
			public void f1() {
				System.out.println("f1()");
			}
		};
		i1.f1();
	}
}

interface Inter1{
	public void f1();
}


