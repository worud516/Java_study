package day10;

import java.util.Scanner;

public class While1 {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String answer=""; //while���� ����ǵ��� �ʱⰪ�� ������ ���� ���� �־��ش�
			int count=0;
			while(answer.equals("Y")) {
				System.out.println("������ ����Ͻðڽ��ϱ�?(Y)");
				answer=sc.nextLine();
				
				if(answer.equals("Y")) {
					System.out.printf("������ %d�� ����߽��ϴ�.\n",++count);
				}
				
			}
			System.out.println("�������");
	}

}
