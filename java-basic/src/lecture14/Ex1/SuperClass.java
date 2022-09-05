package lecture14.Ex1;

public abstract class SuperClass {
	public SuperClass() {
		// TODO Auto-generated constructor stub
		System.out.println("부모추상 클래스 생성");
	}
	
	public abstract void method1();
	
	
	public void method2() {
		System.out.println("SuperClassEx의 method2 입니다");
	}
}
