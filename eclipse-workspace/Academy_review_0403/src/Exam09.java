// 문제 : 아래와 같이 출력해주세요.
// 문제 : 단을 `* 1000`부터 `* -500`까지 출력해주세요.

class Exam09 {
  public static void main(String[] args) {
    int dan = 8;
    
    int i = 1000;
    
    for(i = 1000; i >= -500; i--) {
    	System.out.printf("%d * %d = %d\n", dan, i, dan * i);    	
    }
    
    
    // 출력
    /*
    8 * 1000 = 8000
    ...
    8 * -500 = -4000
    */
  }
}