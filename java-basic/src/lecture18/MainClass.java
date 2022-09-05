package lecture18;


public class MainClass {
	public static void main(String[] args) {
		
		
		//하나의 객체 타입으로 묶어주는 역할 만 하는 Toy interface
		Toy pooh = new PoohToyClass();
		Toy mazinger = new MazingerToyClass();
		Toy airPlaToy = new AirPlaneToyClass();
		
		Toy [] toys = {pooh, mazinger,airPlaToy};

		for (int i = 0; i < toys.length; i++) {
		
		}
	}
}
