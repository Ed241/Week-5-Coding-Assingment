package Week5Assignment;

public class SpacedLogger implements Logger{

	@Override
	public void Log(String s) {
		StringBuilder stringBuilder = new StringBuilder();
		for(int i =0; i < s.length(); i++) {
			stringBuilder.append(s.charAt(i) + " ");
		}
		System.out.println(stringBuilder.toString());
	}

	@Override
	public void Error(String s) {
		StringBuilder stringBuilder = new StringBuilder();
		for(int i = 0; i < s.length(); i++) {
			stringBuilder.append(s.charAt(i) + " ");
		}
		System.out.println("ERROR: " + stringBuilder.toString());
	}

}
