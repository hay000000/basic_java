package ch10;

public class ContantTest {

	public static void main(String[] args) {

		final int MAX_NUM = 100;
		final int MIN_NUM;
		
		MIN_NUM = 0; //상수는 출력 전에 값 지정
		//MAX_NUM = 20; //final 쓰면 변수 X
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
		
	}

}
