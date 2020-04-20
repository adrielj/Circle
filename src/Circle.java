public class Circle
{

	private double radius;

	public Circle()
	{
	}

	public Circle(double radius)
	{
		this.radius = radius;
	}

	//Return radius of the circle
	public double getRadius()
	{
		return radius;
	}

	//Set a new radius for the circle
	public void setRadius(double radius)
	{
		this.radius = radius;
	}

	//Write a method below this line called getArea to return the area of the circle

	public double getArea() {
		
		double area = Math.PI*Math.pow(radius, 2);
		
		return area;
		
	}

	//Write a method below this line called getDiameter to return the diameter of the circle

	public double getDiameter() {
		
		double diameter = radius*2;
		
		return diameter;
		
	}

	//Write a method below this line called getPerimeter to return the perimeter of the circle

	public double getPerimeter() {
		
		double perimeter = 2 * Math.PI * radius;
		
		return perimeter;
		
	}

}