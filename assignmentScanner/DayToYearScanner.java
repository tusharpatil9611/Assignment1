package assignmentScanner;
import java.util.*;
public class DayToYearScanner {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number=");
		int num=sc.nextInt();
		int year=num/365;
		int rem=num%365;
		System.out.println("Years is="+year);
		int month=rem/30;
		int rem1=rem%30;
		System.out.println("Months is="+month);
		int week=rem1/7;
		int rem2=rem1%7;
		System.out.println("Weeks is "+week);
		System.out.println("Remaining Days is="+rem2);
	
		
		}

}
