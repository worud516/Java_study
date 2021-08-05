package Thread2;

public class Yield1 {
	public static void main(String[] args) {
		MyThread6 s1 = new MyThread6();
		MyThread7 s2 = new MyThread7();

		Thread t1 = new Thread(s1);
		Thread t2 = new Thread(s2);

		t1.start();
		t2.start();
	}
}

class MyThread6 implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.print("★");
			Thread.yield(); // 자신에게 주어진 시간 양보
		}
	}
}

class MyThread7 implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.print("☆");
		}
	}

}