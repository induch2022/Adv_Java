package src;

import java.util.HashMap;

public class StringFunctionsTest {
	


	public  static int countChar(String str) {
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		String ch;
		
		
		for(int i=0;i<str.length();i++) {
			ch = str.charAt(i) +"";
			
			if(map.containsKey(ch)) {
				System.out.println(str.charAt(i) +"     "+map.containsKey(ch)+"  map.get(str.charAt(i)+\"\")  "+ map.get(ch));
				map.put(ch,  map.get(ch)+1);
			
			}
			else 
				map.put(ch,  1);
				
		}
		
		System.out.println(""+map.toString());
		return 0;
	}
	
	public static void main(String[] args) {
		countChar("daaallaass");
		
		
	}
}
