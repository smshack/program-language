package lecture5;


//래퍼런스의 이해
/*배열은 배열을 구성하고 있는 데이터들의 주소값을 가지고 있음
이 때 주소 값을 레퍼런스라고 함
만약 동일한 주소 값을 가지고 있다면 같은 데이터를 가리키도 있는 것임*/
public class MultiArr {
public static void main(String[] args) {
	int[][] gugudan = new int[10][10];   // 2차원 배열 선언
	
	for (int i = 2; i < gugudan.length; i++) {
		System.out.println(i + "단");
		
		for (int j = 1; j < gugudan[i].length; j++) {         // 배열  i와 j 생성하고
			gugudan[i][j] = i * j;                                       // gugudan에 할당
			                                                              
		System.out.print(i + "x" + j + "=" + gugudan[i][j] + "/t");
			                          // 배열 출력
			if (j == 9 ) {
				System.out.println("\n");     // i x j(9)가 되면 줄 건너뛰기
			}
		}
	}
}
}
