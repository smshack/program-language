package lecture7;

public class BMI {
	private int age;
	private int height;
	private int weight;
	private String phoneNum;
	
	public BMI() {
		
	}
	
	public BMI(int age, int height, int weight, String phoneNum) {
		this.age =age;
		this.height = height;
		this.weight = weight;
		this.phoneNum = phoneNum;
	}
	
	public double calculateBMI() {
		double result =weight/(height*height);
		return result;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	@Override
	public String toString() {
		return "BMIClass [age=" + age + ", height=" + height + ", weight=" + weight + ", phoneNum=" + phoneNum + "]";
	}
	
	
}
