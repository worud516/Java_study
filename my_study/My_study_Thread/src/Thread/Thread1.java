package Thread;

public class Thread1 {
	public static void main(String[] args) {
		// JVM ������ ��û
		// 1. Thread Ŭ���� ��ӹ��� Ŭ������ �����带 ��û
		MyThread th1 = new MyThread();
		th1.start();

		// 2. Runnable �������̽��� ������ Ŭ������ �����带 ��û
		MyThread2 th2 = new MyThread2();
		Thread t = new Thread(th2); // Thread(Runnable targe)
		t.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("���� �Լ� ���� �� " + i);
		}
	}
}

// Thread Ŭ���� ��ӹ޾� �۾� ����
class MyThread extends Thread {
	// run()�޼��� �������̵�(������)
	public void run() {
		// �����尡 �ؾ��� �۾� ����
		for (int i = 0; i < 10; i++) {
			System.out.println("������ ���� �� " + i);
		}
	}
}

// Runnable �������̽��� �����Ͽ� �۾��� ����
class MyThread2 implements Runnable {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("���ʺ� ���� �� " + i);
		}
	}
}