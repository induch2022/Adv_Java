package src;

public class StringManipulation {

	
	
	public static void main(String []args) {
		String s = "1b45d3db1";
		String temp ="";
		for (int i=s.length()-1; i>=0; i--)
			temp = temp+s.charAt(i);

		
	
		if(temp.equals(s)) 
			System.out.println("  polindrome");
		else
			System.out.println(" not  polindrome");
		
		
		//concat
		 String str = "abcd ";
		String s2 = "  efgh  ";
		 String output = str.concat(s2);
		 System.out.println("output  "+ output);
		 
		 //indexOf
		 str = "Learn Share Learn";
		 int indx = str.indexOf("Share"); // returns 6
		 System.out.println("indx  "+ indx);
		 
		 //lastIndexOf
		 int lastindx = str.lastIndexOf("a"); 
		 System.out.println("lastindx  "+ lastindx);
		 
		 Boolean out= "Geeks".equalsIgnoreCase("GEEKS"); // returns true
		 Boolean out1 = "Geeks".equalsIgnoreCase("geeks"); // returns true
		 
		 System.out.println("out  "+ out);
		 System.out.println("out1  "+ out1);
		 
		 
		 str= "GeeksforGeeks";
	        // or String s= new String ("GeeksforGeeks");
	  
	        // Returns the number of characters in the String.
	        System.out.println("String length = " + str.length());
	  
	        // Returns the character at ith index.
	        System.out.println("Character at 3rd position = "
	                           + str.charAt(3));
	  
	        // Return the substring from the ith  index character
	        // to end of string
	        System.out.println("Substring " + str.substring(3));
	  
	        // Returns the substring from i to j-1 index.
	        System.out.println("Substring  = " + str.substring(2,5));
	        
	     // Replacing characters
	        String str1 = "feeksforfeeks";
	        System.out.println("Original String " + str1);
	        String str2 = "feeksforfeeks".replace('f' ,'g') ;
	        System.out.println("Replaced f with g -> " + str2);
	        
	        double d = 858.48;
	        String st = Double.toString(d);
	        
	        int dot = st.indexOf('.');
	        
	        System.out.println(dot + " digits " +
	            "before decimal point.");
	        System.out.println( (s.length() - dot - 1) + " digits after decimal point.");
	        
	        
			/*
			 * String[] ss = s.split(".",11); System.out.println("  length  "+ss.length);
			 * for(int i=0; i<ss.length;i++) { System.out.println("  ss["+i+"] "+ss[i]);
			 * 
			 * }
			 */
	     //System.out.println("  s[0]  "+ss[0]+"   s[1]  "+ss[1]);
	     
	     String str11 = "geekss@for@geekss";
	     String[] arrOfStr = str11.split("@", 3);

	     for (String a : arrOfStr)
	         System.out.println(a);
	    	
	}
}
