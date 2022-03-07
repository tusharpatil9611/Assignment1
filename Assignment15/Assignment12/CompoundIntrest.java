package Assignment12;

import java.util.Scanner;

public class CompoundIntrest {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Principal Amount");
		int p=sc.nextInt();
		System.out.println("Rate of intrest");
		int r=sc.nextInt();
		System.out.println("No of tnhe Intrest Applied");
		int n=sc.nextInt();
		System.out.println("time period");
		int t=sc.nextInt();
		double a=1+(r/(n*100.0));
		double b=n*t;
		double root=Math.pow(a, b);
		double CI=p*root;
		System.out.println("Compound Intrest is ="+CI);
		
	}

}
