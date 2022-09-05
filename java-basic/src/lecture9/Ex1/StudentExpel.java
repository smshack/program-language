package lecture9.Ex1;

import java.util.ArrayList;

public class StudentExpel {
	ArrayList<Student> expelStudents;
	
	public StudentExpel() {
		expelStudents = new ArrayList<Student>();
	}
	
	public void addExpelStudent(String name, int age, int studentNum,String major) {
		expelStudents.add(new Student(name, age, studentNum,major));
		System.out.println("재적학생 정보 등록 완료");
	}
}
