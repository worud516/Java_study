//package day44;
//
//public class Synchronized1 {
//	public static void main(String[] args) {
//			MyThreadB s1=new MyThreadB();
//			Thread t1=new Thread(s1,"A");
//			Thread t2=new Thread(s1,"B");
//			Thread t3=new Thread(s1,"C");
//			
//			t1.start();
//			t2.start();
//			t3.start();
//			
//	}
//
//}
//class MyThreadB implements Runnable{
//	 Ticketing ticket = new Ticketing();
//	public void run() {
//		ticket.ticketing();
//	}
//}
//class Ticketing{
//	int ticketNumber=1;
//	public void ticketing() {
//		if(ticketNumber>0) {
//			System.out.println(Thread.currentThread().getName()+"�� Ƽ���� ����!");
//			ticketNumber--;
//		}
//		else {
//			System.out.println(Thread.currentThread().getName()+"�� Ƽ���� ����!");
//		}
//		System.out.println(Thread.currentThread().getName()+"�� Ƽ���� �õ� �� Ƽ�ϼ�:"+ticketNumber);
//			
//		}
//	}
