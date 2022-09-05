package lecture10.Ex2;
//패키지의 사용
import lecture10.Ex1.PlusClass;

public class MainClass {
	public static void main(String[] args) {
		PlusClass plusClass = new PlusClass();
		int result = plusClass.plus(3,7);
		
		System.out.println(result);
	}
}
