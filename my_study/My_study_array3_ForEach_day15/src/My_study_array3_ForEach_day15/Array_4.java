package My_study_array3_ForEach_day15;

import java.util.Arrays;

public class Array_4 {
	public static void main(String[] args) {
		int [] a = {1,2,3,4,5,6};
		int [] b = {0,0,0,0,0,0,0};
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
		
		// System.arraycopy(src, srcPos, dest, destPos, length);
		// src: 복사할 배열
		// srcPos: 복사를 하기 시작할 인덱스
		// dest: 덮어쓸 배열
		// destPost: 덮어쓰기 시작할 인덱스
		// length: 복사할 길이
		
		
		
		
		System.arraycopy(a, 2, b, 3, 4);
		
		System.out.println(Arrays.toString(b));

	}
}
