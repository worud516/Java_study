package day23;

public class Constructor3 {
	public static void main(String[] args) {
		Bclass b1= new Bclass("���浿");
		System.out.println(b1.name);
		Bclass b= new Bclass();
		System.out.println(b);
	}

}
class Bclass{
	String name;
	//�����ڿ����ε�: ������ ������ �ߺ�����
	Bclass(){}
	Bclass(String name){ //�Ű����� ������
		System.out.println("Bclass�� �Ű����� ������( )");
		this.name=name;
	}
}

