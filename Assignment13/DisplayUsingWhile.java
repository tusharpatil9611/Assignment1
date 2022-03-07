package Assignment13;
import java.util.Scanner;
public class DisplayUsingWhile {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  No");
		int no=sc.nextInt();
		int i=1;
		while(i<=no)
		{
			System.out.println(i);
			i++;
		}

	}

}
