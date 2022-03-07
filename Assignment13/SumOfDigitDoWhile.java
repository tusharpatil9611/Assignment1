package Assignment13;

import java.util.Scanner;
public class SumOfDigitDoWhile {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the No");
		int num=sc.nextInt();
		int sum=0;
		do{
			sum=sum+num%10;
			num=num/10;
		}
while(0<num);
System.out.println(sum);
	}

}
