package Assignment13;
import java.util.*;
public class Palindrom {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the No ");
		int num=sc.nextInt();
		
		int temp=num;
		int sum=0;
		while(0<temp)
		{
			sum=sum*10+temp%10;
			temp=temp/10;
		}
		if(num==sum)
			System.out.println("No is palindrom");
		else
			System.out.println("No is not palindrom ");
	}

}
