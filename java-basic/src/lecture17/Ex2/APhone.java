package lecture17.Ex2;

public class APhone implements IFunction{
	//이 폰의 인터페이스에서 정해준 기능을 정의해줘
	@Override
	public void callSenderReceive() {
		// TODO Auto-generated method stub
		System.out.println("가능 합니다.");
	}

	@Override
	public void canLte() {
		// TODO Auto-generated method stub
		System.out.println("불가능 합니다. 3G 입니다.");
	}

	@Override
	public void tvRemoteController() {
		// TODO Auto-generated method stub
		System.out.println("미탑재 되어 있습니다.");
	}

}