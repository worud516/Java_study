package day27;

public class Interface3 {
	public static void main(String[] args) {
		TourGuide guide=new TourGuide();
		guide.leisureSports();
		guide.sightseeing();
		guide.food();
	}
}
interface Providable{
	void leisureSports();
	void sightseeing();
	void food();
}
class KoreaTour implements Providable{
	@Override
	public void leisureSports() {
		System.out.println("�Ѱ����� ����Ű ����");
	}
	@Override
	public void sightseeing() {
		System.out.println("�溹�� ���� ����");
	}
	@Override
	public void food() {
		System.out.println("���� ����� ����");
	}
}
class JapanTour implements Providable{
	@Override
	public void leisureSports() {
		System.out.println("���� Ÿ�� �������� ����");
	}
	@Override
	public void sightseeing() {
		System.out.println("����ī ���� ����");
	}
	@Override
	public void food() {
		System.out.println("�ʹ� ����");
	}}

class TourGuide{
//	private Providable tour= new KoreaTour();
	private Providable tour= new JapanTour();
	public void leisureSports() {
		tour.leisureSports();
	}
	public void sightseeing() {
		tour.sightseeing();
	}
	public void food() {
		tour.food();
	}
}




