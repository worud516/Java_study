package Abstraction;

public class ShapeMain {

	public static void main(String[] args) {
		Shape shapes[] = new Shape[3];
		
		// �θ��� ��ü�迭 ��ҿ� �ڽ� �� �ֱ� --> ��ĳ����
		shapes[0] = new Rect();
		shapes[1] = new Circle();
		shapes[2] = new Line();
		
		for(int i = 0; i < 3; i++) {
			shapes[i].draw();
		}
		

	}

}

abstract class Shape{
	abstract void draw();
	
}

class Rect extends Shape{
	void draw() {
		System.out.println("�簢���� �׸���.");
	}
}

class Circle extends Shape{
	void draw() {
		System.out.println("���� �׸���");
	}
}
class Line extends Shape{
	void draw() {
		System.out.println("���� �׸���");
	}
}