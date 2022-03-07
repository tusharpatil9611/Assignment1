package Assignment18Nov;
import java.util.*;
public class Fibonachi {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Count");
		int num=sc.nextInt();
		int a=0;
		int b=1;
		
		System.out.println(a);
		System.out.println(b);
		//int count=1;   it is used in while loop.
		for(int i=0;i<=num-2;i++)
		{
			System.out.println(a+b);
			int temp=a+b;
			a=b;
			b=temp;
			//count++;
			
		}

	}

}
