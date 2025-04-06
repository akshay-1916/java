package interface1;

public class Rectangle extends Shape{
	int length;
	int breadth;
	
	public Rectangle(int length,int breadth) {
		this.length=length;
		this.breadth=breadth;
	}
	
	void calculateAre() {
		System.out.println("Area of rectangle  is: "+(length*breadth));
	}

}
