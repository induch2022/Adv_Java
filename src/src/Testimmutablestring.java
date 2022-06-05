package src;
class Testimmutablestring{  
 public static void main(String args[]){  
   String s="Sachin";  
   s.concat(" Tendulkar");//concat() method appends the string at the end  
   System.out.println(s);//will print Sachin because strings are immutable objects  
   
   s = s.concat(" Tendulkar");
   
    System.out.println(s);
    
    System.out.println("indexOf  "+ s.indexOf("en"));
    System.out.println("compareTo ssss "+ s.compareToIgnoreCase("ssss"));
    
    System.out.println("replace    "+"sssssssss".replace('s', '2'));
    System.out.println("substring     "+s.substring(1, 8));
 }  
}  