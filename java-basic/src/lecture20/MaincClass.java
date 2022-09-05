package lecture20;

import lecture20.InterfaceRobot.FlyYes;
import lecture20.InterfaceRobot.KnifeLazer;
import lecture20.InterfaceRobot.MisailYes;

public class MaincClass {
	public static void main(String[] args) {
		Robot superRobot = new SuperRobot();
		superRobot.shape();
		
		
		/*
		 * superRobot.setFly(new FlyYes()); superRobot.setKnife(new KnifeLazer());
		 * superRobot.setMisail(new MisailYes());
		 */
		
		superRobot.actionFly();
		superRobot.actionKnife();
		superRobot.actionMisail();
		
		
		superRobot.actionRun();
		superRobot.actionWalk();
	}
}
