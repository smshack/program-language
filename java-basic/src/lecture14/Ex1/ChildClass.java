package lecture14.Ex1;

public class ChildClass extends SuperClass {

	public ChildClass() {
		// TODO Auto-generated constructor stub
		System.out.println("자식 클래스 생성");
	}
	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("자식 클래스에서 재 정의 하였습니다");
		System.out.println("");
	}

}
