package ch04;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student();
		// new Student() : ������ => heap�̶�� �޸𸮿� 
		//�ν��Ͻ� : studentLee
		studentLee.studentID = 12345;
		studentLee.setStudentName("Lee");
		studentLee.address = "���� ������";
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student();
		studentKim.studentID = 54321;
		studentKim.studentName="Kim";
		studentKim.address = "���� ������";
		
		studentKim.showStudentInfo();
		
		System.out.println(studentLee);
		System.out.println(studentKim);
//		ch04.Student@1c4af82c  : @1c4af82c - studentLee�� �ּҰ�
//		ch04.Student@379619aa
	}

}
