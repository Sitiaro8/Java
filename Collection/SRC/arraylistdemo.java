import java.util.*;
class arraylistdemo {
	public static void main(String args[])
	{
	Arraylist<String> al=new Arraylist<String>();
	System.out.println("Initial size of al:"+al.size());
	al.add("C");
	al.add("A");
	al.add("F");
	al.add("D");
	al.add("E");
	System.out.println("Initial size  addition al:"+al.size());
	System.out.println("Initial size  addition al:"+al);
	al.remove("F");
	al.remove(2);
	System.out.println("Initial size deletion al:"+al.size());
	System.out.println("Initial size deletion al:"+al);
	
	}
}