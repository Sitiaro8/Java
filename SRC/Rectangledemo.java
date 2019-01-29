class Shape {
	public void display() {
	System.out.println("This is shape")
}
class Rectangle extends Shape {
	public void display()
	System.out.println("This is rectangle")
	public void IncreaseLength()
	System.out.println("Length is increased")

}
}

class Reactangledemo {
	public static void main (String[] args) {
		Shape s;
		s = new Rectangle();
		s.display();
		s.increaselength();

		system.out.println("This is the new rectangle ")
	}
} 