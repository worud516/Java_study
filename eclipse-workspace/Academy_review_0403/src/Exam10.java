// 1부터 5까지의 합을 더한 결과를 출력해주세요.

class Exam10 {
  public static void main(String[] args) {
    int i = 1;
    int sum = 0;
    
    while(i <= 5) {
    	sum = sum + i;
    	i++;
    }
	System.out.println(sum);
	  
  }
}