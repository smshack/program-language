package lecture6;

public class Procedure_oriented3 {
public static void main(String[] args) {
	Procedure_oriented3 gu = new Procedure_oriented3();
	
	for (int i = 1; i < 10; i++) {
		gu.gugudan(i);
		System.out.println();
	}
}

public void gugudan(int i) {
	for(int j=1;j<10;j++) {
		System.out.printf("%d * %d = %d \t", i,j,i*j);
	}
}
}
