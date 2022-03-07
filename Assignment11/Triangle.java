package Assignment11;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the three side of the triangle");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a==b && b==c)
		{
			System.out.println("Triangle is Equilateral Triangle");
		}
		else if(a==b || b==c || c==a)
		{
			System.out.println("Triangle is Isoscelent Triangle");
		}
		else
		{
			System.out.println("Triangle is scalent triangle");
		}
	}

}
