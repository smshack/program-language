package lecture17.Ex3;

public class MainClass {
	
public static void main(String[] args) {
		
		Actress actress = new Actress();
		actress.canCatchCriminal();
		actress.canSearch();
		actress.outFire();
		actress.saveMan();
		actress.makePizza();
		actress.makeSpaghetti();
		System.out.println();
		
		PoliceMan actressP = new Actress();
		actressP.canCatchCriminal();
		actressP.canSearch();
		
		actressP.outFire();
		System.out.println();
		
		/*
		 * actressP.saveMan(); actressP.makePizza(); actressP.makeSpaghetti();
		 */
		
		Firefighter actressF = new Actress();
		actressF.outFire();
		actressF.saveMan();
		
		/*
		 * actressF.canCatchCriminal(); actressF.canSearch(); actressF.makePizza();
		 * actressF.makeSpaghetti();

		 */
		System.out.println();
		
	}
	
}