package day11;

import java.util.Scanner;

public class ContinueEx2 {
	public static void main(String[] args) {
		int money=10000;
		System.out.println("���� ���� ���� 10000�� �Դϴ�.");
		Scanner sc= new Scanner(System.in);
		
		while(true) {
			System.out.println("�󸶸� ����Ͻðڽ��ϱ�?");
			int i=sc.nextInt();
			if(!(0<=i &&i<=money)){
				System.out.println("�ٽ� �Է����ּ���(�������� Ʋ�Ƚ��ϴ�.)");
				continue;
			}
			System.out.printf("���� %d���� ���ҽ��ϴ�.\n",money-=i); // money=money-i
			if(money==0) {
				break;
			}
			
		}
		System.out.println("��� ���� ����մϴ�. ����!");
	}
}
