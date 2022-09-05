package lecture9.Ex1;

public class Student {
	private String name;
	private int age;
	private int studentNum;
	private String major;
	
	public Student(String name, int age, int studentNum, String major) {
		this.name =name;
		this.age =age;
		this.studentNum =studentNum;
		this.major=major;
	}
	
	public void updateInfo(int i, String info) {
		switch(i) {
		case 1: //이름 수정
			setName(info);
			break;
		case 2:
			setAge(Integer.parseInt(info));
			break;
		
		case 3:
			setStudentNum(Integer.parseInt(info));
			break;
		case 4:
			setMajor(info);
			break;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getStudentNum() {
		return studentNum;
	}

	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", studentNum=" + studentNum + ", major=" + major + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((major == null) ? 0 : major.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + studentNum;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (major == null) {
			if (other.major != null)
				return false;
		} else if (!major.equals(other.major))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (studentNum != other.studentNum)
			return false;
		return true;
	}
	
}
