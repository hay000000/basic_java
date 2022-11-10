package ch16;

import java.util.Scanner;

public class SwitchCaseTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		
		int day = switch(month) {
			//같은 case인 경우에는 옆으로 한번에 적어도 된다.
//			case 1: case 3: case 5: case 7: case 8: case 10: case 12: 
			case 1,3,5,7,8,10,12 -> {
				System.out.println("이번달은 31일까지 입니다.");
				yield 31;
			}
			case 2 -> 
				 28;
			case 4,6,9,11 -> 
				 30;
			default ->{
				System.out.println("존재하지 않는 달입니다.");
				yield -1; //반환값 return 대신 switch-case에서는 yield
			}
		};
		System.out.println(month+"월은 "+day+"일 입니다.");
	}

}
