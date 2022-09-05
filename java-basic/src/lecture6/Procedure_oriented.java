package lecture6;
// 절차 지향
/*물이 위에서 아래로 흐르는 것처럼 순차적인 처리가 중요시 되며
프로그램 천체가 유기적으로 연결되도록 만드는 프로그래밍 기법
객체 지향 언어를 사용하는 것에 비해 더 발리 처리 되어 시간적으로 유리
객체지향 프로그래밍은 개발하려는 것을 기능별로 묶어 모듈화하느모써
하드웨어가 같은 기증을 중복으로 연산자히 않도록 하고
모듈을 재활용하기 때문에 하드웨어의 처리양을 획기적으로 줄여줌*/

import lecture4.ForBreakEx;

//장점
//컴퓨터의 처리구조와 유사해 실행속도가 빠름

//단점
//유지보수가 어려움
// 실행 순서가 정해져 있어 코드의 순서가 바뀌면 동일한 결과를 보장하기 어려움
//디버깅이 어려움

public class Procedure_oriented {
	public static void main(String[] args) {
		int sum =0;
		int result =0;
		
		for (int i = 0; i <=10; i++) {
			sum =+i;
		}
		System.out.printf("1부터 10까지의 정수의 합은 %d\n",sum);
		
		result =sum%2;
		if(result ==0) {
			System.out.println("결과는 짝수입니다");
		}else {
			System.out.println("결과는 홀수 입니다");
		}
	}
	
}
