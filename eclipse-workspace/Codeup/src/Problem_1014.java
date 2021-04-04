import java.util.Scanner;

public class Problem_1014 {
	public static void main(String[] args) {
		char i;
		char j;
		char h;
		
		Scanner sc = new Scanner(System.in);
		
		i = sc.next().charAt(0);
		j = sc.next().charAt(0);
		
		h = i;
		i = j;
		j = h;
		
		
		System.out.printf("%c %c", i,j);
	}
}