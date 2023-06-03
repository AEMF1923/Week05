package week05;
/*
 * This is how you talk or create actions for an interface. 
 * Below what you are saying is that this class called asterisklogger takes in two 
 * arguments from an interface called logger. The interface called logger takes two 
 * strings. Below these two string will behave in this way. The first "arguement" that takes 
 * a string is called log and the second one is called error. 
 *
 */
public class AsteriskLogger implements Logger{
	

	@Override
	public void log(String string1) {
		
		System.out.println("***" + string1 + "***");
	}

	@Override
	public void error(String string2) {
		
		System.out.println("****************");
		System.out.println("***" +"Error:" + string2 + "***" );
		System.out.println("****************");
	}
}
