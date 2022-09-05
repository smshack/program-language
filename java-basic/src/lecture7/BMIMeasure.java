package lecture7;

public class BMIMeasure {
	public static void main(String[] args) {
		
		BMI man = new BMI(21,170,73,"010-2112-5570");
		System.out.println(man.getAge());
		System.out.println(man.getHeight());
		System.out.println(man.getWeight());
		System.out.println(man.getPhoneNum());
		System.out.println(man.toString());		
		
	}
}
