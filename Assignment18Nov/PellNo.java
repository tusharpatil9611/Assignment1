package Assignment18Nov;
import java.util.Scanner;
public class PellNo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the to requierd series of the no");
		int num=sc.nextInt();
		int a=0;
		int b=1;
		System.out.println(a);
		System.out.println(b);
		for(int i=0;i<=num-2;i++)
		{
			System.out.println(a+2*b);
			int temp=a+2*b;
			a=b;
			b=temp;
		}

	}

}
