package Lotto;

import java.util.Random;
import java.util.Scanner;

public class Lotto {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		int lottoAr[] = new int[6];
		int userAr[] = new int[6];
		
		int bonus;
		int bonusUser;
		int count = 0;
		
		// 로또배열에 6개의 랜덤값을 저장
		for(int i = 0; i < 6; i++) {
			lottoAr[i]=random.nextInt(45)+1;
		}
		// 보너스값
		bonus = random.nextInt(45)+1;
		
		// 사용자에게 6개의 값을 입력
		System.out.print("숫자 입력 1 ~ 45 :");
		for(int i = 0; i < 6; i++) {
			userAr[i]=sc.nextInt();
		}
		
		System.out.print("보너스 값 입력:");
		bonusUser=sc.nextInt();
		
		// 로또배열의 값과 사용자배열의 값중 같은 값이 몇개 있는지 카운팅
		for(int i=0; i<6; i++) {
			for(int j=0; j < 6; j++) {
				if(lottoAr[j] == userAr[i]) {
					count++;
				}
			}
		}
		
		// count의 갯수에따라서 등수정하기
		if(count==6) {
			System.out.println("축하드립니다! 1등입니다!");
		}
		else if(count==5) {
			if(bonus==bonusUser) {
				System.out.println("축하드립니다! 2등입니다!");
			}
			else {
				System.out.println("축하드립니다! 3등입니다!");
			}
		}
		else if(count==4) {
			System.out.println("축하드립니다! 4등입니다!");
		}
		else if(count==3) {
			System.out.println("축하드립니다! 5등입니다!");
		}
		else {
			System.out.println("낙첩입니다.");
		}
		
	}
}
