package ch06;
//Ŭ���̾�Ʈ ��ü
public class StudentTest {

	public static void main(String[] args) {

//		Student studentLee = new Student(); //default ������
//		studentLee.grade = 1;
		
//		System.out.println(studentLee.showStudentInfo());
		
		Student studentKim = new Student(123456,"Kim",3);
		System.out.println(studentKim.showStudentInfo());
		
	}

}
