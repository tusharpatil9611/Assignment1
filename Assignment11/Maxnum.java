package Assignment11;
import java.util.*;
public class Maxnum {

	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the First No, Second no & Third No");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	System.out.println("No enter Succefully");
	if(a>b && a>c)
	{
		System.out.println("A is Maximum");
	}
	else if(b>a && b>c)
	{
		System.out.println("B is Maximum");
	}
	else
	{
		System.out.println("C is Maximum");
	}
	}

}
