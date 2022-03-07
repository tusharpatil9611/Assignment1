package assignmentScanner;
import java.util.*;
public class CelsiustoFaherScanner {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Value of the temp in Celsius");
	double c=sc.nextDouble();
	double F=32+(c*9/5);
	System.out.println("Temp in the Fahe ="+F);

	}

}
