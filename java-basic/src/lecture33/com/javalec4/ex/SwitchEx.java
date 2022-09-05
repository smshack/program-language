package lecture33.com.javalec4.ex;

import java.util.Scanner;

public class SwitchEx {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.print("수를 입력:");
	int num =scan.nextInt();
	int result=num%2;
	switch(result) {
	case 0:
		System.out.println("짝수 입니다");
		break;
	case 1:
		System.out.println("홀수 입니다");
		break;
	default:
		System.out.println("이건 둘다 아닐때");
		break;
	}
}
}
