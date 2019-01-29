import java.util.Scanner;
public class factorial{
	public static void main(String[] args){
    Scanner console = new Scanner(System.in);
    System.out.print("enter the number :");
    int factorial;
    factorial=console.nextInt();
    int i,n;
    for(i=factorial;i>0;i=factorial-1)
    {
    factorial=factorial*i;
    break;
    }
    System.out.print("the factorial of the number is" +factorial );
	}
}