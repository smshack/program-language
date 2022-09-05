package lecture5;

import java.util.Scanner;

//래퍼런스의 이해
/*배열은 배열을 구성하고 있는 데이터들의 주소값을 가지고 있음
이 때 주소 값을 레퍼런스라고 함
만약 동일한 주소 값을 가지고 있다면 같은 데이터를 가리키도 있는 것임*/
public class ArrayEx3 {
public static void main(String[] args) {
	String[] iArrName = {"영희","철수","길동","영수","말자"};
	int [] iArr =new int[5];
	int totalHeight =0;
	int maxH =0;
	int maxHIndex =0;
	int minH =0;
	int minHIndex=0;
	
	Scanner scan = new Scanner(System.in);
	for (int i = 0; i < iArrName.length; i++) {
		System.out.print(iArrName[i]+"의 키를 입력: ");
		iArr[i] = scan.nextInt();
		totalHeight +=iArr[i];
	}
	System.out.printf("학생들의 평균 신장은 %d입니다\n",totalHeight/iArrName.length);

	for (int i = 0; i < iArr.length; i++) {
		if(iArr[i]>maxH) {
			maxH =iArr[i];
			maxHIndex =i;
		}
	}
	System.out.printf("가장 큰 학생은 %s 입니다 \n",iArrName[maxHIndex]);
	
	minH=maxH;
	
	for (int i = 0; i < iArr.length; i++) {
		if(iArr[i]<minH) {
			minH =iArr[i];
			minHIndex =i;
		}
	}
	System.out.printf("가장 작은 학생은 %s 입니다 \n",iArrName[minHIndex]);

}
}
