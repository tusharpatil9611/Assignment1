package Assignment13;

import java.util.Scanner;

public class TableFor {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter which table do u Want");
		int no=sc.nextInt();
		for(int i=1;i<=no;i++)
		{
			System.out.println("Table is ="+no*i);
		}
	}

}
