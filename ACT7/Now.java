package ACT7;

public class Now {

	public static void main(String[] args) {
		
		System.out.println("\tCIRCLE");
		
		Shape circle = new Circle();
		System.out.println("Perimeter of the Triangle: " + circle.calculatePerimeters());
		System.out.println("Area of The Circle: "+	circle.calculateArea());



		System.out.println("\n\tTRIANGLE");
		Shape triangle = new Triangle();
		
		System.out.println("\nArea of the Triangle: "+ triangle.calculateArea());
		System.out.println("Perimeter of the Triangle: "+ triangle.calculatePerimeters());
		
	
		
		

	}

}
