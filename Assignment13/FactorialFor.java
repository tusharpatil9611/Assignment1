package Assignment13;

import java.util.Scanner;

public class FactorialFor {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no");
		int no=sc.nextInt();
		int fact=1;
	for(int i=1;i<=no;i++)
		fact=fact*i;
		System.out.println(fact);

	}

}
