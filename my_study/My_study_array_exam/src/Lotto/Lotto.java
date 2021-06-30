package Lotto;

import java.util.Random;
import java.util.Scanner;

public class Lotto {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		int lottoAr[] = new int[6];
		int userAr[] = new int[6];
		
		int bonus;
		int bonusUser;
		int count = 0;
		
		// �ζǹ迭�� 6���� �������� ����
		for(int i = 0; i < 6; i++) {
			lottoAr[i]=random.nextInt(45)+1;
		}
		// ���ʽ���
		bonus = random.nextInt(45)+1;
		
		// ����ڿ��� 6���� ���� �Է�
		System.out.print("���� �Է� 1 ~ 45 :");
		for(int i = 0; i < 6; i++) {
			userAr[i]=sc.nextInt();
		}
		
		System.out.print("���ʽ� �� �Է�:");
		bonusUser=sc.nextInt();
		
		// �ζǹ迭�� ���� ����ڹ迭�� ���� ���� ���� � �ִ��� ī����
		for(int i=0; i<6; i++) {
			for(int j=0; j < 6; j++) {
				if(lottoAr[j] == userAr[i]) {
					count++;
				}
			}
		}
		
		// count�� ���������� ������ϱ�
		if(count==6) {
			System.out.println("���ϵ帳�ϴ�! 1���Դϴ�!");
		}
		else if(count==5) {
			if(bonus==bonusUser) {
				System.out.println("���ϵ帳�ϴ�! 2���Դϴ�!");
			}
			else {
				System.out.println("���ϵ帳�ϴ�! 3���Դϴ�!");
			}
		}
		else if(count==4) {
			System.out.println("���ϵ帳�ϴ�! 4���Դϴ�!");
		}
		else if(count==3) {
			System.out.println("���ϵ帳�ϴ�! 5���Դϴ�!");
		}
		else {
			System.out.println("��ø�Դϴ�.");
		}
		
	}
}
