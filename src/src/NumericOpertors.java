package src;

public class NumericOpertors {
	
	
	
	public class ValueOfDemo {
	    public static void main(String[] args) {

	        
	    	String[] args1 = { "4.5f","87.2f" };
	    	// this pro,gram requires two 
	        // arguments on the command line 
	        if (args1.length == 2) {
	            // convert strings to numbers
	            float a = (Float.valueOf(args1[0])).floatValue(); 
	            float b = (Float.valueOf(args1[1])).floatValue();

	            // do some arithmetic
	            System.out.println("a + b = " +
	                               (a + b));
	            System.out.println("a - b = " +
	                               (a - b));
	            System.out.println("a * b = " +
	                               (a * b));
	            System.out.println("a / b = " +
	                               (a / b));
	            System.out.println("a % b = " +
	                               (a % b));
	        } else {
	            System.out.println("This program " +
	                "requires two command-line arguments.");
	        }
	    }
	}

}
