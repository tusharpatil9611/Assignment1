package Assignment20Nov;

public class AdditionDemo {
	int num1=12;
	int num2=20;
	int result;
	public void add()
	{
		result=num1+num2;
		System.out.println("Addition ="+result);
	}
	public void sub()
	{
		result=num1+num2;
		System.out.println("Subtraction="+result);
	}
	public void multi()
	{
		result=num1+num2;
		System.out.println("Multiplication="+result);
	}
	public void div()
	{
		result=num1+num2;
		System.out.println("Division="+result);
	}
	
	
	public static void main(String[] args) {
		AdditionDemo demo=new AdditionDemo();
		demo.add();
		demo.sub();
		demo.multi();
		demo.div();
	}

}
