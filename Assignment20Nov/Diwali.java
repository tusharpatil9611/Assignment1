package Assignment20Nov;
import java.util.*;
public class Diwali {
	public void salary()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Salary of the ");
		int s=sc.nextInt();
		System.out.println("Enter the Year of Experience");
		int y=sc.nextInt();
		if(y>5)
			System.out.println("Salary of tyhe employee with expense is= "+1.35*s);
		else
			System.out.println("Salary of tyhe employee with expense is= "+1.15*s);
	}
	

	public static void main(String[] args) {
		Diwali sc=new Diwali();
		sc.salary();

	}

}
