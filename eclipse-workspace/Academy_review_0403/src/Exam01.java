// 문제 : 아래와 같이 출력해주세요.

class Main {
  public static void main(String[] args) {
    System.out.println("== 정답 v1 ==");
    System.out.println("8 * 1 = 8");
    System.out.println("8 * 2 = 16");
    System.out.println("8 * 3 = 24");
    System.out.println("8 * 4 = 32");
    System.out.println("8 * 5 = 40");
    System.out.println("8 * 6 = 48");
    System.out.println("8 * 7 = 56");
    System.out.println("8 * 8 = 64");
    System.out.println("8 * 9 = 72");

    System.out.println("== 정답 v2 ==");
    System.out.println("8 * 1 = 8\n8 * 2 = 16\n8 * 3 = 24\n8 * 4 = 32\n8 * 5 = 40\n8 * 6 = 48\n8 * 7 = 56\n8 * 8 = 64\n8 * 9 = 72");

    System.out.println("== 정답 v3 ==");
    String s = "";
    s = s + "8 * 1 = 8\n";
    s = s + "8 * 2 = 16\n";
    s = s + "8 * 3 = 24\n";
    s = s + "8 * 4 = 32\n";
    s = s + "8 * 5 = 40\n";
    s = s + "8 * 6 = 48\n";
    s = s + "8 * 7 = 56\n";
    s = s + "8 * 8 = 64\n";
    s = s + "8 * 9 = 72";
    System.out.println(s);
    
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
    */
  }
}