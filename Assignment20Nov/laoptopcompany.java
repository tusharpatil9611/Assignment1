package Assignment20Nov;
import java.util.*;
public class laoptopcompany {
	Scanner sc=new Scanner(System.in);
	public void welcome()
	{
		System.out.println("\"WELCOME\"");
		System.out.println("Choose Option");
		System.out.println("Add-1");
		System.out.println("Sub-2");
		System.out.println("Mul-3");
		System.out.println("Div-4");
		int choice=sc.nextInt();
		if(choice<=4)
		{
			System.out.println("Enter two Number");
			int num1=sc.nextInt();
			int num2=sc.nextInt();
			if(choice==1)
				System.out.println("The Result is Add="+num1+num2);
			else if(choice==2)
				System.out.println("The Result is Sub="+(num1-num2));
			else if(choice==3)
				System.out.println("The Result is Muli="+num1*num2);
			else if(choice==4)
				System.out.println("The Result is Div="+num1/num2);		
		}
		else
			System.out.println("Quite");
			System.out.println("Thank You");
	}
	public static void main(String[] args) {
		laoptopcompany lap=new laoptopcompany();
		lap.welcome();
	}
}
