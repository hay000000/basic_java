package ch11;

public class OperatorTest {

	public static void main(String[] args) {

		int gameScore = 150;
		
		int lastScore = ++gameScore; //gameScore += 1; gameScore = gameScore + 1; 1�� ���ϰ� ���ֱ�
		
		int lastScore2 = gameScore++; //gameScore�� ���� �ְ� �׵ڿ� +1
		
		System.out.println(lastScore);
		System.out.println(gameScore);
	}

}
