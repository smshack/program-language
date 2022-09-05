package lecture33.com.javalec3.ex;

import java.util.Scanner;

public class Calculation {
public static void main(String[] args) {
	int i =10;
	int j=3;
	int h=5;
	
	System.out.println("==산술연산자==");
	System.out.println("덧셈: "+(i+j));
	System.out.println("뺄셈: "+(i-j));
	System.out.println("곱셈: "+(i*j));
	System.out.println("나눗셈: "+(i/j));
	System.out.println("나머지: "+(i%j));
	
	System.out.println("===자동증감 연산자===");
	i++;
	System.out.println("증가: " +i);
	j--;
	System.out.println("감소: " +j);
	
	System.out.println("==등등 비교, 관계 연산자 ==");
	System.out.println("i == j >>" +(i==j));
	System.out.println("i != j >>" +(i!=j));
	System.out.println("i > j >>" +(i>j));
	System.out.println("i < j >>" +(i<j));
	
	
	System.out.println("==논리 연산자 ==");
	System.out.println("&&(AND) >> "+(i>j && i>h) );
	System.out.println("&&(AND) >> "+(i>j && i<h) );
	System.out.println("양쪽다 만족하면 true");
	System.out.println("||(OR) >> "+(i>j || i>h) );
	System.out.println("||(OR) >> "+(i>j || i<h) );
	System.out.println("한쪽만  만족하면 true");
	
	
	System.out.println("==삼항 연산자 ==");
	int result =(h != 5? 1:2);
	System.out.println("삼항 연산의 결과는 "+ result);
	
	System.out.println("==할당 연산자==");
	System.out.println("h = "+ h);
	h=i;
	System.out.println("h= "+h);
	
	System.out.println("==줄여쓰는 연산자");
	i=i+100;
	System.out.println("i="+i);
	i=11;
	System.out.println("i="+i);
	i+=100;
	System.out.println("i="+i);
	
	System.out.println("===스캐너를 이용해서 입력 받기");
	Scanner scan = new Scanner(System.in);
	System.out.print("k를 입력:");
	int k =scan.nextInt();
	
	System.out.println("k를 3으로 나누어서 나머지가 0이 나오면 사용자가 입력한 숫자는 3의 배수 입니다");
	System.out.println("k%3="+(k%3));
}
}
