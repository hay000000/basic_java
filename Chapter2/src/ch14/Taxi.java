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
		System.out.println(TaxiName + "�ý��� �°� ���� "+ passengerCount + "�� �̰�, ������ "+money+ "�� �Դϴ�.");
	}
	
}
