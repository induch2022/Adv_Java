package src;

import java.util.Scanner;

public class ScannerExmpl {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a value");
		
		int i = sc.nextInt();
		System.out.println("enter ur name");
		String s = sc.next();
		
		
		System.out.println("i   "+i+"   s   "+s);
		
	}

}
