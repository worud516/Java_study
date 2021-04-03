// 문제 : 아래와 같이 출력해주세요.
// 문제 : 단을 * 1000까지 출력해주세요.

class Exam05 {
  public static void main(String[] args) {
    int dan = 8;
    
    int i = 1;
    
    for(i = 1; i <= 1000; i++) {
    	System.out.printf("%d * %d = %d\n", dan, i, dan * i);
    }

    
    // 출력
    /*
    8 * 1 = 8
    8 * 2 = 16
    8 * 3 = 24
    8 * 4 = 32
    8 * 5 = 40
    8 * 6 = 48
    8 * 7 = 56
    8 * 8 = 64
    8 * 9 = 72
    ...
    8 * 1000
    */
  }
}