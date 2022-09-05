package lecture2;

public class basevariable {
	// 기본 자료형
	//JAVA 언어에 이미 존재하고 있는 데이터 타입,
	//주로 간단한 데이터
	
	//객체(참조)자료형
	//여러 가지 데이터들이 모여 있는 복잡한 데이터로 기본 자료형에 비해 크고
	//주소값을 가리키고 있다
	//String, System, ArrayList
	
	public static void main(String[] args) {
	//기본 자료형 출력하기
		//논리형
		//문자형
		//정수형
		//실수형
		
		
		
		boolean a=true;
		char b ='a';
		byte c =120;
		short d =129;
		int e =130;
		long f =12344;
		float g =(float) 3.1415;
		double h =3.123453452341341;
		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		
		//명시적 형변환
				//큰 자료형의 데이터를 작은 자료형으로 변환
				//데이터 손실이 있을 수 있고, 코드에 명시해 주어야 함
		int h2 =(int)h;
		System.out.println(h2);
		
		byte f2=(byte)f;
		System.out.println(f2);//오버플로우 발생
		
		
		//묵시적 형변환
		//작은 자료형의 데이터를 큰 자료형으로 변환
		int e1 =10;
		double h1 =e1;
		System.out.println(h1);
	}
}
