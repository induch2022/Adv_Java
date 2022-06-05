package src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

public class ShortestLongestDist {
	
	
//calculate the shortest and the longest route from DFW to CLT
//Origin | Destination | Time in hrs
//DFW | ATL | 4
//ATL | CLT | 1
//DFW | PHX | 2
//PHX | CLT | 6
//DFW | OKC | 1
//OKC | CLT | 5

	
	

	public static void main (String []args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
				map.put("PHX-CLT", 6);
				map.put("ATL-CLT", 1);
				map.put("DFW-PHX", 2);
				map.put("DFW-ATL", 4);				
			  map.put("DFW-OKC", 1); 
			  map.put("OKC-CLT", 5);
			  map.put("DFW-FAT", 1);
			  map.put("FAT-CLT", 2); 
			  map.put("DFW-OGG", 10);
			  map.put("OGG-CLT", 20);
			  map.put("DFW-OGG", 100);
			  map.put("OGG-CLT", 2000); 
			 
			 	
		
		
		int len = map.size();
		ArrayList<Integer> distanceArr = new ArrayList<Integer>();
		HashMap<String, Integer> routsAndDistance = new HashMap<String, Integer>();
		Iterator<String> itr = (Iterator)map.keySet().iterator();
		
		String str, tempStr="" ;
		int temp =0;
		
		for(int i=0; i<len; i++) {
			str = (String)itr.next();
			temp =0;
			String[] stringarray = str.split("-");
			
			try {
			System.out.println(str+"    "+stringarray[0]+"   "+stringarray[1]);
			}catch(Exception e){
				System.out.println("in catch  "+e);
			}
			
			if(str.startsWith("DFW")) { 
				 
				  tempStr = str.substring(4);
				  temp = (Integer)map.get(str);//we are adding 4 from here map.put("DFW-ATL", 4);
				  if(routsAndDistance.get(tempStr)!=null)
						routsAndDistance.put(tempStr, (routsAndDistance.get(tempStr)+temp));
					else
						routsAndDistance.put(tempStr, temp);
			  }
			  
			  if(str.endsWith("CLT")) {
				  tempStr = str.substring(0,3);
				  temp = (Integer)map.get(str);
				  
				  if(routsAndDistance.get(tempStr)!=null)
						routsAndDistance.put(tempStr, (routsAndDistance.get(tempStr)+temp));
					else
						routsAndDistance.put(tempStr, temp);
			  }

		
		}
		
		
		 itr = (Iterator<String>)routsAndDistance.keySet().iterator();

		while(itr.hasNext()) {
			tempStr = (String)itr.next();
			if(tempStr != null)
				distanceArr.add((Integer)routsAndDistance.get(tempStr));
			 
		 }
		Collections.sort(distanceArr);
		
		/*
		 * System.out.println("Shortest Distance from DFW to CLt "+distanceArr);
		 * System.out.println("Shortest Distance from DFW to CLt "+distanceArr.get(0));
		 * System.out.println("longest Distance from DFW to CLt "+distanceArr.get(distanceArr.size()-1))
		 * ;
		 */
		   for(Entry<String, Integer> entry: routsAndDistance.entrySet()) {

		      // if give value is equal to value from entry
		      // print the corresponding key
		      if(entry.getValue() == distanceArr.get(0)) {
		        System.out.println("Shortest Distance from DFW to CLt  "+ entry.getKey() +" the distance is "+distanceArr.get(0));

		      }
		      if(entry.getValue() == distanceArr.get(distanceArr.size()-1)) {
			        System.out.println("Longest Distance from DFW to CLt  "+ entry.getKey() +" the distance is "+distanceArr.get(distanceArr.size()-1));

		      }
		  }
		
	}
	
}
