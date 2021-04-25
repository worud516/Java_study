// 문제 : 아래가 실행되도록 해주세요.
// 조건 : 배열을 사용할 수 없습니다.

class Exam_01{
	public static void main(String[] args) {
		사람인력관리소 a사람인력관리소 = new 사람인력관리소();
		
		a사람인력관리소.add사람("홍길순", 33);
		// 나이가 33살인 1번째 사람(홍길순)이 추가되었습니다.
		a사람인력관리소.add사람("홍길동", 20);
		// 나이가 20살인 2번째 사람(홍길동)이 추가되었습니다.
		a사람인력관리소.add사람("임꺽정", 30);
		// 나이가 30살인 3번째 사람(임꺽정)이 추가되었습니다.
		a사람인력관리소.add사람("김철수", 55);
		// 나이가 55살인 4번째 사람(김철수)이 추가되었습니다.
		
		사람 a사람1 = a사람인력관리소.get사람(1);
		a사람1.자기소개();
		// 저는 1번, 홍길순, 33살 입니다.
		
		사람 a사람2 = a사람인력관리소.get사람(2);
		a사람2.자기소개();
		// 저는 2번, 홍길동, 20살 입니다.
		
		사람 a사람3 = a사람인력관리소.get사람(3);
		a사람3.자기소개();
		// 저는 3번, 임꺽정, 30살 입니다.
		
		사람 a사람4 = a사람인력관리소.get사람(4);
		a사람4.자기소개();
		// 저는 4번, 김철수, 55살 입니다.
	}
}

class 사람인력관리소{
	사람[] 사람들;
//	
//	사람 a사람0;
//	사람 a사람1;
//	사람 a사람2;
	
	int 마지막_사람_번호;
	
	사람인력관리소(){
		마지막_사람_번호 = 0;
		사람들 = new 사람[100];
	}
	
	
	void add사람(String 이름, int 나이) {
		int 번호 = 마지막_사람_번호 + 1;
		
		사람 a사람 = new 사람();
		a사람.번호 = 번호;
		a사람.이름 = 이름;
		a사람.나이 = 나이;
		
		사람들[번호 - 1] = a사람;
		
//		if(번호 == 1) {
//			a사람0 = a사람;
//		}
//		else if (번호 == 2) {
//			a사람1 = a사람;
//		}
//		else if (번호 == 3) {
//			a사람2 = a사람;
//		}
				
		System.out.printf("나이가 %d살인 %d번째 사람(%s)이 추가되었습니다.\n",나이,번호,이름);
		// 마지막_사람_번호 = 번호;
		마지막_사람_번호++; 
	}
	
	
	사람 get사람(int 번호) {
		
		return 사람들[번호 -1];
//		if (번호 == 1) {
//			return a사람0;
//		}
//		else if(번호 == 2) {
//			return a사람1;
//		}
//		else if(번호 == 3) {
//			return a사람2;
//		}
//		else {
//			return null;
//		}
		//return new 사람5();
	}
}

class 사람{
	String 이름;
	int 나이;
	int 번호;
	
	void 자기소개() {
		System.out.println("저는 " + 번호 + "번 " + 이름 + ", " + 나이 + "살 입니다.");
	}
}

