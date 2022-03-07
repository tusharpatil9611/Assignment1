package Assignment13;

import java.util.Scanner;

public class PrimeFor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no");
		int no=sc.nextInt();
		boolean isNo=true;
		int num=0;
		for(int i=2;i<=no-1;i++)
		{
			if(no%i==0)
				isNo=false;
		}
if(isNo==true)
	System.out.println("No is Prime No");
else
	System.out.println("No is not Prime No");

	}

}
