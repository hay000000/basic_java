package ch16;

import java.util.Scanner;

public class SwitchCaseTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		
		int day = switch(month) {
			//���� case�� ��쿡�� ������ �ѹ��� ��� �ȴ�.
//			case 1: case 3: case 5: case 7: case 8: case 10: case 12: 
			case 1,3,5,7,8,10,12 -> {
				System.out.println("�̹����� 31�ϱ��� �Դϴ�.");
				yield 31;
			}
			case 2 -> 
				 28;
			case 4,6,9,11 -> 
				 30;
			default ->{
				System.out.println("�������� �ʴ� ���Դϴ�.");
				yield -1; //��ȯ�� return ��� switch-case������ yield
			}
		};
		System.out.println(month+"���� "+day+"�� �Դϴ�.");
	}

}
