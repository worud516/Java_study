package day29;

import java.util.Scanner;
public class Finally2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a,b;
		System.out.print("a:");
		a=sc.nextInt();
		System.out.print("b:");
		b=sc.nextInt();
		try {
			int c=b/a;
			System.out.println("c:"+c);
		}
		catch(ArithmeticException e) {
		System.out.println("������ �߻��߽��ϴ�.");
		}
		finally {
			System.out.println("������ ����~");
		}
	}
}


