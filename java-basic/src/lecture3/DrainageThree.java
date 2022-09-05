package lecture3;

import java.util.Scanner;

public class DrainageThree {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.print("수를 입력:");
	int i = scan.nextInt();
	
	System.out.println("i를 3으로 나누어서 나머지가 0 이 나오면 입력한 숫자는 3의 배수입니다");
	System.out.println("i % 3 = "+(i%3));
}
}
