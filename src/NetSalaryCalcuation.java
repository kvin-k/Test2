import java.util.Scanner;

public class NetSalaryCalcuation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter basic salary: ");
		double basicSalary=sc.nextDouble();
		System.out.println("Net payable salary = "+netSalary(basicSalary));
		
	}
	
	public static double netSalary(double basicSalary) {
		double hra=basicSalary/2;
		double specialAllowance=(basicSalary*3)/4;
		double pfDeduction=(basicSalary*12)/100;
		double netPayableSalary=basicSalary+hra+specialAllowance-pfDeduction;
		return netPayableSalary;
	}

}
