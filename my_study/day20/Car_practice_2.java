package day20;

public class Car_practice_2 {
	public static void main(String[] args) {
			Car mycar1=new Car();
			Car mycar2 = new Car();
			mycar1.color="red";
			mycar2.color="bloack";
			mycar1.speedUp();
			mycar2.wiper();
			
			System.out.println("mycar1�� ��:"+mycar1.color);
			System.out.println("mycar2�� ��:"+mycar2.color);
			
			System.out.println("mycar1�� �ӵ�:"+mycar1.speed);
			System.out.println("mycar2�� �ӵ�:"+mycar2.speed);
			
			System.out.println("mycar1�� ������ �۵�����:"+mycar1.wiperOn);
			System.out.println("mycar2�� ������ �۵�����:"+mycar2.wiperOn);
	}

}

