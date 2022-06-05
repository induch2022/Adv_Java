package src;
	import java.util.*; 
public class DescendIterator {  
	 public static void main(String args[]){  
	  
	  LinkedList<String> ll=new LinkedList<String>();  
	           ll.add("123");  
	           ll.add("3453");
	           ll.add("444");
	           ll.add("89854"); 
	           ll.add("12");
	           ll.add("45"); 
	           //Traversing the list of elements in reverse order  
	           Iterator<String> i=ll.descendingIterator();  
	           while(i.hasNext())  
	           {  
	        	   
	               System.out.print("   "  +i.next());  
	           }  
	           System.out.print("  \n\n "  ); 
	           i = ll.iterator();
	           while(i.hasNext())  
	           {  
	        	   
	               System.out.print("   "  +i.next());  
	           } 
	           Collections.sort(ll);
	           System.out.println(" \n  " +ll );  
	           System.out.println("ll.size()-2  "+(ll.size()-2)+" \nsecond max "+ll.get(ll.size()-2));
	 }  
	}  
