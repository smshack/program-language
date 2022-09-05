package lecture17.Ex1;

public class MainClass {
	
	public static void main(String[] args) {
		
		InterfaceClass interfaceClass = new InterfaceClass();
		interfaceClass.getStr();
		interfaceClass.calculate();
		
		// 인터페이스를 객체 타입으로 사용 가능(객체로 사용으로는 할 수 없음)
		InterfaceEx ife = new InterfaceClass();	// 타입 변경 가능
		InterfaceEx2 ife2 = new InterfaceClass();	// 타입 변경 가능
		System.out.println();
		
		//해당하는 객체로 사용할 수 있는 메서드를 제한할 수 있다
		interfaceClass.calculate();
		interfaceClass.getStr();
		
		ife.calculate();//getStr 접근 안됨
		
		ife2.getStr();//calculate 접근 안됨
		
		
		
	}
	
}

