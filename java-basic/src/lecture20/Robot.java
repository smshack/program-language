package lecture20;

import lecture20.InterfaceRobot.IFly;
import lecture20.InterfaceRobot.IKnife;
import lecture20.InterfaceRobot.IMisail;

public abstract class Robot {
	//----------------------------------------------------------
		//인터페이스를 사용하면 이렇게 부품화 하여 사용 가능	
			IFly fly;
			//IFly fly = new FlyYes();
			IMisail misail;
			IKnife knife;
			
			public void setFly(IFly fly) {
				this.fly = fly;
			}
			
			public void setMisail(IMisail misail) {
				this.misail = misail;
			}
			public void setKnife(IKnife knife) {
				this.knife = knife;
			}
	
	public Robot() {
		// TODO Auto-generated constructor stub
	}
	// 확실히 공통적으로 사용하는 것은 상속으로 구현
	public void actionWalk() {
		// TODO Auto-generated method stub
		System.out.println("걸을 수 있습니다");
	}
	
	public void actionRun() {
		// TODO Auto-generated method stub
		System.out.println("달릴수 있습니다");
	}
	
	public abstract void shape();
	
	
	public void actionKnife() {
		// TODO Auto-generated method stub
		this.knife.knife();
	}
	
	public void actionMisail() {
		// TODO Auto-generated method stub
		this.misail.misail();
	}
	
	public void actionFly() {
		this.fly.fly();
	}

}
