package Assignment13;
import java.util.Scanner;
public class CountingDoWhile {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("ENter the no");
		int num=sc.nextInt();
		int counter=0;
		do
		{
			num=num/10;
			counter++;
		}
		while(num!=0);
		System.out.println(counter);
	}

}
