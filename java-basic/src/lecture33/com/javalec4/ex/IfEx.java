package lecture33.com.javalec4.ex;

import java.util.Scanner;

public class IfEx {
	public static void main(String[] args) {
		int i = 10;
		int j = 20;
		int h = 10;

		if (i > j) {
			System.out.println("i는 j  보다 큽니다");
		} else if (i == j) {
			System.out.println("i는 j 와 같습니다");
		} else {
			System.out.println("i는 j  보다  작습니다");
		}
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("국어 점수를 입력: ");
		int kor = scan.nextInt();
		System.out.print("영어 점수를 입력: ");
		int eng =scan.nextInt();
		System.out.print("수학 점수를 입력: ");
		int math = scan.nextInt();
		
		double avg =(kor+eng+math)/3;
		
		System.out.printf("평균 점수는 %.2f 입니다\n",avg);
		
		if(kor>avg) {
			System.out.println("국어 점수는 평균보다 높습니다");
		}else if(kor<avg) {
			System.out.println("국어 점수는 평균보다 낮습니다");
		}else {
			System.out.println("국어 점수는 평균 점수 입니다");
		}
		
		
	}
}