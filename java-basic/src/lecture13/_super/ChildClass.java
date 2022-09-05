package lecture13._super;

public class ChildClass extends ParentClass{
public ChildClass() {
	// TODO Auto-generated constructor stub
}
@Override
	public void method1() {
		// TODO Auto-generated method stub
		super.method1();
		System.out.println("자식클래스의 method1 실행");
	}
}
