package day16;

import java.util.Scanner;

public class Cafe {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=0;
		String orderList[]=new String[5];
		int total=0;
		for(int i=0;i<orderList.length;i++) {
			orderList[i]="";
		}
		while(true) {
			System.out.println("�١ڡ١� Cafe �١ڡ١�");
			System.out.println("���� �ݾ�:"+total+"��");
			System.out.println("�ֹ�����-------");
			for(int i=0;i<count;i++) {
				System.out.println(i+1+". "+orderList[i]);
			}
			System.out.println("--------------");
			System.out.println("1. �ֹ��ϱ�");
			System.out.println("2. ����ϱ�");
			System.out.println("3. �����ϱ�");
			System.out.println("4. ������");
			System.out.print("�Է�:");
			int num=sc.nextInt();
			if(num==1) {
				String menuName;
				int menuPrice=3800;
				System.out.println("�١ڡ١�MENU�١ڡ١�");
				System.out.println("1.�Ƹ޸�ī��\t3800 ��");
				System.out.println("2.����������\t2400 ��");
				System.out.println("3.ī���\t\t4200 ��");
				System.out.println("4.��ũƼ\t\t5100 ��");
				System.out.print("�ֹ��� �޴�:");
				int choice=sc.nextInt();
				if(choice==1) {
					menuName="�Ƹ޸�ī��";
					menuPrice=3800;
				}
				else if(choice==2) {
					menuName="����������";
					menuPrice=2400;
				}
				else if(choice==3) {
					menuName="ī���";
					menuPrice=4200;}
				else if(choice==4) {
					menuName="��ũƼ";
					menuPrice=5100;
				}
				else {
					System.out.println("�߸��Է��ϼ̽��ϴ�.");
					continue;
				}
				System.out.println("�ֹ��� �޴��� "+menuName+"�Դϴ�.");
				System.out.println("������ "+menuPrice+"�� �Դϴ�.");
				orderList[count]=menuName;
				total+=menuPrice;
				count++;
			}
			else if(num==2) {
				for(int i=0;i<count;i++) {
				System.out.println(i+1+":"+orderList[i]);
				}
				System.out.print("����� �޴� ��ȣ:");
				int cancel=sc.nextInt();
				if(1<=cancel && cancel<=count) {
					String delMenu=orderList[cancel-1];
					System.out.println(delMenu+" �޴� ����!");
					for(int i=cancel-1;i<count;i++) {
						orderList[i]=orderList[i+1];
					}
					if(delMenu.equals("�Ƹ޸�ī��")){
						total-=3800;
					}
					else if(delMenu.equals("����������")){
						total-=2400;
					}
					else if(delMenu.equals("ī���")){
						total-=4200;
					}
					else if(delMenu.equals("��ũƼ")){
						total-=5100;
					}
					count--;
				}
			}
			else if(num==3) {
				System.out.println("�����ؾ��� �ݾ�: "+total+"��");
				System.out.print("������ �ݾ�:");			
				int money=sc.nextInt();
				if(money<total) {
					System.out.println("�ܵ��� �����մϴ�.");
					continue;
				}
				else{
					System.out.println("�ܵ��� "+(money-total)+"�� �Դϴ�.");
					System.out.println("������ �Ϸ�Ǿ����ϴ�.");
				}
				total=0;
				for(int i=0;i<orderList.length;i++) {
					orderList[i]="";
				}
				count=0;
			}
			else if(num==4) {
				System.out.println("���α׷� ����!");
				 break;
			}
			else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
			
			
		}
	}

}
