package Generic;

public class Generic1 {
	public static void main(String[] args) {
		Value v = new Value();
		
		v.typeSearch(3);
		v.typeSearch(3.14);
		v.typeSearch(3.14f);
		v.typeSearch('a');
		v.typeSearch("hello");
		v.typeSearch(true);
		
	}
}
class Value{
	public <T> void typeSearch(T x){
		if(x instanceof Integer) {
			System.out.println(x+"�� ���� �Դϴ�.");
			
		}
		else if(x instanceof Double||x instanceof Float) {
			System.out.println(x+ "�� �Ǽ� �Դϴ�.");
		}
		else if(x instanceof Character) {
			System.out.println(x+"�� ������ �Դϴ�.");
		}
		else if(x instanceof String) {
			System.out.println(x+"�� ���ڿ� �Դϴ�.");
			
		}
		else if(x instanceof Boolean) {
			System.out.println(x+"�� ���� �Դϴ�.");
		}
	}
}
