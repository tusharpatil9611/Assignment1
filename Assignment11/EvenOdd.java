package Assignment11;
import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Ente the No");
		int a=sc.nextInt();
		if(a%2==0)
		{
			System.out.println("Given No is Even No");
		}
		else
		{
			System.out.println("No is Odd No");
		}
	}

}
