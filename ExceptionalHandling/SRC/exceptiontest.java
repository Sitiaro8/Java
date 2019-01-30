import java.util.*;
class exceptiontest{
	public static void main(String[] args) {
	String s = null;
	try{
	if(s==null){
	throw new Exception("you entered a null string");
	}
	else{
	System.out.println("the string you entered is "+s);
	}
	}
	catch(Exception e) {
	System.out.println(e)
	}
	finally{
	System.out.println("Program executed successfully");
	}
	}
}