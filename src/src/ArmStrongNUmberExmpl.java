package src;

public class ArmStrongNUmberExmpl {
	
	public static void main(String []args) {
	int number = 153, armS=0;
	String s = number+"";
	int len = s.length(), temp =0;
	
		for(int i=0; i<len;i++) {
			temp = Integer.parseInt(s.charAt(i)+"");
			armS += Math.pow(temp, len);
			System.out.println("Math.pow("+temp+", "+len+")"+Math.pow(temp, len));
			System.out.println("temp  "+temp+"  arms  "+armS);
		}
	if(armS == number)
		System.out.println("armstrong  ");
	else
		System.out.println("not armstrong");
		
	}

}
