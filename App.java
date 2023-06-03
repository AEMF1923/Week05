package week05;
/*
 * This i need a little bit of help in. Is line 10 like a called back to the function/class that takes two strings...
 * not sure how to read the syntax?
 * 
 */
public class App {

	public static void main(String[] args) {
		
		AsteriskLogger asteriskLogger = new AsteriskLogger();
		System.out.println("Asterisk Logger Check it ");
		asteriskLogger.log("Scout");
		asteriskLogger.error("Pickles");
		
		SpacedLogger spacedLogger = new SpacedLogger();
		System.out.println("\nSpaced Logger Check it ");
		spacedLogger.log("Scout");
		spacedLogger.error("Pickles");
	}

}
