package Assignment13;

import java.util.Scanner;
public class DisplayNoFor {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
System.out.println("Enter the no ");
int no=sc.nextInt();
System.out.println("Enter the Second No");
int no2=sc.nextInt();
for(int i=no;i<no2;i++)
{
System.out.println("no is"+i);	
}
	}

}
