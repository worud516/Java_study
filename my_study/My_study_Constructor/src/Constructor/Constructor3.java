package Constructor;

public class Constructor3 {
	public static void main(String[] args) {
		Bclass b = new Bclass("Kylis");
		//Bclass b2 = new Bclass(); // ���� �Ű����� �����ڸ� ����� ���� ����Ʈ �����ڴ� ������. ������ ����Ʈ �����ڸ� ����� ������ ��밡��.
		
		
		System.out.println(b.name);
	}
}

class Bclass {
	String name;
	
	Bclass(){}
	
	Bclass(String name){ //�Ű����� ������
		this.name = name;
		System.out.println(name);
	}
}