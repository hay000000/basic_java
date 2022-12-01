package ch14;

public class TakeTransTest {

	public static void main(String[] args) {

		Student studentJ = new Student("James",5000);
		Student studentT = new Student("Tomas",10000);
		Student studentE = new Student("Edward",20000);
		
		Bus bus100 = new Bus(100);
		Bus bus500 = new Bus(500);
		
		studentJ.takeBus(bus100);
		
		Subway greenSubway = new Subway(2);
		studentT.takeSubway(greenSubway);
		
		Taxi taxi2 = new Taxi(33);
		studentE.takeTaxi(taxi2);
		
		studentJ.showInfo();
		studentT.showInfo();
		studentE.showInfo();
		
		System.out.println("\n");
		
		bus100.showBusInfo();
		greenSubway.showBusInfo();
		
		bus500.showBusInfo();
		
		taxi2.showBusInfo();
		
	}

}
