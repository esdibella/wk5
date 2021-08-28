package week5Homework;

public class AsteriskLogger implements Logger {

	@Override
	public void Log(String log) {
		System.out.println("***" + log + "***");
	}

	@Override
	public void Error(String error) {
		String errorString = "***Error: " + error + "***";
		String astericks = "";
		for (int i = 0; i < errorString.length(); i++) {
			astericks += "*";
		}
		System.out.println(astericks);
		System.out.println(errorString);
		System.out.println(astericks);

	}

}
