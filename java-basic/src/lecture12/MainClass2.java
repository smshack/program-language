package lecture12;

public class MainClass2 {
	public static void main(String[] args) {
		Pmenu pm = new Pmenu();
		pm.makeChungCukJang();
		pm.makeDoenJangGuk();
		pm.makeGalbiJjim();
		pm.makeSoybean();
		System.out.println();
		
		
		Cmenu cm = new Cmenu();
		cm.makeBeefChungCukJang();
		cm.makeChungCukJang();
		cm.makeDoenJangGuk();
		cm.makeGalbiJjim();
		cm.makeHotDoenJanGuk();
		cm.makeKongNaMool();
		cm.makeSoybean();
		
		System.out.println();
		
		Pmenu pm2 = new Cmenu();
	}
}
