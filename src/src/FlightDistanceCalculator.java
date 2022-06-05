package src;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.ConcurrentModificationException;

public class FlightDistanceCalculator {
	public static void main(String []args) throws ConcurrentModificationException  {
		
		
		//this is Given Information
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
//		map.put("DFW-PHX", 2);   /* PHX 8   OKC  6   ATL 5    FAT 3   OGG  30 **/
		map.put("PHX-CLT", 6);

		map.put("DFW-OKC", 1);  
		map.put("OKC-CLT", 5);
		
		map.put("DFW-ATL", 4);
		map.put("ATL-CLT", 1);
		
		map.put("DFW-FAT", 10);
		map.put("FAT-CLT", 2); 
		
		map.put("DFW-OGG", 10);
		map.put("OGG-CLT", 20);

		map.put("DFW-tdd", 22);
		map.put("tdd-CLT", 22);


		map.put("DFW-sws", 1);
//		map.put("sws-CLT", 1);
		
		map.put("DFW-GTT", 40);
		map.put("GTT-CLT", 3);
		
		map.put("DFW-AAA", 4000);
		//map.put("AAA-CLT", 4000);		
		
		Iterator<String> itr = (Iterator<String>)map.keySet().iterator();
		
		
		//we are creating instance of OriginDestinationInfo to set the connecting port and timetaken from origin to destination
		
		OriginDestinationInfo originDestInfo = new OriginDestinationInfo("DFW", "CLT");
		List<OriginDestinationInfo> originDestInfoList = new ArrayList<OriginDestinationInfo>();
		
		
		String str ;
		int temp =0;
		String ConnectingPort ="";
		String[] stringarray ;
		OriginDestinationInfo originDestInfoTemp;
		String originPlace = "DFW";
		String destPlace = "CLT";
		
		Iterator originDestInfoIterator = originDestInfoList.iterator();
		for(int i=0; i<map.size(); i++) {
			
			str = (String)itr.next();
	
			stringarray = str.split("-");
			temp =0;			
			if(stringarray == null) 
				break;
			
			originDestInfo = originDestInfoTemp = new OriginDestinationInfo();
		
			//originDestInfoIterator = originDestInfoList.iterator();

			 if(stringarray[0].equals(originPlace)) 						 
				 ConnectingPort = stringarray[1];//we will get connecting port like DFW-FAT we are storing FAT in ConnectingPort
			 else if(stringarray[1].equals(destPlace)) 						 
				 ConnectingPort = stringarray[0];
		 
			 
			 
			 
			 temp = (Integer)map.get(str);//we will get the hrs taken from connectingPort
			 originDestInfoIterator = originDestInfoList.iterator();
			while(originDestInfoIterator.hasNext()) {
				originDestInfoTemp = (OriginDestinationInfo)originDestInfoIterator.next();
				
				if(((String)originDestInfoTemp.getConnectingPort()).equals	(ConnectingPort)) 
					originDestInfo = originDestInfoTemp;
			}
			
			 if(stringarray[0].equals(originPlace))						 
				 originDestInfo.setOriginSet(true);
			 
			 else if(stringarray[1].equals(destPlace)) 
				 originDestInfo.setDestinationSet(true);


			 setConnectingPortAndTimeTaken(originDestInfoList, originDestInfo, ConnectingPort, temp);
		}
						
				  if(originDestInfoList != null)
					  getSortedList(originDestInfoList);
				}
				
		
			
	


	
	private static void setConnectingPortAndTimeTaken(List<OriginDestinationInfo> originDestInfoList, OriginDestinationInfo originDestInfo, String connectingPort,
			int temp) {
		// TODO Auto-generated method stub
		 //originDestInfo.setDestinationSet(true);
		  if(originDestInfo.getConnectingPort() != null) {
			  originDestInfo.setConnectingPort(connectingPort);
			  originDestInfo.setTotalTimeTaken(originDestInfo.getTotalTimeTaken() + temp);
		  }
		  else {
				originDestInfo.setConnectingPort(connectingPort);
				originDestInfo.setTotalTimeTaken( temp );
				 originDestInfoList.add(originDestInfo);
		}
	
	}


	public static void getSortedList(List<OriginDestinationInfo> originDestInfoList) {
		
//		 Comparator<OriginDestinationInfo> timeTakenComparatorLEx =  
//	                (path1, path2) -> ((Integer)path1.getTotalTimeTaken()).compareTo(path2.getTotalTimeTaken());
		 Comparator<OriginDestinationInfo> timeTakenComparatorLEx =  Comparator
        .comparing(OriginDestinationInfo::getTotalTimeTaken);
	                
	     // sorting on multiple fields (3-level) using Lambda expression
	     List<OriginDestinationInfo> sortedPathList = originDestInfoList
	             .stream()
	             .sorted(timeTakenComparatorLEx) // 1st time taken to trip 
	             .collect(Collectors.toList()); // collect sorted OriginDestinationInfo to new list
	     
	     sortedPathList = (List<OriginDestinationInfo>) originDestInfoList.stream().filter(OriginDestinationInfo::isOriginSet).filter(OriginDestinationInfo::isDestinationSet).sorted(timeTakenComparatorLEx).collect(Collectors.toList());
	     Iterator<OriginDestinationInfo> it = (Iterator<OriginDestinationInfo>)sortedPathList.iterator();
	     
	     OriginDestinationInfo distanceForPath =  new OriginDestinationInfo();
	     for(int i=0;it.hasNext();i++) {
	    	 
	    	 it.next();
	    	 distanceForPath = sortedPathList.get(i);
	    	 if(i ==0) {
	    	 
	    	 System.out.println("Shortest path   "+distanceForPath.getConnectingPort()+"     "+distanceForPath.getTotalTimeTaken());
	    	 }else if(i==sortedPathList.size()-1) {
	    		 
		    	 System.out.println("Longest path   "+distanceForPath.getConnectingPort()+"     "+distanceForPath.getTotalTimeTaken());
		    	 
	    	 }
	 	    
	     }
	    	
	     // print new list to console using forEach()
//	     sortedPathList.stream().forEach(path -> System.out.println(path.getConnectingPort()+"     "+path.getTotalTimeTaken()+"  "+path.getDestPlace()+"   "+path.getOriginPlace()+"  origin set  "+ path.isOriginSet()+"  dest set  "+path.isDestinationSet()));
	     	 
		}
}
