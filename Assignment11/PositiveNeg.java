package Assignment11;
import java.util.Scanner;
public class PositiveNeg {
public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the No ");
		int no=sc.hashCode();
		if(no<0)
		{
			System.out.println("The Given No is Negative");
		}
		else if(no>0)
		{
			System.out.println("The no is Positive No");
		}
		else
		{
			System.out.println("The No is Zero");
		}
}	

}
