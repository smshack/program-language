package lecture12;

public class Cmenu extends Pmenu{

	public Cmenu() {
		// TODO Auto-generated constructor stub
		System.out.println("아빠걸 상속 받은 아들의 메뉴");
		System.out.println("오버라이딩 - 부모 클래스의 내용을 재정의해서 사용");
	}
	
	public void makeBeefChungCukJang() {
		System.out.println("쇠고기 청국장");
	}
	
	public void makeHotDoenJanGuk() {
		System.out.println("얼큰 된장국");
	}
	
	public void makeKongNaMool() {
		System.out.println("콩나물국");
	}
	
	@Override//오버라이딩 -부모에 있는걸 자식에서 재정의
	public void makeChungCukJang() {
		// TODO Auto-generated method stub
		System.out.println("아들이 재정의한 청국장");
	}
	
	@Override
	public void makeGalbiJjim() {
		// TODO Auto-generated method stub
		System.out.println("아들이 재 정의한 콩비지");
	}
}
