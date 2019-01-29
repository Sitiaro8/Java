class Stack {

	int intStack[] = new int [10];
	int index;

	Stack(){
		index =-1;
	}

	
	//for insertion, 
	void push (int num){
		if(isFull( ))
		{
			System.out.println("Number cannot be pushed, Stack Full !");
		}
		else{
			intStack[++index]=num;
		}

	} 

	//for Deletion, 
	int pop( ){
		if(isEmpty()){
			System.out.println("Number cannot be popped, Stack empty !");
			
		}
		else{
		index--;
		System.out.println("Value of Index"+index);
		}
		return intStack[index+1];
	}

	boolean isEmpty( ){
		if(index == -1 )
		{
			return true;
		}
		return false;
	}
import java.util.*;
class StackTest{
	
	public static void main(String [] args){

		char c;
		Stack s = new Stack();
		Scanner scan = new Scanner(System.in);
		do{
		System.out.println("You can perform following operations on Stack");
		System.out.println("1. Push an element into the Stack");
		System.out.println("2. Pop an element from the Stack");
		System.out.println("3. Find out if the Stack is Empty");
		System.out.println("4. Find out if the Stack is Full");
		System.out.println("5. Space left in the Stack");
		System.out.print("\n"+"Enter Your Choice : ");
		int ch=scan.nextInt();
		switch(ch){
			case 1 : System.out.print("Enter the number you want to push : ");
					 int num =scan.nextInt();
					 s.push(num);
					 break;
			case 2: System.out.println("The poped number is : "+s.pop());
					 break;
			case 3: System.out.println(s.isEmpty());
					 break;
			case 4 : System.out.println(s.isFull());
					 break;	
			case 5 : System.out.println("Space for"+s.SpaceLeft()+"numbers left in Stack");
					 break;	
			default : System.out.println("Invalid Choice");
					  
								 
			}
		s.display();
		System.out.println("Do you want to continue");
		c =scan.next().charAt(0);				 
		}while(c=='y'||c=='Y');
	
	}
}
	
	boolean isFull( ){
		if(index == 9){
			return true;
		}
		return false;
	}
	int SpaceLeft( ){

		return (9-index);

	}
	void display(){
		if(!isEmpty()){
		System.out.println("==================");
			for(int i=0;i<index+1;i++){
			System.out.print(intStack[i]+" ");
			}
		System.out.println("\n"+"==================");
		}
		else
		System.out.println("Stack Empty. Nothing to display..!");
	}
}