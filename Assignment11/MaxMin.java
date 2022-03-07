package Assignment11;
import java.util.Scanner;
public class MaxMin {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the No ");
 int a=sc.nextInt();
 		System.out.println("Enter the second No");
 int b=sc.nextInt();
 if(a<b)
 {
	 System.out.println("NO is Minimum= "+a+" NO is Max no= "+b);
 }
 else if(a>b)
 {
	 System.out.println("NO is Max= "+a+" No is Min= "+b);
 }
	}

}
