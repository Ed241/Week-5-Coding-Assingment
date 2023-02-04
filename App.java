package Week5Assignment;

public class App {

	public static void main(String[] args) {
		
		AsteriskLogger logger = new AsteriskLogger();
		logger.Log("Hello");
		
		AsteriskLogger logger1 = new AsteriskLogger();
		logger1.Error("Hello");
		
		SpacedLogger sLogger = new SpacedLogger();
		sLogger.Log("Hey");
		
		SpacedLogger s2Logger = new SpacedLogger();
		s2Logger.Error("Hey");
		

	}

}
