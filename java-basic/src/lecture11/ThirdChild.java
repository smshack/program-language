package lecture11;

public class ThirdChild {
	
	public ThirdChild() {
		
	}
	
	public void takeMoney(int money) {
		PapaPouch.MONEY =PapaPouch.MONEY -money;
		if(PapaPouch.MONEY <0) {
			System.out.println("셋째는 돈을 못받았어요");
		}

	}
}
