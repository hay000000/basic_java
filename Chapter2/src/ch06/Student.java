package ch06;

public class Student {

	public int studentNumber;
	public String studentName;
	public int grade; //��� ���� (�⺻ �Ķ�)
	
	public Student() {} //�����ڰ� �ϳ��� �������� default������ ����, �ʼ���Ұ� �ִ� ��� ���� �ʿ� X
	
	//��������� �ʱ�ȭ�� ���Ѽ� student�� �����ϰڴ�
	//������ ���� ����
	public Student(int studentNumber, String studentName, int grade) {
		
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		this.grade = grade;
	}
	
	public String showStudentInfo() {
		
//		int i;// ��������
		
		return studentName +"�л��� �й��� " + studentNumber +"�̰�, " +grade +"�г� �Դϴ�.";
	}

}
