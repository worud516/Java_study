package cafe;

import java.util.Scanner;

public class cafe {
	public static void main(String[] args) {
		int count = 0;
		// �ֹ��� �� 5�� ���� ����
		String orderList[] = new String[5];
		int total = 0;

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("===== Cafe =====");
			System.out.println("1. �ֹ��ϱ�");
			System.out.println("2. ����ϱ�");
			System.out.println("3. �����ϱ�");
			System.out.println("4. ������");
			System.out.println("�Է� : ");

			int num = sc.nextInt();

			if (num == 1) {
				String menuName = "";
				int menuPrice = 0;

				System.out.println("===== Menu  =====");
				System.out.println("1. �Ƹ޸�ī��\t3800��");
				System.out.println("2. ����������\t2400��");
				System.out.println("3. ī���\t4200��");
				System.out.println("4. ��ũƼ\t\t5100��");
				System.out.println("�ֹ��� �޴���ȣ : ");

				int menuNum = sc.nextInt();

				if (menuNum == 1) {
					menuName = "�Ƹ޸�ī��";
					menuPrice = 3800;
				} else if (menuNum == 2) {
					menuName = "����������";
					menuPrice = 2400;
				} else if (menuNum == 3) {
					menuName = "ī���";
					menuPrice = 4200;
				} else if (menuNum == 4) {
					menuName = "��ũƼ";
					menuPrice = 5100;
				} else {
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
					continue;
				}

				total += menuPrice;
				orderList[count] = menuName;
				count++;

				System.out.println("�ֹ��� �޴��� " + menuName + "�Դϴ�.");
				System.out.println("�ֹ��� �޴��� " + menuPrice + "�Դϴ�.");

			} else if (num == 2) {
				System.out.println("===== �ֹ��� �޴� ����Ʈ =====");

				for (int i = 0; i < count; i++) {
					System.out.println((i + 1) + ". " + orderList[i]);
				}

				System.out.println("����� �޴� ��ȣ : ");

				int cancleNum = sc.nextInt();

				if (1 <= cancleNum && cancleNum <= count) {
					String delMenu = orderList[cancleNum - 1];
					System.out.println(delMenu + "�޴� ����");

					for (int i = cancleNum - 1; i < count; i++) {
						orderList[i] = orderList[i + 1];
					}

					if (delMenu.equals("�Ƹ޸�ī��")) {
						total -= 3800;
					} else if (delMenu.equals("����������")) {
						total -= 2400;
					} else if (delMenu.equals("ī���")) {
						total -= 4200;
					} else if (delMenu.equals("��ũƼ")) {
						total -= 5100;
					}
					count--;
				}

			} else if (num == 3) {
				System.out.println("������ �ݾ� : " + total + "��");
				System.out.println("������ �ݾ� : ");

				int money = sc.nextInt();

				if (money < total) {
					System.out.println("���� �ݾ��� �����մϴ�.");
					continue;
				} else {
					System.out.println("�ܵ��� " + (money - total) + "�� �Դϴ�.");
					total = 0;
					for (int i = 0; i < 5; i++) {
						orderList[i] = "";
					}
					count = 0;
				}

			} else if (num == 4) {
				System.out.println("���α׷� ����");
				break;
			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}

		}

	}
}
