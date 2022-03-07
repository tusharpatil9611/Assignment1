package Assignment13;
import java.util.*;
public class FactByDoWhile {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no to find Factorial");
		int no=sc.nextInt();
		int fact=1;
		int i=1;
		do{
			fact=fact*i;
			i++;
			
		}
while(i<=no);
		System.out.println("Factorial is ="+fact);
	}
}


