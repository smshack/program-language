package lecture12;

public class MainClass {
public static void main(String[] args) {
	ChildClass child = new ChildClass();
	System.out.print("아버님 이름: ");
	child.getPapaName();
	System.out.print("어머니 이름: ");
	child.getMamiName();
	
	System.out.println(child.pStr);
	 System.out.println(child.cStr);
}
}
