//
//public class Exam_10 {
//	public static void main(String[] args) {
//		칼 a무기1 = new 칼();
//		활 a무기2 = new 활();
//		총 a무기3 = new 총();
//
//		int n1 = 10;
//		int n2 = 20;
//		int n3 = 30;
//		int[] all = new int[] { n1, n2, n3 };
//		for (int n : all) {
//			System.out.println(n);
//		}
//
//		// 모든 무기 작동():
//		a무기1.작동();
//		a무기2.작동();
//		a무기3.작동();
//
//		무기[] 무기들 = new 무기[3];
//		무기들[0] = a무기1;
//		무기들[1] = a무기2;
//		무기들[2] = a무기3;
//
//		for (int i = 0; i < 무기들.length; i++) {
//			무기 a무기 = 무기들[i];
//			a무기.작동();
//		}
//
//	}
//}
//
//abstract class 무기 {
//	abstract void 작동();
//}
//
//class 칼 extends 무기 {
//	void 작동() {
//		System.out.println("칼작동");
//	}
//}
//
//class 활 extends 무기 {
//	void 작동() {
//		System.out.println("활작동");
//	}
//}
//
//class 총 extends 무기 {
//	void 작동() {
//		System.out.println("총작동");
//	}
//}