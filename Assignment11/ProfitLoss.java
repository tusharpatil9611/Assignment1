package Assignment11;

import java.util.Scanner;

public class ProfitLoss {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Bying Price");
		int a=sc.nextInt();
		System.out.println("Enter the selling price");
		int b=sc.nextInt();
		if(a<b)
		{
			double profit=(b-a);
			System.out.println("Prifit "+profit);
			double Profitpercentage=profit/a*100;
			System.out.println("Percentage is "+Profitpercentage);
		}
		else if(a>b)
		{
			double loss=(a-b);
			System.out.println("Loss "+loss);
			double losspercentage=loss/b*100;
			System.out.println("Percentage is "+losspercentage);
		}
	}

}
