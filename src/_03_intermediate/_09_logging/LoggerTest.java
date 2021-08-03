package _03_intermediate._09_logging;

public class LoggerTest {
	public static void main(String[] args) {

		MyLogger myLogger = MyLogger.getLogger();
		
		myLogger.log("log test");
	}
}
