package lecture4;

public class ForEx2 {
public static void main(String[] args) {
	int j =11;
	int sum = 0;
	for (int i = 1; i < j; i++) {
		if(i%2==0)	//짝수 들의 합을 구하는 식
		sum =sum+i;
	}
	System.out.println(sum);
}
}
