package lecture4;

import java.util.Scanner;

public class SwitchEx {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("수를 입력: ");
		int i = scan.nextInt();

		int result = i % 2;

		switch (result) {
		case 0:
			System.out.println("입력한 수는 짝수");
			break;
			
		case 1:
			System.out.println("입력한 수는 홀수");
			break;
			
		default:
			System.out.println("잘 모르겠습니다");
			break;
		}
	}
}
