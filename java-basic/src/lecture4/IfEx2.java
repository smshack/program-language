package lecture4;

import java.util.Scanner;

public class IfEx2 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.print("국어 점수를 입력: ");
	int kor = scan.nextInt(); //국어점수를 입력
	System.out.print("영어 점수를 입력: ");
	int eng = scan.nextInt(); //영어점수를 입력
	System.out.print("수학 점수를 입력: ");
	int met = scan.nextInt(); //수학점수를 입력
	
	double avg = (kor +eng + met)/3;
	
	System.out.println("평균 점수: "+avg);
	
	if(kor >avg) {
		System.out.println("국어점수는 평균보다 높다");
	}else if(kor ==avg) {
		System.out.println("국어 점스는 평균이다");
	}else {
		System.out.println("국어 점수는 평균보다 낮다");
	}
}
}
