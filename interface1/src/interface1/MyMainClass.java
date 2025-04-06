package interface1;

public class MyMainClass {
	public static void main(String arg[]) {
		Rectangle rect=new Rectangle(20,10);
		rect.calculateArea();
		
		Square sq=new Square(6);
		sq.calculateArea();
		
		Circle circle =new Circle(7);
		circle.calculateArea();
	}

}
