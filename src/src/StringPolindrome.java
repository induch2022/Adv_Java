package src;

public class StringPolindrome {

	static boolean isPalindrome(String str){
		int i = 0, j = str.length() - 1;

		while (i < j) {

			
			System.out.println("str.charAt("+i+")  "+str.charAt(i)+"    str.charAt("+j+")"+str.charAt(j));
			if (str.charAt(i) != str.charAt(j))
				return false;

			i++;
			j--;
		}

		return true;
	}


	public static void main(String[] args)
	{
		String str = "abdba";

		str = str.toLowerCase();

		if (isPalindrome(str))
			System.out.print("Yes");
		else
			System.out.print("No");
		
		
        String str1 = "tattarrattat";
        
        str1 = str1.toLowerCase();
        //reverse the string
        String rev = (new StringBuilder(str)).reverse().toString();
         
        //check if str is palindrome
        if(str.equals(rev)) {
            System.out.println(str+" is Palindrome.");
        } else {
            System.out.println(str+" is not Palindrome.");
        }
	}
}

/**
 * Java Program - Check if String is Palindrome
 */
 

