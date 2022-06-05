package src;

import java.io.InputStream;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CountOfWords {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" enetre the sentence  ");
//		String inputString = (String)sc.nextLine();
		
		String inputString = "@$#$asd afga :{+_)jkk    >?{#$%ss     qwe";
		inputString = "";//"A PT CR M0RT BOUSG SABN NTE TR/GB/(G) = RAND(MIN(XXX, YY + ABC))";
		
		
		sc.close();
		String[] strArray = null;//new String[0];
		if(!inputString.equals(""))
			strArray = (inputString.split(" "));
			
		
		String[] words = inputString.split("\\s+");

		
		for(int i=0; strArray != null && i<strArray.length;i++) 
			System.out.println("strArray["+i+"] "+ strArray[i]);
		
		
		
		for(int j=0;j<words.length; j++) {
			//words[j] = words[j].replaceAll("[^\\w]","");
			//System.out.println(" words["+j+"] "+"  "+words[j]);
		}
		
//		 System.out.println(getWords("A PT CR M0RT BOUSG SABN NTE TR/GB/(G) = RAND(MIN(XXX, YY + ABC))"));
	
//		System.out.println(getWords("@$#$asd afga :{+_)jkk    >?{#$%ss     qwe"));
		duplicateWords("sdsdddd");
		
		countRepeatedWords("asd fgh juy asd fgh asd asd juy");
		
	}

	
	
	public static List<String> getWords(String text) {
		
	    List<String> words = new ArrayList<String>();

	    BreakIterator brIterator = BreakIterator.getWordInstance();
	    brIterator.setText(text);
	    
	    int lastIndex = brIterator.first();
	    while (BreakIterator.DONE != lastIndex) {
	    	
	        int firstIndex = lastIndex;
	        lastIndex = brIterator.next();
	        if (lastIndex != BreakIterator.DONE && Character.isLetterOrDigit(text.charAt(firstIndex))) {
	            words.add(text.substring(firstIndex, lastIndex));
	        }
	    }

	    return words;
	}
	
	public static void duplicateWords(String sentence) {
		Set<String> hset = new HashSet<String>();
		hset.add("aaa");
		hset.add("ccc");
		hset.add("eee");
		hset.add("sss");
		hset.add("ffff");
		// System.out.println("hset   "+hset);
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		
		HashMap<Integer, List<String>> hmap = new HashMap<Integer, List<String>>();
		
		Iterator it = hset.iterator();
		
		for(int i=0;it.hasNext();i++) {
			map.put(i,(it.next()+""));
		}
		System.out.println(map);
		
	}

	
	public static void countRepeatedWords(String input){

		//input = "Welcome to Java Session Session Session";  //Input String 
//	      String[] words=input.split(" ");  //Split the word from String
	      String[] words=input.split("\\s");  //Split the word from String
	      int wrc=1;    //Variable for getting Repeated word count
	      
	      for(int i=0;i<words.length;i++) //Outer loop for Comparison       
	      {
	    	  
	    	  
	         for(int j=i+1;j<words.length;j++) //Inner loop for Comparison
		         if(words[i].equals(words[j])) {  //Checking for both strings are equal
		               wrc=wrc+1;    //if equal increment the count
		               words[j]="0"; //Replace repeated words by zero
	             }
	         
	         //if(words[i]!="0")
	        	 System.out.println(words[i]+"--"+wrc); //Printing the word along with count
	         wrc=1;
	         
	         
	      }

	
}
	
}
