// 문제 : 아래와 같이 출력되도록 해주세요.
// 조건 : `숨쉬다` 기능을 중복하지 말아주세요.

class Exam_22 {
  public static void main(String[] args) {
    사람 a사람 = new 사람();
    a사람.숨쉬다();
  }
}
class 동물 {
  void 숨쉬다() {
    System.out.println("숨쉬다.");
  }
}

class 사람 extends 동물{
	
}
