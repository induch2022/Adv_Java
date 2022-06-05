package src;

import java.util.Arrays;

public class ForEachExmpl {

		public static void main(String[] arg)
		{
			{
				int[] marks = { 125, 132, 95, 116, 110, 1267,9867, 909090 };
				
				int highest_marks = maximum(marks);
				System.out.println("The highest score is " + highest_marks);
				
				
				int a[]={1,2,5,6,3,2};
				System.out.println("getSecondLargest   "+getSecondLargest(marks));
				
				System.out.println("secMax   "+secMax(marks));
			
			}
		}
		public static int maximum(int[] numbers)
		{
			int maxSoFar = numbers[0];
			
			// for each loop
			for (int num : numbers){
				
				System.out.println("num   "+num);
				if (num > maxSoFar)
				{
					maxSoFar = num;
				}
			}
		return maxSoFar;
		}
		
		public static int secMax(int[] numbers)
		{
		
				int temp;
				for (int i = 0; i < numbers.length; i++) 
				        {
				            for (int j = i + 1; j < numbers.length; j++) 
				            {
				                if (numbers[i] > numbers[j]) 
				                {
				                    temp = numbers[i];
				                    numbers[i] = numbers[j];
				                    numbers[j] = temp;
				                }
				            }
				        }
				 return numbers[numbers.length-2];
		}
		
		

		
		public static int getSecondLargest(int[] a){
			
			for(int aa:a) {
				System.out.println("aa   "+aa);
				
			}
			Arrays.sort(a);
			return a[a.length-2];
		}

	
}
