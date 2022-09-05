package lecture27;

public class Student {
	private String name;
	private int grade;
	
	public Student(String name, int grade) {
		this.name =name;
		this.grade = grade;
	}
	
	public String toString() {
		return name +" : "+grade;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		String compareValue = obj.toString();
		String thisValue = toString();
		
		
		return thisValue.equals(compareValue);
	}
	
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return toString().hashCode();
	}
}
