package ch10;

public class BirthDayTest {

	public static void main(String[] args) {

		BirthDay date = new BirthDay();
		
		date.setYear(2022);
		date.setMonth(12);
		date.setDay(30);
		
//		date.month = 100; //private���� ���� set�޼ҵ忡�� ���ǰɱ�
		//���� ���� �� �ִ�.
		
		date.showDate();
	}

}