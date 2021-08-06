package day44;

public class Money1 {
	public static void main(String[] args) {
		Account account = new Account();
		Son son=new Son(account);
		Mom mom= new Mom(account);
		son.start();
		mom.start();
	}
}
class Account{
	int money=0;
	//�Ա�,���
	public int showMoney() {
		return money;
	}
	public synchronized void setMoney() {
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException ie) {System.out.println(ie.toString());}
		this.money+=2000;
		System.out.println("��Ӵϰ� �뵷�� �Ա��߽��ϴ�. ���� �ܾ�: "+this.showMoney());
		this.notify();
	}
	public synchronized void getMoney() {
		while(money<=0) {
		try {
		System.out.println("�����ܰ� ���� �Ƶ� ��� ��");
		this.wait();}
		catch(InterruptedException ie) {}
	}
		this.money-=2000;
		System.out.println("�Ƶ��� �뵷�� ����߽��ϴ�.���� �ܾ�: "+this.showMoney());
	}
}
class Son extends Thread{
	private Account account;
	Son(Account account){this.account =account;}
	public void run() {
		for(int i=0;i<10;i++) {
			account.getMoney();
		}
	}
}

class Mom extends Thread{
	private Account account;
	Mom(Account account){this.account =account;}
	public void run() {
		for(int i=0;i<10;i++) {
			account.setMoney();
		}
	}
}

