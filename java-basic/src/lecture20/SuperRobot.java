package lecture20;

import lecture20.InterfaceRobot.FlyNo;
import lecture20.InterfaceRobot.FlyYes;
import lecture20.InterfaceRobot.KnifeLazer;
import lecture20.InterfaceRobot.MisailYes;

public class SuperRobot extends Robot{
	

	
	public SuperRobot() {
		// TODO Auto-generated constructor stub
		fly = new FlyYes();
		misail = new MisailYes();
		knife = new KnifeLazer();
	}

	@Override
	public void shape() {
		// TODO Auto-generated method stub
		System.out.println("SuperRobot 로봇입니다");
	}



}
