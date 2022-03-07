package Assignment11;

import java.util.Scanner;
public class AverageMarks {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Marks of the sub 1,2,3,4,5");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int e=sc.nextInt();
		int sum=(a+b+c+d+e);
		System.out.println("Sum of marks is="+sum);
		int percentage=sum/5;
		System.out.println("percentage="+percentage);
		if(percentage>=90)
		{
			System.out.println("Grade A");
		}
		else if(percentage>=80)
		{
			System.out.println("Grade B");
		}
		else if(percentage>=70)
		{
			System.out.println("Grade C");
		}
		else if(percentage>=60)
		{
			System.out.println("Grade D");
		}
		else if(percentage>=50)
		{
			System.out.println("Grade E");
		}
		else if(percentage>=40)
		{
			System.out.println("Grade F");
		}
		else 
		{
			System.out.println("Fail");
		}
	}

}
