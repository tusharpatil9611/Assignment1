package Assignment13;
import java.util.Scanner;
public class PrimeCounter {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no");
		int num=sc.nextInt();
		
		
		int counter=0;
		for(int i=2;i<=num-1;i++)
		{
			if(num%i==0)
				counter++;
		}
		if(counter==0)
		{
			System.out.println("Prime no");
		}
		else
		{
			System.out.println("Non Prime");
		}

	}

}
