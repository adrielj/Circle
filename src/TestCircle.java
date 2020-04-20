public class TestCircle
{
	public static void main(String[] args)
	{
		//circle1 has a radius of 1
		Circle circle1 = new Circle(1);
		//circle2 has a radius of 2
		Circle circle2 = new Circle(2);
		//circle3 has with a radius of 3
		Circle circle3 = new Circle(3);

		//Print the Area of circle1
		System.out.println("Area of circle with radius " + circle1.getRadius() +  ": " + circle1.getArea());
		//Print the Diameter of circle2
		System.out.println("Diameter of circle with radius " + circle2.getRadius() +  ": " +circle2.getDiameter());
		//Print the Permimeter of circle3
		System.out.println("Perimeter of circle with radius " + circle3.getRadius() +  ": " +circle3.getPerimeter());
	}
}
