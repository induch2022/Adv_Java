package src;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class ArrayListExmp {
   public static void main(String[] args) {
       String arr[] = {"yoyo", "apple","cherry", "banana","zebra", "111" ,"99","00", "@#$%","989898"};
       String element = "mango";
        
       ArrayList<String> arrayList = new ArrayList<String>();
       ArrayList<Integer> arrayIntList = new ArrayList<Integer>();
       arrayIntList.add(25);
        arrayIntList.add(77);      
        arrayIntList.add(8);
       arrayIntList.add(4);
        arrayIntList.add(40);      
        arrayIntList.add(14);        
        
        arrayIntList.forEach((e) -> {
            System.out.print(e + ", ");
          });
        Collections.sort(arrayIntList);
        
         arrayIntList.forEach((e) -> {
            System.out.println(e + ", ");
          });
        
        for(String s: arr)
           arrayList.add(s);
        
       arrayList.add(element);
        
       Collections.sort(arrayList);
       
      // for(String s: arrayList)
       //    System.out.print(s+"   ");
       Iterator<String> i = arrayList.iterator();
       
       
       
       while(i.hasNext())
    	   System.out.print("    "+i.next());

       
           System.out.println("\nreverse order \n");

       Collections.reverse(arrayList);
       for(String s: arrayList)
           System.out.print(s+"  ");
       
       
       List<String> al = new ArrayList<String>();//creating arraylist    
       al.add("Ravi");//adding object in arraylist    
       al.add("Vijay");    
       al.add("Ravi11");    
       al.add("Ajay");    
         
       List<String> al2=new LinkedList<String>();//creating linkedlist    
       al2.add("James");//adding object in linkedlist    
       al2.add("Serena");    
       al2.add("Swati");    
       al2.add("Junaid");    
         
       System.out.println("arraylist: "+al);  
       System.out.println("linkedlist: "+al2);  
       
        i = al.iterator();
        
        while(i.hasNext()) {
        	System.out.print("  "+i.next());
        	
        }
        
        i = al2.iterator();
        while(i.hasNext()) {
        	System.out.print("  "+i.next());
        	
        }
        
        
        int arr11[] = { 12, 35, 1, 10, 34, 1 };
        ArrayList<Integer> aListInt= new ArrayList<Integer>();
        System.out.println("   ");
        aListInt.add(1);//adding object in arraylist    
        aListInt.add(567);    
        aListInt.add(34);    
        aListInt.add(234);
        aListInt.add(10);
        aListInt.add(671);
        aListInt.add(324324);
        aListInt.add(112);
        aListInt.add(4073);
        
        int j=0;
        for(; j<aListInt.size();j++) {
        	System.out.print("   "+aListInt.get(j));
        	
        }
        Collections.sort(aListInt);
        
        System.out.println("");
        
        System.out.println("  "+aListInt);
       
        System.out.println(aListInt.size()+" second highest  "+aListInt.get(aListInt.size()-2));	



   }
}

   
     
  
  