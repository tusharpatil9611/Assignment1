package Assignment20Nov;
import java.util.*;
public class Triangle {
	
	static int side1;
	static int side2;
	static int side3;
	static int angle1;
	static int angle2;
	static int angle3;
	void Perimeter()
	{
		int perimeter=side1*side2*side3;
		System.out.println("Perimeter is="+perimeter);
	}
	void Area()
	{
		int s=(side1+side2+side3)/2;
		double b=(s*(s-side1)*(s-side2)*(s-side3));
		double Area=Math.pow(b,1/2.0);
		System.out.println("Area if Triangle="+Area);		
	}
	void isolateral()
	{
		if(side1==side2 || side2==side3 || side3==side1)
		{
		System.out.println("Triangle is a Isolateral Triangle");
		}
	}
	void equilateral()
	{
		if(side1==side2 && side2==side3 && side3==side1)
		{
		System.out.println("Triangle is a Equilateral Triangle");
	
		}
		
	}
	void rightangleTriangle()
	{
		if(angle1==90 || angle2==90|| angle3==90)
		{
		System.out.println("Triangle is a Right Angle Triangle");
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter side1=");
		int s1=sc.nextInt();
		System.out.println("Enter the side2=");
		int s2=sc.nextInt();
		System.out.println("Enter the Side3=");
		int s3=sc.nextInt();
		System.out.println("Enter the three Angle");
		int ang1=sc.nextInt();
		int ang2=sc.nextInt();
		int ang3=sc.nextInt();
		side1=s1;
		side2=s2;
		side3=s3;
		angle1=ang1;
		angle2=ang2;
		angle3=ang3;
		Triangle result=new Triangle();
		result.Perimeter();
		result.Area();
		result.isolateral();
		result.equilateral();
		result.rightangleTriangle();

	}

}
