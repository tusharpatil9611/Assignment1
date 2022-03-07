package Assignment12;

import java.util.Scanner;

public class AreaofPeri {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Radius of the Circle");
		double r=sc.nextDouble();
        double pi=3.14;
        double Area=pi*r*r;
        double peri=2*pi*r;
        System.out.println("Area of the Circle is="+Area);
        System.out.println("Peri Of the Circle is="+peri);
	}

}
