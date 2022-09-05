package lecture25;

public class ThrowsExClass {
	
	public ThrowsExClass() {
		actionC();
	}
	
	private void actionA() throws Exception {
		System.out.println("actionA");
		//여기까지는 제대로 실행됨
		int[] iArr = {1, 2, 3, 4};
		System.out.println(iArr[5]);//예외가 발생해서 actionB로 던짐
		
		System.out.println("actionAA");
	}
	
	private void actionB() {
		System.out.println("actionB");
		
		try {
			actionA();	//발생한 예외를 catch에서 처리
		} catch (Exception e) {
			System.out.println("예외는 여기서 처리 할께요.^^");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("actionBB");
	}
	
	private void actionC() {
		System.out.println("actionC");
		actionB();
		System.out.println("actionCC");
	}
}
