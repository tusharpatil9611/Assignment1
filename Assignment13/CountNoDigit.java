package Assignment13;

import java.util.Scanner;

public class CountNoDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Digit");
		int num=sc.nextInt();
		int counter=0;
	
		for(int i=1;i<=num;)
		{
			num=num/10;
		counter++;
		}
System.out.println(counter);
	}


}
	