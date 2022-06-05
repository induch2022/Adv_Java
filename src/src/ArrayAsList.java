package src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ArrayAsList {


	   public static void main(String args[]) throws IOException {
	      BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
	      System.out.println("How many elements you want to add to the array: ");
	      int n = Integer.parseInt(in.readLine());
	      String[] name = new String[n];
	      
	      for(int i = 0; i < n; i++) {
	         name[i] = in.readLine();
	      }
	      List<String> list = Arrays.asList(name); 
	      System.out.println();
	      
	    
	      list.forEach( (li) -> { li=li+"aaa"; System.out.println(li); } );
	      
	      
	      
	      
	      Consumer<String> method = (nli) -> { System.out.println(nli); };
	      list.forEach( method );
	      
	   }
}