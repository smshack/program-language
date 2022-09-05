package lecture19;

public class SingletonClass {
	//자신을 생성해서 다시 할당을 한다
	private static SingletonClass SINGLETON_CLASS_INSTANCE = new SingletonClass();
	public int i = 10;
	
	private SingletonClass() {
		// TODO Auto-generated constructor stub
	}
	
	public static SingletonClass getSingletonClass() {
		
		if(SINGLETON_CLASS_INSTANCE == null) {
			SINGLETON_CLASS_INSTANCE = new SingletonClass();
		}
		
		return SINGLETON_CLASS_INSTANCE;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
	
}
