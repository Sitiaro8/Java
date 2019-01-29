public class rectangle
	{
	private double lenght;
	private double width;
	double area,perimeter;
	public rectangle(){
	lenght=10;
	width=10;
	}
	public rectangle(double l,double w){
	lenght=l;
	width=w;
	}
	public void setdimension(double a, double b){
	lenght=a;
	width=b;
	}
public double getlenght()
{
return lenght;
	}
	public double getwidth()
	{
	return width;
	}
	
	public double area(){
	area=lenght*width;
	return area;
	}
	public double perimeter()
	{
	perimeter=2*lenght+2*width;
	return perimeter;
	}
	public void print()
	{
	System.out.print("the area is" +area);
	System.out.print("the perimeter is" +perimeter);
	}
}
