package lecture4;

public class IfEx {
	public static void main(String[] args) {
		int price =5000;
		
		if(price >=9000) {
			System.out.println("물가 엄청 비싸다");
		}else if(price >=7000) {
			System.out.println("물가 조금 비싸다");
		}else if(price >=5000) {
			System.out.println("물가 적당하다");
		}else {
			System.out.println("물가가 싸다");
		}
	}
}
