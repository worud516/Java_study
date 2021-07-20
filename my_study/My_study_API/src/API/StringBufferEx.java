package API;

public class StringBufferEx {
	public static void main(String[] args) {
		String str = "test";
		StringBuffer buffer = new StringBuffer("test");
		
		str.replace('t', 'T');
		System.out.println(str);
		
		buffer.replace(1, 3, "Es");
		System.out.println(buffer);
	}
}

