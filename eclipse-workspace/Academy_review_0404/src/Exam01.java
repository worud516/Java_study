//import java.util.Scanner;

// ctrl + shift + o 필요한 임포트나 필요없는 임포트 자동 추가/삭제 해줌

public class Exam01 {
	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);

		// nextline은 한줄 전체 다 받음.
		// String str = sc.nextLine();
		// System.out.println(str);

//		int dan = 8;
//		int i = 1;
//		
//		String str = String.format("%d * %d = %d\n", dan, i, dan * i);
//		
//		System.out.println(str);

//		int[] arr = new int[3];
//		
//		arr[0] = 10;
//		arr[1] = 20;
//		arr[2] = 30;
//		System.out.printf("%p", arr);

		boolean[] arr1 = new boolean[3];
		// boolean[] arr1 = {true, true, false};
		arr1[0] = true;
		arr1[1] = true;
		arr1[2] = false;

		double[] arr2 = new double[3];
		// double[] arr2 = {3.14, 5.55, 10.0};
		arr2[0] = 3.14;
		arr2[1] = 5.55;
		arr2[2] = 10.0;

		int[] arr3 = new int[10];
		// int[] arr3 = {1,2,3,4,5,6,7,8,9,10};
		for (int i = 0; i < arr3.length; i++) {
			arr3[i] = i + 1;
		}

		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		for (int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}

	}
}
