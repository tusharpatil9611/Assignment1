package Assignment18Nov;

import java.util.Scanner;

public class MultipleNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the No");
		int num=sc.nextInt();
		System.out.println("Enter the Power Required");
		int power=sc.nextInt();
		
		int multip=num;
		while(1<power)
		{
			 num=num*multip;
			power--;
		}
		System.out.println(num);

	}

}
