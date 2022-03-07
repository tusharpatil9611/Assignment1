package Assignment12;

import java.util.Scanner;
public class Salary {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Basic Salary");
		double S=sc.nextInt();
		if(S<=10000){
			double Amount=(S+0.20*S+0.8*S);
			System.out.println("Total Salary is="+Amount);
		}
		else if(S<=20000)
		{
			double amount=(S+0.25*S+0.9*S);
			System.out.println("Total Salary is="+amount);
		}
		else
		{
			double amount=(S+0.30*S+0.95*S);
			System.out.println("Total Salary="+amount);
		}
	}

}
