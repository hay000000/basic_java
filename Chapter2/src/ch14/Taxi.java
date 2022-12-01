package ch14;

public class Taxi {

	int TaxiName;
	int passengerCount;
	int money;
	
	public Taxi(int TaxiName) {
		this.TaxiName = TaxiName;
		
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showBusInfo() {
		System.out.println(TaxiName + "택시의 승객 수는 "+ passengerCount + "명 이고, 수입은 "+money+ "원 입니다.");
	}
	
}
