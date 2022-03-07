package assignmentScanner;
import java.util.*;
public class SiScanneer {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Principal amount ");
		int p=sc.nextInt();
		System.out.println("Enter rate of interest ");
		int r=sc.nextInt();
		System.out.println("Enter no of year ");
		int n=sc.nextInt();
		int si=p*n*r/100;
		System.out.println("Simple Intrest is "+si);
		

	}

}
