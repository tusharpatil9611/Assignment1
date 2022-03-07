package Assignment18Nov;

public class Problem6 {

	public static void main(String[] args) {
		int count1=0;
		int count2=0;
		int count3=0;
	for(int i=33;i<=999;i++)
	{
		if(i%3==0 && i%5==0)
		{
			System.out.println("pint and Yello");
		count1++;
		}
		else if(i%3==0)
		{
			System.out.println("Pink");
		count2++;
		}
		else if(i%5==0)
		{
			System.out.println("Yello");
		count3++;
		}
		else
			System.out.println(i);
	}
	System.out.println("Pink and Yello count is "+count1);
	System.out.println("Pink "+count2);
	System.out.println("Yello "+count3);

	}

}
