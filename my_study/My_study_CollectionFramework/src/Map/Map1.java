package Map;

import java.util.HashMap;
import java.util.Scanner;

public class Map1 {
	public static void main(String[] args) {
		HashMap<String,String> hm = new HashMap<String,String>();
		Scanner sc=  new Scanner(System.in);
		
		// 1. put(key, value)
		hm.put("apple","���");
		hm.put("paper","����");
		hm.put("flower","��");
		String voca;
		
		System.out.print("�˰� ���� �ܾ �Է��ϼ���:");
		voca = sc.nextLine();
		
		// 2. containsKey(key) : key�� hashmap�� �����ϸ� true
		if(hm.containsKey(voca)) {
			// 3.get(key) : value �� ��ȯ
			System.out.println("�ش��ϴ� ����: "+hm.get(voca));
		}
		else {
			System.out.println("�ش� �ܾ ���� ���� �����ͺ��̽��� �����ϴ�.");
		}
	}

}
