import java.util.Arrays;

public class Array_2 {
	public static void main(String[] args) {
		
		// a라는 정수형 배열을 생성할 때, 바로 초기값을 넣는 방법
		int[] a = new int[] {10, 20, 4, 25, 18};
		
		// b라는 정수형 배열을 생성할 때, 초기값으로 넣는 방법 (new int[] 생략가능)
		int[] b = {1,2,3,4,5,6,7};
		
		// c라는 정수형 배열을 선언하고, 10개의 정수들을 묶을 수 있는 크기 할당
		int[] c = new int[10];
		
		// 배열.length: 배열의 길이, 배열의 요소갯수
		for(int i=0; i<c.length; i++) {
			c[i] = i;
		}
		
		for(int i=0; i<c.length;i++) {
			System.out.println(c[i]);
		}
		
		// 배열의 값을 문자형으로 출력
		System.out.println(Arrays.toString(c));
		
		
	}
}
