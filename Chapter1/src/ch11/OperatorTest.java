package ch11;

public class OperatorTest {

	public static void main(String[] args) {

		int gameScore = 150;
		
		int lastScore = ++gameScore; //gameScore += 1; gameScore = gameScore + 1; 1를 더하고 값넣기
		
		int lastScore2 = gameScore++; //gameScore값 먼저 넣고 그뒤에 +1
		
		System.out.println(lastScore);
		System.out.println(gameScore);
	}

}
