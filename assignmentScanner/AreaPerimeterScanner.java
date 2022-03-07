package assignmentScanner;
import java.util.*;
public class AreaPerimeterScanner {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Radius of Circle R=");
		int r=sc.nextInt();
		double pi=3.14;
		double Area=pi*r*r;
		double Perimeter=2*pi*r;
		System.out.println("Area of the Circle is="+Area);
		System.out.println("Perimeter of the Circle is="+Perimeter);
	}

}
