// 문제 : 아래와 같이 출력해주세요.
// 문제 : 단을 * 1000까지 출력해주세요.
// 조건 : 곱하는 순서를 거꾸로 해주세요.

class Exam08 {
  public static void main(String[] args) {
    int dan = 8;
    
    int i = 1000;
    
    for(i = 1000; i >= 1; i--) {
    	System.out.printf("%d * %d = %d\n", dan, i, dan * i);    	
    }
    
    // 출력
    /*
    8 * 1000 = 8000
    ...
    8 * 1 = 8
    */
  }
}