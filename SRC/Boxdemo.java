class Box
{
	double width,w;
	double height,h;
	double depth,d;

	void setdim()
	{
	w=width;
	h=height;
	d=depth;
	}
	double volume()
	{
	return w*h*d;
	}
}
class Boxdemo
{
	public static void main(String args[])
	{
	double vol;
	Box b = new Box();
	Box b2 = new Box();
	b. width=2;
	b. height=5;
	b. depth=10;
	vol=b2. volume();
	}
}