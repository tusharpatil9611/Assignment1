package assignmentScanner;
import java.util.*;
public class RectangleofTringle {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Length of the rectangle= ");
		int l=sc.nextInt();
		double a=Math.pow(3, 1/2.0);
		double Area =a*l*l/4;
		double peri=3*l;
		double height=a*l/2;
		System.out.println("Area of the Tringle is="+Area);
		System.out.println("Perimeter of the Tringle"+peri);
		System.out.println("Height of the Tringle is="+height);

	}

}
