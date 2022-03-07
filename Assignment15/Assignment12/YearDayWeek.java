package Assignment12;

import java.util.Scanner;
public class YearDayWeek {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
System.out.println("Enter the Days ");
int day=sc.nextInt();
int year=day/365;
int rem=day%365;
System.out.println("Years ="+year);
int week=rem/7;
int rem1=rem%7;
System.out.println("No of Weeks="+week);
System.out.println("No of Days="+rem1);
	}

}
