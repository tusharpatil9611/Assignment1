package Assignment20Nov;

import java.util.Scanner;

public class TriangleTest {
	Scanner sc=new Scanner(System.in);
int s1=sc.nextInt();
int s2=sc.nextInt();
int s3=sc.nextInt();
int ang1=sc.nextInt();
int ang2=sc.nextInt();
int ang3=sc.nextInt();
void Perimeter()
{
	int perimeter=s1*s2*s3;
	System.out.println("Perimeter is="+perimeter);
}
void Area()
{
	int s=(s1+s2+s3)/2;
	int b=(s*(s-s1)*(s-s2)*(s-s3));
	double Area=Math.pow(b,1/2.0);
	System.out.println("Area of Triangle="+Area);		
}
void isolateral()
{
	if(s1==s2 || s2==s3 || s3==s1)
	System.out.println("Triangle is a Isolateral Triangle");
	else
		System.out.println("Triangle is a Isolateral Triangle");
}
void equilateral()
{
	if(s1==s2 && s2==s3 && s3==s1)
	System.out.println("Triangle is a Equilateral Triangle");
	else
		System.out.println("Triangle is not a Equilateral Triangle");	
}
void rightangleTriangle()
{
	if(ang1==90 || ang2==90|| ang3==90)
	
	System.out.println("Triangle is a Right Angle Triangle");
	else
		System.out.println("Triangle is not Right angle Triangle");
}
	public static void main(String[] args) {
		
		System.out.println("Emter the three side and three angle noe by one");
		TriangleTest result= new TriangleTest();
		result.Area();
		result.Perimeter();
		result.equilateral();
		result.isolateral();
		result.rightangleTriangle();

	}
}
