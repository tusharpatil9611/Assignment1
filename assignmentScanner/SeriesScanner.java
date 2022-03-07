package assignmentScanner;
import java.util.*;

public class SeriesScanner {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the no ");
	int k=sc.nextInt();
	System.out.print("Series is =");
	System.out.println(k++ - ++k+k-- -k++ + ++k-k-- + --k+k+k- --k+k++);

	}

}
