package ch06;

public class Student {

	public int studentNumber;
	public String studentName;
	public int grade; //멤버 변수 (기본 파랑)
	
	public Student() {} //생성자가 하나도 없을때만 default생성자 생성, 필수요소가 있는 경우 만들 필요 X
	
	//멤버변수를 초기화를 시켜서 student를 생성하겠다
	//생성자 직접 만듦
	public Student(int studentNumber, String studentName, int grade) {
		
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		this.grade = grade;
	}
	
	public String showStudentInfo() {
		
//		int i;// 지역변수
		
		return studentName +"학생의 학번은 " + studentNumber +"이고, " +grade +"학년 입니다.";
	}

}
