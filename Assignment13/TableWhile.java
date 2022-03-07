package Assignment13;

import java.util.Scanner;

public class TableWhile {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no to print the Table");
		int no=sc.nextInt();
		int i=1;
		while(i<=no)
		{
			System.out.println("Table is="+no*i);
			i++;
		}

	}

}
