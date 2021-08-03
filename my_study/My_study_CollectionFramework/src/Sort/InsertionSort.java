package Sort;

import javax.print.attribute.SetOfIntegerSyntax;

public class InsertionSort {
	public static void main(String[] args) {
		int ar[] = { 8, 1, 2, 5, 4, 3, 6, 7 };
		int tmp;
		int idx;
		System.out.println("===정렬전===");
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
		System.out.println();
		for (int i = 1; i < ar.length; i++) {
			idx = i;
			for (int j = i - 1; j >= 0; j--) {
				if (ar[idx] < ar[j]) {
					tmp = ar[idx];
					ar[idx] = ar[j];
					ar[j] = tmp;
					idx = j;
					System.out.println("swap");
					for (int k = 0; k < ar.length; k++) {
						System.out.print(ar[k] + " ");
					}
					System.out.println();
				} else {
					break;
				}
			}
		}
		System.out.println("===정렬후===");
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
	}
}
