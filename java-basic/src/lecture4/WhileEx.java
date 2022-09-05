package lecture4;

public class WhileEx {
public static void main(String[] args) {
	int i =0;
	int sum =0;
	while(i<=100) {
		sum+=i;
		i+=3;
		
	}
	System.out.printf("3의 배수의 총 합은 %d",sum);
}
}
