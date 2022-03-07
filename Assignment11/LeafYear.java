package Assignment11;

import java.util.Scanner;

public class LeafYear {
public static void main(String args[]){
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter The Year ");
	int year=sc.nextInt();
	if(year%4==0)
	{
		System.out.println("Year is Leaf Year "+year);
	}
	else
	{
		System.out.println("Year is Not a Leaf Year "+year);
	}
}
}