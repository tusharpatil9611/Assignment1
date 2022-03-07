package Assignment18Nov;

import java.util.Scanner;

public class Harshand {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no");
		int num=sc.nextInt();
		
		int temp=num;
		int sum=0;
		while(0<temp)
		{
		 sum=sum+num%10;
		 temp=temp/10;
		}
		if(num%sum==0)
			System.out.println("No is Harshad No");
		else
			System.out.println("No is not Harshad No");
	}
}
