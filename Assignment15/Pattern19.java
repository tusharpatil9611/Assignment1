package Assignment15;

public class Pattern19 {
	public static void main(String[] args){
		for(int i=0;i<=8;i++)
		{
			for(int j=0;j<=8;j++)
			{
				if((j+i>=4 && j-i<=4) &&( j-i>=-4 && j+i<=12))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
	}
}
