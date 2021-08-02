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
			System.out.println("======전화번호부======");
			System.out.println("1. 고객정보 저장");
			System.out.println("2. 고객정보 검색");
			System.out.println("3. 고객정보 출력");
			System.out.println("4. 끝내기");
			System.out.print("번호 입력: ");
			choice = sc.nextInt();

			if (choice == 1) {
				System.out.println("=====고객정보 저장=====");
				insert();
			} else if (choice == 2) {
				System.out.println("=====고객정보 검색=====");
				search();
			} else if (choice == 3) {
				System.out.println("=====고객정보 출력=====");
				show();
			} else if (choice == 4) {
				System.out.println("=====종료합니다.=====");
				break;
			} else {
				System.out.println("=====잘못 입력하셨습니다.=====");
			}
		}
	}
	public static void insert() {
		System.out.print("저장할 고객의 이름:");
		String insertName= sc.next();
		if(hm.containsKey(insertName)) {
			System.out.println("이미 존재하는 사람이므로 저장할 수 없습니다.");
			return;
		}
		else {
			System.out.print("저장할 고객 번호:");
			String insertPhone= sc.next();
			hm.put(insertName,insertPhone);
			System.out.println("저장이 완료되습니다.");
		}
		
	}
	public static void search() {
		System.out.print("검색할 이름:");
		String searchName = sc.next();
		if(hm.containsKey(searchName)){
			System.out.println("검색 완료!");
			System.out.println("검색된 전화번호:"+hm.get(searchName));
			
		}
		else {
			System.out.println("존재하지 않는 이름입니다.");
		}
	}
	public static void show() {
		Set keySet = hm.keySet();
		Iterator i = keySet.iterator();
		System.out.println("-----전체 고객 조회-------");
		while(i.hasNext()) {
			String curName=(String)i.next();
			System.out.println("name:"+curName+",phone:"+hm.get(curName));
		}
	}
}
