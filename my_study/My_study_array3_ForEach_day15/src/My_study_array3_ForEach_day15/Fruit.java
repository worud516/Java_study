package My_study_array3_ForEach_day15;

import java.util.Scanner;

public class Fruit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String fruits[] = new String[3];
		
		for(int i = 0; i < 3; i++) {
			System.out.print("�ֹ��� ����: ");
			fruits[i]=sc.next();
		}
		
		System.out.println("---�ֹ����� ����---");
		
		for(String eachFruit:fruits) {
			System.out.println(eachFruit);
		}
		
	}
}
