package ACT6;
import java.util.Scanner;

public class Shape {

	
	
	public void SelectShape() {
		
		Shape Shape1 = new Shape();
		Shape C1 = new Circle();
		Shape R1 = new Rectangle();
		Shape T1 = new Triangle();
		
		int S = Shape1.InputShape();
		
		switch (S) {
		case 1:
			
			double AC = Circle.CalculateArea();
			System.out.println("\nArea of Rectangle: "+AC);
			break;
		case 2:
			double RA = Rectangle.CalculateArea();
			System.out.println("\nArea of Rectangle: "+RA);
			break;
		case 3:
			double AT = Triangle.CalculateArea();
			System.out.println("\nArea of Triangle: "+AT);
			
			break;
			
		default:
		
		System.out.println("\nInvalid Input.");
		
		}
		

		
	}
	
	public int InputShape() {
		Scanner input = new Scanner(System.in);
		System.out.println("1. Circle\n2. Rectangle\n3. Triangle ");
		System.out.print("\nInput Shape: ");
		int Shape = input.nextInt();
		
		return Shape;
		
		
	}

}
class Circle extends Shape{
	
	public static double CalculateArea() {
			
			System.out.println("\nSELECTED : CIRCLE");
			Scanner input = new Scanner(System.in);
			System.out.print("\nEnter Radius: ");
			double r = input.nextDouble();
			
			double AC = (Math.PI*(r*r));
			
			
			return AC;
			
	}
	
}
class Rectangle extends Shape{
		
	public static double CalculateArea() {
		
		System.out.println("\nSELECTED : RECTANGLE");
		Scanner input = new Scanner(System.in);
		System.out.print("\nInput Lenght: ");
		double l = input.nextDouble();
		System.out.print("\nInput Widht: ");
		double w = input.nextDouble();
		
		double R = l*w;
		
		return R;
		
	}
	
}
 class Triangle extends Shape{
	 
	
	
	
	 public static double CalculateArea() {

		 	System.out.println("\nSELECTED : TRIANGLE");
			Scanner input = new Scanner(System.in);
			System.out.print("\nInput Height: ");
			double h = input.nextDouble();
			System.out.print("\nInput base: ");
			double b = input.nextDouble();
			
			double AT = h*b*0.5;
			
			return AT;
		}
	
}