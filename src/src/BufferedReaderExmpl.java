package src;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class BufferedReaderExmpl{ 

 public static void main(String[] args) throws IOException {
  BufferedReader objReader = null;
  try {
   String strCurrentLine;

   objReader = new BufferedReader(new FileReader("I:\\new.txt"));

   while ((objReader.readLine()) != null) {
	   strCurrentLine = objReader.readLine();
    //System.out.println(strCurrentLine);
   }

  } catch (IOException e) {

   e.printStackTrace();

  } finally {

   try {
    if (objReader != null)
     objReader.close();
   } catch (IOException ex) {
    ex.printStackTrace();
   }
  }
  
  BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
  int i=0;
  String nm = "";
  HashMap<Integer, String> map = new HashMap<Integer, String>();
  
	for(int j=0; j<5;j++) {
	  System.out.println("enter id");
	  try {
		i = Integer.parseInt(br1.readLine());
		
	
		  System.out.println("enter name");
		  nm = br1.readLine();
		  map.put(i, nm);
	  
	  } catch (NumberFormatException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	  
  }
	
	System.out.println(map);
 }
}

