package lecture15;

public class Child2 extends LunchMenu {

	
	public Child2(int rice, int bulgogi, int banana, int milk, int almond) {
		super(rice, bulgogi, banana, milk, almond);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int calculating() {
		// TODO Auto-generated method stub
		return rice+bulgogi+milk;
	}
}
