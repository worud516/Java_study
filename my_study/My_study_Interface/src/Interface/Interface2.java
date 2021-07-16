package Interface;

public class Interface2 {
	public static void main(String[] args) {
		TourGuide guide = new TourGuide();
		guide.leisureSports();
		guide.sighteeing();
		guide.food();
	}
}

interface Providable {
	void leisureSports();

	void sighteeing();

	void food();
}

class KoreaTour implements Providable {

	@Override
	public void leisureSports() {
		System.out.println("�Ѱ����� ����Ű ����");
	}

	@Override
	public void sighteeing() {
		System.out.println("�溹�� ���� ����");
	}

	@Override
	public void food() {
		System.out.println("���� ����� ����");
	}

}

class JapanTour implements Providable {

	@Override
	public void leisureSports() {
		System.out.println("���� Ÿ�� �������� ����");

	}

	@Override
	public void sighteeing() {
		System.out.println("����ī ���� ����");
	}

	@Override
	public void food() {
		System.out.println("�ʹ� ����");
	}

}

class TourGuide {
	// private Providable tour = new KoreaTour();
	private Providable tour = new JapanTour();

	public void leisureSports() {
		tour.leisureSports();
	}

	public void sighteeing() {
		tour.sighteeing();
	}

	public void food() {
		tour.food();
	}
}
