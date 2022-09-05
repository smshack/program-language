package lecture13;

public class ChildClass extends ParentClass {
	public ChildClass() {
		// TODO Auto-generated constructor stub
		System.out.println("자식 클래스 생성");
	}

	public void method1() {
		System.out.println("오버라이딩한 자식 메서드1");
	}

	public void method3() {
		System.out.println("자식 메서드3");
	}

	public void method4() {
		System.out.println("자식 메서드4");
	}
}
