package Assignment18Nov;
import java.util.*;
public class Kaprekar {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no");
		int num=sc.nextInt();
		int temp=num;
		int sq=num*num;
		
		int DigitCount=0;
		while(0<temp)
		{
			temp=temp/10;
			DigitCount++;
		}
		
		int num2=(int)(Math.pow(10,DigitCount));
		int part1=sq/num2;
		int part2=sq%num2;
		int sum=part1+part2;
		if(num==sum)
			System.out.println("No is Kaprekar");
		else
			System.out.println("No is not Kaprekar");

	}

}
