import java.util.Scanner;

public class SammyEmployeeDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		acceptDetails();
		System.out.println("Done!");
	}

	private static void acceptDetails() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name: ");
		String name=sc.next();
		System.out.println("Enter phone number:");
		long phoneNo=sc.nextLong();
		System.out.println("Enter age: ");
		int age=sc.nextInt();
		try {
		if(age<20||age>55) {
			throw new MyException("Age = "+age+" It is not possible");
		}
		}catch (MyException e) {
			System.out.println(e);
		}
	}

}

class MyException extends Exception{
	MyException(String msg){
		 super(msg);
	}
}
