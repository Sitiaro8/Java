import java.util.Scanner;
		 
public class JavaProgram
{
    public static void main(String args[])
    {
       int a, b, r;
       Scanner scan = new Scanner(System.in);
	   
       System.out.print("Enter Two Numbers : ");
       a = scan.nextInt();
       b = scan.nextInt();
	   
       r = a + b;
       System.out.println("Addition = " +r);
	   
       r = a - b;
       System.out.println("Subtraction = " +r;
	   
       r = a * b;
       System.out.println("Multiplication = " +r);
	   
       r = a / b;
       System.out.println("Division = " +r);
    }
}