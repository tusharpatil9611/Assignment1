package Assignment12;

import java.util.Scanner;
public class DaysBySwitch {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the No");
		char ch=sc.next().charAt(0);
		switch(ch)
		{
		case '1':
			System.out.println("Monday");
			break;
		case'2':
			System.out.println("Tuesday");
			break;
		case'3':
			System.out.println("Wensday");
			break;
		case'4':
			System.out.println("Thursday");
			break;
		case'5':
			System.out.println("Friday");
			break;
		case'6':
			System.out.println("Saturday");
		case'7':
			System.out.println("Sunday");
			break;
			default:
				System.out.println("Invalid Input");
		}

	}

}
