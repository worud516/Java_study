package day25;

public class Downcasting1 {
	public static void main(String[] args) {
		//��ĳ����
		Human h1=new Student("���浿",20,"�����ϱ�",3);
//		h1.study();
		//�ٿ�ĳ����
		Student s1= (Student)h1;
		s1.study();
		
	}

}
