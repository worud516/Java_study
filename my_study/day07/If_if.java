package day07;

import java.util.Scanner;

public class If_if {
	public static void main(String[] args) {
			String id,password;
			Scanner input = new Scanner(System.in);
			System.out.print("���̵� �Է����ּ���:");
			id=input.nextLine(); //���� ���� �Է¹ޱ�
			
			if(id.equals("java")) {
				System.out.println("id ��ġ!");
				System.out.print("��й�ȣ�� �Է����ּ���:");
				password=input.nextLine();
				if(password.equals("abc123")) {
					System.out.println("password ��ġ");
					System.out.println("�α��� ����!");
				}
				else {
					System.out.println("password ����ġ");
				}
				
			}
			else {
				System.out.println("ID ����ġ");
			}
			
	}

}
