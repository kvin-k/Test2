import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		Integer givenNumber=sc.nextInt();
		System.out.println("Enter digit");
		int givenDigit=sc.nextInt();
		String sb=givenNumber.toString();
		String temp=sb;
		Integer k=0;
		Character c;
		//for (int i = 0; i < givenNumber; i++) {
			
			for (int j = 0; j < sb.length(); j++) {
				System.out.println((temp.charAt(j))+" "+((char) givenDigit));
				c=(char) givenDigit;
				if((temp.charAt(j)).compareTo(c)) {
					k=Integer.parseInt(temp);
					k--;
					temp=k.toString();
					System.out.println(temp);
				}
				
			}
			
		//}
		System.out.println(temp);
		

	}

}
