package day44;

public class Synch_ShareBank {
	public static void main(String[] args) {
		ATM atm = new ATM();
		Thread mom = new Thread(atm,"����");
		Thread son = new Thread(atm,"�Ƶ�");
		
		mom.start();
		son.start();
		
	}
}
 class ATM implements Runnable{
	int money = 10000;
	public void run() {
				for (int i = 0; i < 5; i++) {
					withdraw(1000);
					printInfo();
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {	}	}	}
	 synchronized void withdraw(int money) {
		Thread.yield();
		this.money -= money;
		System.out.println(Thread.currentThread().getName() + "��(��) " + money + "�� ���");
	}
	void printInfo() {
		System.out.println("���� �ܾ�" + money + "��");
	}}


