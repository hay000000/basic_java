package ch08;

public class CharaterTest {

	public static void main(String[] args) {

		char ch1 = 'A';
		
		System.out.println(ch1);
		System.out.println((int)ch1); //형변환
		
		char ch2 = 66;
		
		System.out.println(ch2);
		System.out.println((char)ch2);
		
		int ch3 = 67;
		
		System.out.println(ch3);
		System.out.println((char)ch3);
		
//		char ch = -66; //음수는 표현 X
//		char ch = 123456; //2byte안에서 핸들링 불가한 값 X
		
		char han = '한';
		char ch = '\uD55C';
		
		System.out.println(han);
		System.out.println(ch);
	}

}
