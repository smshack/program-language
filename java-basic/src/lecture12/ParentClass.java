package lecture12;

/*
*객체 지향 언어의 대표적인 JAVA를 공부 할 때 가장 중요하고 꼭 알고 넘어가야 하는 부부이 상속과 추상화 개념
*
*이렇게 중요한 부분을 정확하게 알고 사용하는 개발자는 의외로 많지 않음
*그런 개발자를 무늬만 개발자라고 한다
*다소 농담 섞인 의견이었으나, 중요하 것은 객체 지향 어어를 하며서 상속과 추상화를 모르며 객체지향 언어를 
*한다고 말할 수 없을 정도로 상속과 추상화의 개념은 중요
*
*상속
*어떤 객체가 다르 객체로 부터 객체의 속성과 메소드를 상속 가능
*이럴 경우 상속 받은 객체는 상속해준 객체의 데이터 및 메소드를 이용할 수 있고 또는 변경할 수도 있음(오버라이딩)
*
*상속을 통해서 4발 자전거를 만든다고 생각해 보겠스비다
*자전거에는 기본ㄴ적으로 핸들 바퀴 브레이크 페달 프레임 등이 있어야 함
*그리고 4발 자전거는 기본적으로 바퀴가 4개 있어야 함
*각 부붐을 가져와서 이어 붙임
*
*프로그램도 기존의 좋은 클래스가 있다면 상속을 통해서 개발 시간을 단축 가능
*
*
*
*상속이 필요한 이유
*항상 맨땅에 헤딩할 수 는 없음
*1. 모든 개발을 처음부터 하얀 도화지에 할 필요는 없음
*이미 좋은 프로그램이 있다면 상속을 통해서 좋은 결과물을 빠른 시간에 만들 수 있음
*
*2. 다양한 객체를 상속을 통해서 하나의 객체로 묶을 수 있음
*
*
*/
public class ParentClass {
	String pStr ="부모 클래스";
	
	public ParentClass() {
		
	}
	
	public void getPapaName() {
		// TODO Auto-generated method stub
		System.out.println("아빠");
	}
	
	public void getMamiName(){
		System.out.println("엄마");
	}
	
}
