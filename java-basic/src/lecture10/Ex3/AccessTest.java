package lecture10.Ex3;
//접근 제한 자에 대해서 알아보자
public class AccessTest {
	private int a =10;
	public int b=20;
	protected int c=30;
	
	
	
	//private
	//외부에서 접근이 불가능 , 즉 같은 클래스 내에서만 접근이 가능
	
	
	//default
	// 기본 제한자로써 아무것도 붙지 않고, 자신의 클래스 내부와 같은 패키지 내에서만 접근이 가능
	
	//protected
	// 상속 받은 클래스 또는 같은 패키지 내에서만 접근이 가능
	
	//public
	//모든 접근을 허용
}
