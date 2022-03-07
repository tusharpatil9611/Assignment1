package Assignment12;
import java.util.*;
public class SimpleIntrest {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	System.out.println("Enter the Principal amount ");
	int p=sc.nextInt();
	System.out.println("Enter the no of Year ");
	int n=sc.nextInt();
	System.out.println("Enter the Rate of Intrest");
	int r=sc.nextInt();
	double SI=p*n*r/100;
	System.out.println("Simple Intrest is ="+SI);
	
	}

}
