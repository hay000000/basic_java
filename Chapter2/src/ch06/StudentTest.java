package ch06;
//클라이언트 객체
public class StudentTest {

	public static void main(String[] args) {

//		Student studentLee = new Student(); //default 생성자
//		studentLee.grade = 1;
		
//		System.out.println(studentLee.showStudentInfo());
		
		Student studentKim = new Student(123456,"Kim",3);
		System.out.println(studentKim.showStudentInfo());
		
	}

}
