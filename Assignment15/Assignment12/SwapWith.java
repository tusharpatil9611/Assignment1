package Assignment12;

import java.util.Scanner;
public class SwapWith {
public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the two Variable one by one ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(" After swapping A ="+a);
		System.out.println("After swapping B ="+b);

	}

}
