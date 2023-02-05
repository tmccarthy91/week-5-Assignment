package interfacePractice;

public class App {

	public static void main(String[] args) {
		
		Logger logger = new AsteriskLogger();
		logger.Log("Hello");
		logger.Error("Hello");
		
		Logger loggerTwo = new SpacedLogger();
		loggerTwo.Log("Hello");
		System.out.println("");
		loggerTwo.Error("Hello");
	}

}
