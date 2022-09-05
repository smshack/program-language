package lecture23;

import java.util.Random;

public class RandomEx {
public static void main(String[] args) {
	double d = Math.random();
	System.out.println(d);
	System.out.println();
	
	int di =(int)(d*10);
	System.out.println(di);
	System.out.println();
	
	Random rd = new Random();
	int i = rd.nextInt(100);
	
	System.out.println(i);
}
}
