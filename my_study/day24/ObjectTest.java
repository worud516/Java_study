package day24;

public class ObjectTest {
	public static void main(String[] args) {
		Aclass a1=new Aclass();
		Aclass a2=new Aclass();
		
		//toString(): ��ü������ ���ڿ� ���
		System.out.println(a1.toString());
		System.out.println(a1);
		//equals(): �� ��ü�� �����Ѱ��� ��
		System.out.println(a1.equals(a1));
		//getClass():��ü�� Ŭ���������� ������
		System.out.println(a1.getClass());
	}

}
class Aclass{
	
}
