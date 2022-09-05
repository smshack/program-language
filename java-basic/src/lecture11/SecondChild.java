package lecture11;

public class SecondChild {
	
	public SecondChild() {
		
	}
	
	public void takeMoney(int money) {
		PapaPouch.MONEY =PapaPouch.MONEY -money;
		if(PapaPouch.MONEY <0) {
			System.out.println("둘째는 돈을 못받았어요");
		}

	}
}
