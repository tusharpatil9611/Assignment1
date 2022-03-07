package Assignment13;
import java.util.Scanner;
public class EvenOddFor {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first no");
		int no=sc.nextInt();
		System.out.println("Enter the Second No");
		int no1=sc.nextInt();
		for(int i=no;i<=no1;i++)
		{
			if(i%2==0)
				System.out.println(i+" Even");
		
			else
				System.out.println(i+" Odd");

		}

	}

}