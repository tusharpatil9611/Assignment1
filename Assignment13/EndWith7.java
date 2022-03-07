package Assignment13;

import java.util.Scanner;

public class EndWith7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First");
		int num=sc.nextInt();
		System.out.println("Enter the second No");
		int num1=sc.nextInt();
		System.out.println("Enter the no ending with which digit");
		int num2=sc.nextInt();
		int sum=0;
		for(int i=num;i<=num1;i++)
		{
		if(i%10==num2)	
			System.out.println(i);
		}


	}

}
