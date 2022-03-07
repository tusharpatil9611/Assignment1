package Assignment13;

import java.util.Scanner;
public class PrimeWhile {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the No");
		int no=sc.nextInt();
		int i=2;
		boolean isNo=true;
		while(i<=no)
		{
			if(no%i==0)
				isNo=false;	
			i++;
			break;
		}
if(isNo==true)
	System.out.println("No is Prime No");
else
	System.out.println("No is not Prime");
	}

}
