package Assignment18Nov;

public class Pattern20 {

	public static void main(String[] args) {
		int count=1;
		for(int i=0;i<=6;i=i+2)
		{
			for(int j=0;j<=6;j++)
			{
				if(j-i<=0)
				{
					if(j<i/2)
						System.out.print(count--);
					else
						System.out.print(count++);
				}
			}
			System.out.println();
		}

	}

}
