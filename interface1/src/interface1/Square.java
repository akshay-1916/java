package interface1;

public class Square extends Shape{
	int side;
	public Square(int side) {
		this.side=side;
	}
	
	void calculateArea() {
		System.out.println("Area of square is :"+(side*side));
	}

}
