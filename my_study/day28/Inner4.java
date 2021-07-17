package day28;

public class Inner4 {
	public static void main(String[] args) {
		OuterClass oc = new OuterClass();
		System.out.println("OuterClass�� a ��: "+oc.a);
		System.out.println("OuterClass�� b ��: "+OuterClass.b);
		
		System.out.println("===inner Ŭ���� �����ϱ�===");
		OuterClass oc2 = new OuterClass();
		OuterClass.Inner i = oc2.new Inner();
		System.out.println("Inner�� c ��: "+i.c);
		i.InnerMethod();
		
		OuterClass.StaticInner si = new OuterClass.StaticInner();
		System.out.println("StaticInner�� d ��: "+si.d);
		
		si.staticMethod();
		OuterClass.StaticInner.staticMethod();
	}
}
class OuterClass{
	int a;
	static int b=4;
	class Inner{
		int c=5;
		public void InnerMethod() {
			System.out.println("<Inner Class>");
		}
	}
	static class StaticInner{
		int d=6;
		static int stat=10;
		
		public static void staticMethod() {
			System.out.println("<Static Inner>");
		}		
	}
	
}