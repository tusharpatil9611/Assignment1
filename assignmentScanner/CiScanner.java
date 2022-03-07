package assignmentScanner;
import java.util.*;
public class CiScanner {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);	
	System.out.println("Enter Principal amount P=");
	int p=sc.nextInt();
	System.out.println("Enter Rate of Intrest R=");
	double r=sc.nextInt();
	System.out.println("Enter the no of time intrest applied perf time n=");
	int n=sc.nextInt();
	System.out.println("Enter the Time period y=");
	int y=sc.nextInt();
	double a=1+(r/(n*100.0));
//	System.out.println(a);
	int b=n*y;
//	System.out.println(b);
	double ci=p*Math.pow(a, b);
	System.out.println("Compound Intrest is="+ci);
	}

}
