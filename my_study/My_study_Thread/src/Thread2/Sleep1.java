package Thread2;

public class Sleep1 {
	public static void main(String[] args) {
		SleepThread t = new SleepThread();
		t.start();
	}
}

class SleepThread extends Thread {
	public void run() {
		System.out.println("ī��Ʈ �ٿ� 5��");
		for (int i = 5; i >= 0; i--) {
			System.out.println(i);
			if (i != 0) {
				try {
					Thread.sleep(1000); // 1�ʵ��� ������ block
				} catch (InterruptedException e) {
					System.out.println(e.toString());
				}
			}
		}
		System.out.println("����");
	}
}
