package week5Homework;

public class SpacedLogger implements Logger {

	@Override
	public void Log(String log) {
		
		String s = "";
		for (int i = 0; i < log.length(); i++) {
			s += log.charAt(i) + " ";
		}
		System.out.println(s.trim());

	}

	@Override
	public void Error(String error) {
		String s = "ERROR: ";
		for (int i = 0; i < error.length(); i++) {
			s += error.charAt(i) + " ";
		}
		System.out.println(s.trim());

	}


}
