package lecture25;


public class MainClass2 {
	public static void main(String[] args) {
		
		int i =10;
		int j=0;
		
		System.out.println(i*j);
		try {
			System.out.println(i/j);
		}catch(Exception e) {
		System.out.println("****예외 발생*****\n"+e.getMessage()+"\n********************");
			e.printStackTrace();
		}
		System.out.println(i+j);
		System.out.println(i-j);
		
	}
}
