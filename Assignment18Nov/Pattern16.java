package Assignment18Nov;

public class Pattern16 {

	public static void main(String[] args) {
		for(int i=0;i<=4;i++)
		{
			for(int j=0;j<=4;j++)
			{
					if(i%2==0 && j%2==0)
						System.out.print("1");
					else if(i%2!=0 && j%2!=0)
						System.out.print("1");
					else
						System.out.print("0");
			}
			System.out.println();
		}

	}

}
