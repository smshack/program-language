package lecture25.listEx;

import java.util.Vector;

public class Ex3 {
	public static void main(String[] args) {
		Vector<String> vector = new Vector<String>(3);
		
		System.out.println("vector의 크기 : "+ vector.size());
        System.out.println("vector의 용량 : "+ vector.capacity());
        System.out.println(vector.toString());
        vector.addElement("동방신기");
        vector.addElement("아이유");
        vector.addElement("버스커");
        vector.addElement("소녀시대");
        System.out.println(vector.toString());
        System.out.println("데이터 삽입 후 vector의 크기 : "+ vector.size());
        System.out.println("데이터 삽입 후 vector의 용량 : "+ vector.capacity());
        vector.addElement("레드벨벳");
        vector.addElement("아이즈원");
        vector.addElement("카드");
        System.out.println(vector.toString());
        System.out.println("vector의 첫번째 요소 : "+vector.elementAt(0));
       
        vector.removeAllElements();
       
        System.out.println("데이터 삭제 후 vector의 크기 : "+ vector.size());
        System.out.println("데이터 삭제 후 vector의 용량 : "+ vector.capacity());


	}
}
/*- 첫 줄을 보면 new Vector<String>(3)  으로 Vector 객체를 생성하였다.

- 이것은 Vector 객체에 String 객체를 담을 수 있으며, 용량은 3 이며, size가 용량을 초과했을 때, 3의 크기만큼 용량이 증가한다. (매개변수를 지정하지 않으면 기본 용량 10, 증가 용량 10이다.)

- vector.addElement() 로 String 객체를 4개 대입하고 , size와 용량을 확인하니, size=4, capacity=6 이다.

- 이것은 기본 용량 3에서 3보다 많은 객체가 대입되어, 용량이 3만큼 동적으로 증가한 것이다.

- removeAllElements()로 요소들을 전체 삭제 후, size 와 용량을 확인 하면, size는 0 이며, 용량은 그대로 6이다.


*/