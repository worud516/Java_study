package day11;

import java.util.Scanner;

public class BreakEx1 {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int num;
			while(true) {
				System.out.print("���� �Է�:");
				num=sc.nextInt();
				if(num==0) {
					System.out.println("�ݺ� ����!");
					break;
				}
				System.out.println("�Է°�:"+num);
			}
	}

}
