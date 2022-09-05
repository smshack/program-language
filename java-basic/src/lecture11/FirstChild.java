package lecture11;

public class FirstChild {
	
	public FirstChild() {
		
	}
	
	public void takeMoney(int money) {
		//static 으로 하면 객체를 생성하지 않고 바로 접근이 가능 하다
		PapaPouch.MONEY =PapaPouch.MONEY -money;
		if(PapaPouch.MONEY <0) {
			System.out.println("첫째는 돈을 못받았어요");
		}

	}
}
