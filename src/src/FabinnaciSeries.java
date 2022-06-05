package src;

import java.util.Scanner;

public class FabinnaciSeries {
	
	
	public static void main(String []args) {
		
		int count =0, num1 =0, num2 =1;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter anumber");
		count = sc.nextInt();
		sc.close();
		
		int[] fabinnaci;
		fabinnaci = new int[count];

		 int temp =0;
		for(int i =0; i<count; i++) {
			
//			if(num1 >count)
//				break;
	  	  
	  	fabinnaci[i] = num1;
	  	System.out.print(" "+num1);
	  	temp = num1 + num2;
            num1 = num2;
            num2 = temp;

		}
		
		System.out.println("");
		for(int i =0; i<fabinnaci.length; i++) {
		if(i>0&&fabinnaci[i]==0)
			break;
		System.out.print(" "+fabinnaci[i]);
		
		}
		
		
	}

}
