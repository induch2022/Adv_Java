package src;
public class ReverseString {


//java program to reverse a word


	public static void main (String[] args) {
	
		String nstr="";
		String str= "cherukuri";
		char ch;
	
	System.out.print("Original word: ");
	System.out.println(str); //Example word
	
	for (int i=0; i<str.length(); i++)
	{
		ch= str.charAt(i); //extracts each character
		nstr= ch+nstr; //adds each character in front of the existing string
	}
	System.out.println("Reversed word:\n\n "+ nstr.toUpperCase());
	}
}


