package lecture6;
// 절차 지향
/*물이 위에서 아래로 흐르는 것처럼 순차적인 처리가 중요시 되며
프로그램 천체가 유기적으로 연결되도록 만드는 프로그래밍 기법
객체 지향 언어를 사용하는 것에 비해 더 발리 처리 되어 시간적으로 유리
객체지향 프로그래밍은 개발하려는 것을 기능별로 묶어 모듈화하느모써
하드웨어가 같은 기증을 중복으로 연산자히 않도록 하고
모듈을 재활용하기 때문에 하드웨어의 처리양을 획기적으로 줄여줌*/
//동일한 로직의 코드를 만들어 놓고 메소드를 사용하여 결과값을 반환하는 방식이 나옴


public class Procedure_oriented2 {
	public static void main(String[] args) {
		int sum =0;
		String result="";

		
	 Procedure_oriented2 Pr = new Procedure_oriented2();
	 sum =Pr.sum(0, 10);
	 System.out.printf("1부터 10까지의 정수의 합은 %d\n",sum);
	 
	 result=Pr.evenOdd(sum);
	 System.out.println(result);
	}
	
	
	public int sum(int i,int j) {
		int r=0;
		
		for (int h = 0; h < j; h++) {
			r+=h;
		}
		return r;
	}
	
	public String evenOdd(int sum) {
		String r = new String();
		
		if(sum%2==0) {
			r= "짝수 입니다";
		}else {
			r= "홀수 입니다";
		}
		
		return r;
	}
}
