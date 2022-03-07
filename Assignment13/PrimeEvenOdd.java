package Assignment13;
import java.util.*;
public class PrimeEvenOdd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the First no");
		int num=sc.nextInt();
		System.out.println("Enter the Seccond No");
		int num1=sc.nextInt();
		
		for(int i=num;i<=num1;i++)
		{  
			int counter=0;
			for(int j=2;j<=i-1;j++)
			{
				if(i%j==0)
				{
					counter++;
				}
			}
			if(counter==0)
				System.out.println(i+" it is Prime no");
			if(i%2==0)
			{
				System.out.println(i+" even no");
			}
			else
			{
				System.out.println(i+" odd no ");
			}
			
		}
		
	}

}
