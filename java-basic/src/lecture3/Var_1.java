package lecture3;

import java.util.Random;

public class Var_1 {
	public static void main(String[] args) {

		Random rnd = new Random();
		int num1 = rnd.nextInt(6) + 1;

		System.out.println(num1);
	}
}
