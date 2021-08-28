package week5Homework;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AsteriskLogger aLogger = new AsteriskLogger();
		SpacedLogger sLogger = new SpacedLogger();
		
		aLogger.Log("Happy");
		aLogger.Error("Sad");
		
		sLogger.Log("Happy");
		sLogger.Error("Sad");

		
		
	}

}
