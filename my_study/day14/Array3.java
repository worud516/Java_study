package day14;

import java.util.Scanner;

public class Array3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int scores[][] = new int[4][3];
		String subject[] = { "����", "����", "����" };
//2���� �迭 Ȱ���ؼ� ����ڿ��� �Է¹��� �� �����ϴ� ���
		for (int j = 0; j < 4; j++) {
			System.out.println((j + 1) + "�� �л� ����----");
			for (int i = 0; i < 3; i++) {
				System.out.print(subject[i] + ":");
				scores[j][i] = sc.nextInt();
			}
		}
//		2�����迭�� ����� ���� ���
		for (int i = 0; i < 3; i++) {
			System.out.print("\t" + subject[i]);
		}
		System.out.println();
		for (int j = 0; j < 4; j++) {
			System.out.print(j+1+"��:\t");
			for (int i = 0; i < 3; i++) {
				System.out.print(scores[j][i] + "\t");
			}
			System.out.println();
		}
	}

}












