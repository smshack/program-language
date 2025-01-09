package chap_09;
// 불러오기
import java.lang.Math;
import java.util.Random;
import java.util.ArrayList;

public class JAVAAPI {
    public static void main(String args[]) {
        double r = Math.random(); // 0.0 <= r < 1
        double ab = Math.abs(-9.81); // 9.81
        double greater = Math.max( 3.14, 12.7); // 12.7
        double smaller = Math.min(3.14, 12.7); // 3.14
        
        System.out.println(r);
        System.out.println(ab);
        System.out.println(greater);
        System.out.println(smaller);
        System.out.println("======================================"); 
        Random rand = new Random(); // 객체 생성
        int a = rand.nextInt(10); // 0 <= a < 10
        double b = rand.nextDouble(); // 0.0 <= b < 1.0
        boolean c = rand.nextBoolean(); // true or false
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println("======================================"); 
        ArrayList<String> names = new ArrayList<String>();
        names.add("Kim"); // names -> {"Kim"}
        names.add("Lee"); // names -> {"Kim", "Lee"}
        names.add("Park"); //  names -> {"Kim", "Lee", "Park"}
        System.out.println(names.get(2)); // "Park"
        names.remove(1); // names -> {"Kim", "Park"}
        System.out.println(names.size()); // 2
    }
}