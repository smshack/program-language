package lecture9.Ex1;

import java.util.ArrayList;

public class StudentManager {
	ArrayList<Student> students = new ArrayList<Student>();
	StudentExpel studentExpel = new StudentExpel();
	
	public static void main(String[] args) {
		StudentManager studentManager = new StudentManager();
		
		studentManager.addStudent("홍길동", 22, 20123487, "연극영화과");
		studentManager.addStudent("홍길순", 24, 20144534, "수학과");
		studentManager.addStudent("이은경", 21, 20134533, "국문과");
		studentManager.addStudent("김철수", 23, 20156745, "체육과");
		studentManager.addStudent("김순희", 26, 20173453, "무용과");
		
		for (int i = 0; i < studentManager.students.size(); i++) {
			System.out.println(studentManager.students.get(i).toString());
		}
		System.out.println();
		studentManager.students.get(0).updateInfo(1, "변경홍길동");
		
		for (int i = 0; i < studentManager.students.size(); i++) {
			System.out.println(studentManager.students.get(i).toString());
		}
	}
		
	
	private void addStudent(String name, int age, int studentNum, String major) {
		students.add(new Student(name, age, studentNum, major));
		System.out.println(name+"학생 정보 입력 성공!!");
	}
	
	
}
