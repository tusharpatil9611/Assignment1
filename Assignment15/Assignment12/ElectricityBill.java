package Assignment12;

import java.util.Scanner;
public class ElectricityBill {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Reading unit");
		int unit=sc.nextInt();
		double bill=0;
		if(unit<=50)
			bill=(unit*0.5);
		else if(unit<=150)
			bill=(50*0.5+0.75*(unit-50));
		else if(unit<=250)
			bill=(50*0.5+100*0.75*100+1.2*(unit-150));
		else
			bill=(50*0.5+100*0.75+1.2*100+1.5*(unit-250));
		double TotalBill=1.2*bill;
		
		
		System.out.println("Total Bill is="+TotalBill);
	}

}
