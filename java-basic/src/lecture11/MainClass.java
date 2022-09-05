package lecture11;
//static은 클래스 변수
//객체는 클래스에서 생성(복사) 되어 짐
// 클래스 하나에서 무한대로 객체를 생성할 수 있고 그러한 객체는 모양은 동일하지만, 전혀 다른 개체임
//하지만 static이 붙은 벼수는 객체 변수가 아닌ㄴ 클래스 변수로써 객체가 생성되기 전에 이미 존재


//static은 잘 사용하면 좋고, 그렇지 않으면 큰 재앙을 불러 올 수 있음
/*
 * static 개워드를 사용하 변수는 객체 생성과는 상관 없이 클래스와 함께 존재 하게 됨
 * 즉 객체 생성을 하지 않아도 메모리에 상주하게 됨
 * 이렇게 생성을 하지 않고도 존재한다는 것은 그 만큼 메모리를 사용하지 않아도 된다는 것
 * 지금은 간단한 예제를 살펴보고 있기 때문에 객체 생성에 따른 메모리의 부하를 느낄 수 없지만,
 * 프로젝트가 커지면 객체 생성에 따른 메모리 부족 현상이 있을 수 있음
 * 물론 가비지콜렉터가 열심히 메모리 정리를 해도 생길 수 있는 문제
 * 객체 생성을 하지 않고도 사용할 수 있다는 것은 분명 장점이지만, 
 * 한편으로 생각해 보면 가비지 콜렉터의 관리 밖에 있기 때문에 항상 메모리에 상주해 있음
 * 즉 프로젝트가 커지고, 시스템이 오랜 시간 동안 돌아가게 되면 시스템 운영속도가 점차 느려지다가 급기야 재앙으로 올수 있음
 * 따라서 static 사용은 신중해야 함
 * 
 * static 변수로 사용되는 대표적인 예는 상수 
 * 
 * 
 * 
 * 
 * 
 * */
public class MainClass {
public static void main(String[] args) {
	FirstChild fc = new FirstChild();
	fc.takeMoney(100);
	SecondChild sc = new SecondChild();
	sc.takeMoney(100);
	ThirdChild tc = new ThirdChild();
	tc.takeMoney(100);

	System.out.println("아빠 지갑의 돈은"+PapaPouch.MONEY);
}
}
