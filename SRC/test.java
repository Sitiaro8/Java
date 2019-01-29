interface one{
	void point1();
	void point2();
	}
	interface two extends one{
	void point3();
	}
	class test implements two{
	public void point()
	{
	Systyem.out.println("onde-1");
	}
	public void print2(){
	Sysytem.out.println("two");
	}
	public void print3()
	{
	System.out.println("three");
	}
	}
	class test{
	public static void main(String args[]){
	test t=new test();
	t.print1();
	t.print2();
	t.print3();
	}
	}