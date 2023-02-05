package interfacePractice;

public class AsteriskLogger implements Logger {

	@Override
	public void Log(String log) {
		System.out.println("***" + log + "***");
		
	}

	@Override
	public void Error(String error) {
		System.out.println("*****************");
		System.out.println("***Error:" + error + "***");
		System.out.println("*****************");
		
	}

}
