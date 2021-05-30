package GenericTest;

public class Single {
	
	private Single(){}

	private static Single instance = new Single();

	public static Single getInstance() {
		return instance;
	}

	
	public void SayHello() {
		System.out.println("안녕");
	}
}
