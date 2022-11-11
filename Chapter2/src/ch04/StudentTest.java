package ch04;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student();
		// new Student() : 생성자 => heap이라는 메모리에 
		//인스턴스 : studentLee
		studentLee.studentID = 12345;
		studentLee.setStudentName("Lee");
		studentLee.address = "서울 강남구";
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student();
		studentKim.studentID = 54321;
		studentKim.studentName="Kim";
		studentKim.address = "서울 마포구";
		
		studentKim.showStudentInfo();
		
		System.out.println(studentLee);
		System.out.println(studentKim);
//		ch04.Student@1c4af82c  : @1c4af82c - studentLee의 주소값
//		ch04.Student@379619aa
	}

}
