package Assignment20Nov;

public class WashingArea {
int length;
int width;
int Height;


 public WashingArea(int length, int width, int height) 
 {
//	super();
	this.length = length;
	this.width = width;
	this.Height = height;
}
float whiteWashArea()
{
	return ((2*length*Height)+(2*Height*width)+(width*length));
}
 int whiteWashing()
 {
	 return ((2*length*Height)+(2*Height*width)*80);
 }
 int flooringCost()
 {
	 return (200*(length*width));
 }
int cementCost()
{
	return (100*(length*width));
}
	
	public static void main(String[] args) {
		WashingArea cost=new WashingArea(2,2,2);
		System.out.println("white Wash Area is="+cost.whiteWashArea());
		System.out.println("white Washing cost is="+cost.whiteWashing());
		System.out.println("flooring Cost is="+cost.flooringCost());
		System.out.println("cement cost is="+cost.cementCost());
		

	}

}
