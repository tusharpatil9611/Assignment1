package assignmentScanner;
import java.util.*;
public class SwappingScanner {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the fist no which will be store into the variable a ");
		int a=sc.nextInt();
		System.out.println("Enter the second no which will be store in the variable b");
		int b=sc.nextInt();
		int c=a;
		a=b;
		b=c;
		System.out.println("Swapping a="+a);System.out.println("Swapping b="+b);
		
	}

}
