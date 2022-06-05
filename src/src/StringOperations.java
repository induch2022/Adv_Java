package src;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

public class StringOperations {
public static void main(String[] args) {

//characterCount("USAhas50states");
// characterCount("10,5,6,5");

//arrayElementCount(new int[] { 4, 5, 4, 5, 4, 6 });
// arrayElementCount(new int[]{12, 9, 12, 9, 10, 9, 10, 11});

// arrayElementCount(new int[]{891, 187, 891, 187, 891, 476, 555, 741});


//System.out.println("wordsInString    "+wordsInString("aa bb cc dd ee aa  ff hh  aa gg ll mm ss dd"));
System.out.println("wordsInString    "+wordsInString("aa    aa   aa  "));
System.out.println("removeSpecialChars   "+removeSpecialChars("@drrr$#90&^GTFCVBHH^%43^&**hbb"));

}
// Pseudo code/Logic for Count occurrences of Character in String in Java

static void characterCount(String inputString) {
// Creating a HashMap, key :Character value : occurrences as Integer

// HashMap<Character,Integer>  count = new HashMap<Character,Integer>();
// (The HashMapclass is roughly equivalent to Hashtable, except that it isunsynchronized and permits nulls.)
HashMap<Character, Integer> eachCharCountMap = new HashMap<Character, Integer>();

// Converting inputString to char array

char[] charArray = inputString.toCharArray();

// traversal of each Character of charArray

for (char c : charArray) {
if (eachCharCountMap.containsKey(c)) {
// If char is present in eachCharCountMap, increment count by 1

eachCharCountMap.put(c, eachCharCountMap.get(c) + 1); // hasmap.get -- we can get value or key by
// passing value or key
} else {
// If char is not present in eachCharCountMap,
// Putting this char to eachCharCountMap with 1 as it's initial value

eachCharCountMap.put(c, 1);
}
}

// Showing the eachCharCountMap

System.out.println("eachCharCountMapis" + eachCharCountMap);

// checking for first non-repeated character
for (char c : charArray) {
if (eachCharCountMap.get(c) == 1) {
System.out.println("First Non-Repeated Character In '" + inputString + "' is '" + c + "'");

break;
}

}
// count duplicates in string

 // Traverse the HashMap, check
        // if the count of the character
        // is greater than 1 then print
        // the character and its frequency
        for (Entry<Character, Integer> entry :
        eachCharCountMap.entrySet()) {
 
            if (entry.getValue() > 1) {
                System.out.println("duplicates are " + entry.getKey()
                                   + " : "
                                   + entry.getValue());
            }
        }
// checking for first repeated character

for (char c : charArray) {
if (eachCharCountMap.get(c) > 1) {
System.out.println("First Repeated Character In '" + inputString + "' is '" + c + "'");

break;
}
}
// last repeated character in string

for (int i = charArray.length - 1; i >= 0; i--) {
if (eachCharCountMap.get(charArray[i]) > 1) {
System.out.println("The Last Repeated Character is :" + charArray[i]);
break;
}
}

}

static void arrayElementCount(int inputArray[]) {
// Creating a HashMap object with elements of inputArray as keys and their count
// as values
HashMap<Integer, Integer> elementCountMap = new HashMap<Integer, Integer>();

// checking every element of the inputArray

for (int i : inputArray) {
if (elementCountMap.containsKey(i)) {
// If element is present in elementCountMap, incrementing it's count by 1

elementCountMap.put(i, elementCountMap.get(i) + 1);
} else {
// If element is not present in elementCountMap,
// adding this element to elementCountMap with 1 as it's value

elementCountMap.put(i, 1);
}
}

System.out.println("Input Array : " + Arrays.toString(inputArray));

System.out.println("Element Count : " + elementCountMap);

// checking for first repeated character

for (int i : inputArray) {
if (elementCountMap.get(i) == 1) {

System.out.println("First Non-Repeated Character is '" + i + "'");

break;

}

}

// checking for first repeated character

for (int i : inputArray) {
if (elementCountMap.get(i) > 1) {

System.out.println("First Repeated Character In '" + i + "'");

break;

}

}
// last repeated character

for (int i = inputArray.length - 1; i > 0; i--) {
if (elementCountMap.get(inputArray[i]) > 1)

{
System.out.println("The Last Repeated Character is :" + inputArray[i]);
break;
}

}
}


public static String removeSpecialChars(String str) {
	
	str = str.replaceAll("[^a-zA-Z0-9]", "");
	
	
	return str;
	
}

public static  int wordsInString(String input) {
	if (input == null || input.isEmpty()) { 
		return 0; 
	}
	String[] words = input.split("\\s+"); 
	return words.length; 


}

}
