import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		Integer givenNumber=sc.nextInt();
		System.out.println("Enter digit");
		Integer givenDigit=sc.nextInt();
		String sb=givenNumber.toString();
		String sb2=givenDigit.toString();
		String temp=sb;
		Integer k=0;
		Character c;
		for (int i = 0; i < givenNumber; i++) {
			
			for (int j = 0; j < sb.length(); j++) {
				//System.out.println((temp.charAt(j))+" "+( givenDigit));
				
				if((temp.charAt(j))==sb2.charAt(0)) {
					//System.out.println("here");
					k=Integer.parseInt(temp);
					k--;
					temp=k.toString();
				//	System.out.println(temp);
				}
				
			}
			
		}
		System.out.println(temp);
		

	}

}
