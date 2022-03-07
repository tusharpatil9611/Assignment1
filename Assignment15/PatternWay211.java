package Assignment15;

public class PatternWay211 {

	public static void main(String[] args) {
		for(int i=0;i<=4;i++)
		{
			for(int j=0;j<=8;j++)
			{
				if(j+i>=4 && j-i<=4)
					System.out.print("*");
				else
					System.out.print(" ");
		}
			System.out.println();
		}

	}

}
