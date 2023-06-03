package week05;

public class SpacedLogger implements Logger{


	@Override
	public void log(String string1) {
	
		String addspaces = ""; //this means an empty string
		for(int i = 0; i <string1.length(); i++) {
			addspaces += string1.charAt(i) + " "; //just a reminder to actually hit the space bar for a space 
			
		}
		
		System.out.println(addspaces);
	}
//you can recylce what you did above and place is below here should be fine 
	@Override
	public void error(String string2) {
		String addspaces2 = ""; 
		for(int i = 0; i <string2.length(); i++) {
			addspaces2 += string2.charAt(i) + " "; 
		}
		System.out.println("ERROR: " + addspaces2);
	}
}
