package lecture5;

public class ArrayEx {
public static void main(String[] args) {
	int [] iArr = {10,20,30,40,50};
	for (int i = 0; i < iArr.length; i++) {
		System.out.printf("iArr[%d] = %d\n",i,iArr[i]);
	}
	System.out.println();
	int [] jArr = new int[3];
	
	
	for (int i = 0; i < jArr.length; i++) {
		System.out.printf("jArr[%d] = %d\n",i,jArr[i]);
	}
}
}
