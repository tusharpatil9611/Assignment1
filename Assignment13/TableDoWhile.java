package Assignment13;

import java.util.Scanner;
public class TableDoWhile {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the No ");
		int no=sc.nextInt();
		int i=1;
		do
		{
			System.out.println(i*no);
			i++;
		}
		while(no>=i);
			System.out.println();
		
	}

}
