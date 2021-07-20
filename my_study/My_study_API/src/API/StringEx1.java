package API;

public class StringEx1 {
	public static void main(String[] args) {
		String str="Hello";
		System.out.println(str.concat(" world!"));
		// substring(시작위치, 끝위치) : 시작위치 ~ 끝위치전까지 가져오기
		System.out.println(str.substring(2, 4));
		// 시작위치부터 끝까지 가져오기
		System.out.println(str.substring(3));
		System.out.println(str.length());
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		
		// 인덱스값에 해당하는 문자 가져오기
		System.out.println(str.charAt(0));
		// 해당문자의 인덱스 값 반환 (대소문자 구분, 못찾으면 -1반환)
		System.out.println(str.indexOf("o"));
		// 대소문자 구분
		System.out.println(str.equals("Hello"));
		// 앞뒤 공백 제거
		System.out.println("  t e s t   ".trim());
		// 값 변경
		System.out.println("hello world".replace('l', 'L'));
		System.out.println("hello world".replaceAll("hello", "bye"));
		
		
		
	}
}

