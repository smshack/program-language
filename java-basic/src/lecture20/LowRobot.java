package lecture20;

import lecture20.InterfaceRobot.FlyNo;
import lecture20.InterfaceRobot.KnifeNo;
import lecture20.InterfaceRobot.MisailNo;

public class LowRobot extends Robot{
	public LowRobot() {
		// TODO Auto-generated constructor stub
		fly = new FlyNo();
		misail = new MisailNo();
		knife = new KnifeNo();
	}

	@Override
	public void shape() {
		// TODO Auto-generated method stub
		System.out.println("LowRobot 로봇입니다");
	}
	


}
