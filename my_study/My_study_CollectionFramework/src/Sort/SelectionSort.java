package Sort;

public class SelectionSort {
	public static void main(String[] args) {
		int ar[] = { 8, 1, 2, 5, 4, 3, 6, 7 };
		int min, tmp;
		System.out.println("===������===");
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < ar.length - 1; i++) {
			min = i;
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[min] > ar[j]) {
					tmp = ar[min];
					ar[min] = ar[j];
					ar[j] = tmp;
					System.out.println("swap");
					for (int k = 0; k < ar.length; k++) {
						System.out.print(ar[k] + " ");
					}
					System.out.println();
				}
			}
		}
		System.out.println("===������===");
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
		System.out.println();
	}
}
