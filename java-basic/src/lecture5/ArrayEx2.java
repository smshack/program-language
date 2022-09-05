package lecture5;
//래퍼런스의 이해
/*배열은 배열을 구성하고 있는 데이터들의 주소값을 가지고 있음
이 때 주소 값을 레퍼런스라고 함
만약 동일한 주소 값을 가지고 있다면 같은 데이터를 가리키도 있는 것임*/
public class ArrayEx2 {
public static void main(String[] args) {
	int[] iArr1= {10,20,30,40,50};
	int[] iArr2 =iArr1;
	
	for (int i = 0; i < iArr2.length; i++) {
		System.out.printf("iArr1[%d] = %d\n",i,iArr1[i]);
		System.out.printf("iArr2[%d] = %d\n",i,iArr2[i]);
	}
	System.out.println();
	iArr2[0]=100;
	iArr2[1]=200;
	iArr2[2]=300;
	iArr2[3]=400;
	iArr2[4]=500;
	
	for (int i = 0; i < iArr2.length; i++) {
		System.out.printf("iArr1[%d] = %d\n",i,iArr1[i]);
		System.out.printf("iArr2[%d] = %d\n",i,iArr2[i]);
	}
}
}
