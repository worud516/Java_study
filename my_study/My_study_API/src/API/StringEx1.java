package API;

public class StringEx1 {
	public static void main(String[] args) {
		String str="Hello";
		System.out.println(str.concat(" world!"));
		// substring(������ġ, ����ġ) : ������ġ ~ ����ġ������ ��������
		System.out.println(str.substring(2, 4));
		// ������ġ���� ������ ��������
		System.out.println(str.substring(3));
		System.out.println(str.length());
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		
		// �ε������� �ش��ϴ� ���� ��������
		System.out.println(str.charAt(0));
		// �ش繮���� �ε��� �� ��ȯ (��ҹ��� ����, ��ã���� -1��ȯ)
		System.out.println(str.indexOf("o"));
		// ��ҹ��� ����
		System.out.println(str.equals("Hello"));
		// �յ� ���� ����
		System.out.println("  t e s t   ".trim());
		// �� ����
		System.out.println("hello world".replace('l', 'L'));
		System.out.println("hello world".replaceAll("hello", "bye"));
		
		
		
	}
}

