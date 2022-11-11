package ch10;

public class BirthDayTest {

	public static void main(String[] args) {

		BirthDay date = new BirthDay();
		
		date.setYear(2022);
		date.setMonth(12);
		date.setDay(30);
		
//		date.month = 100; //private으로 막고 set메소드에서 조건걸기
		//오류 막을 수 있다.
		
		date.showDate();
	}

}
