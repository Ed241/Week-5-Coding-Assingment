package Week5Assignment;

public class AsteriskLogger implements Logger {

	@Override
	public void Log(String s) {
		System.out.println("***" + s + "***");
		
	}

	@Override
	public void Error(String s) {
		System.out.println("******************" + "\n"+ "***" + "Error: " +s + "***" + "\n" + "******************" );
		
		
	}

}
