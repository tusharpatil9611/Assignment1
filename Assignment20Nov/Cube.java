package Assignment20Nov;

import java.util.Scanner;

public class Cube {
	Scanner sc=new Scanner(System.in);
	int height=sc.nextInt();
	int width=sc.nextInt();
	int length=sc.nextInt();
	int Area;
	void area()
	{
		 Area =2*(length*height+length*width+width*height);
		 System.out.println("Area of the cuboid="+Area);
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the length height weidth");
		Cube sc=new Cube();
		sc.area();
     
	}

}
