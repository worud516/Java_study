package PhoneBookMain;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class PhoneBookMain {
	static HashMap<String, String> hm = new HashMap<String, String>();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int choice;
		while (true) {
			System.out.println("======��ȭ��ȣ��======");
			System.out.println("1. ������ ����");
			System.out.println("2. ������ �˻�");
			System.out.println("3. ������ ���");
			System.out.println("4. ������");
			System.out.print("��ȣ �Է�: ");
			choice = sc.nextInt();

			if (choice == 1) {
				System.out.println("=====������ ����=====");
				insert();
			} else if (choice == 2) {
				System.out.println("=====������ �˻�=====");
				search();
			} else if (choice == 3) {
				System.out.println("=====������ ���=====");
				show();
			} else if (choice == 4) {
				System.out.println("=====�����մϴ�.=====");
				break;
			} else {
				System.out.println("=====�߸� �Է��ϼ̽��ϴ�.=====");
			}
		}
	}
	public static void insert() {
		System.out.print("������ ���� �̸�:");
		String insertName= sc.next();
		if(hm.containsKey(insertName)) {
			System.out.println("�̹� �����ϴ� ����̹Ƿ� ������ �� �����ϴ�.");
			return;
		}
		else {
			System.out.print("������ �� ��ȣ:");
			String insertPhone= sc.next();
			hm.put(insertName,insertPhone);
			System.out.println("������ �Ϸ�ǽ��ϴ�.");
		}
		
	}
	public static void search() {
		System.out.print("�˻��� �̸�:");
		String searchName = sc.next();
		if(hm.containsKey(searchName)){
			System.out.println("�˻� �Ϸ�!");
			System.out.println("�˻��� ��ȭ��ȣ:"+hm.get(searchName));
			
		}
		else {
			System.out.println("�������� �ʴ� �̸��Դϴ�.");
		}
	}
	public static void show() {
		Set keySet = hm.keySet();
		Iterator i = keySet.iterator();
		System.out.println("-----��ü �� ��ȸ-------");
		while(i.hasNext()) {
			String curName=(String)i.next();
			System.out.println("name:"+curName+",phone:"+hm.get(curName));
		}
	}
}
