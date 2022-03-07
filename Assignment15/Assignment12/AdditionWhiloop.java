package Assignment12;

import java.util.Scanner;
public class AdditionWhiloop {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
 System.out.println("Enter the Mobile No ");
long n=sc.nextLong();
long sum=0;
long counter=0;
while(n>0)
{
	sum= sum+n%10;
	n=n/10;
	counter++;
	}
System.out.println(sum);
System.out.println(counter);
	}
}
