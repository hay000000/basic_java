package ch20;

public class NestedLoopTest {

	public static void main(String[] args) {

		
		int dan = 2;
		int count = 1;
		
//		for(; dan <=9; dan++) {
//			
//			for(count =1; count <=9; count++) {
//				System.out.println(dan + "X" + count + "=" + dan*count); 
//			}
//			System.out.println();
//		}
		
		dan = 2;
		while(dan <= 9) {
			//내부 반복문이 사용되기전에 초기화 해야할것은 해야함
			count = 1;
			while(count <=9) {
				System.out.println(dan + "X" + count + "=" + dan*count); 
				count++;
			}
			dan++;
			System.out.println();
		}
	}

}
