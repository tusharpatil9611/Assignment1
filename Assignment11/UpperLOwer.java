package Assignment11;
import java.util.Scanner;
public class UpperLOwer {
public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
 System.out.println("Enter the Char");
 char ch=sc.next().charAt(0);
 if(ch>='a' && ch<='z')
 {
	 System.out.println("Charecter is Lower Case");
 }
 else if(ch>='A' && ch<='Z')
 {
	 System.out.println("Charecter is Upper Case");
 }
 else
 {
	 System.out.println("Invalid Input");
 }
	}

}
