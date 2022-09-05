package lecture10.Ex2;
import lecture10.Ex3.AccessTest;

public class MainClass2 extends AccessTest{
	public static void main(String[] args) {
		AccessTest at = new AccessTest();
		//접근을 제한해 준다
		
		//at.a=5; 
		System.out.println(at.b);
		at.b=5;
		
		System.out.println(at.b);
		System.out.println(at.getClass().getName());
		
	}
}
