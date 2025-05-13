package ACT7;

import java.util.Scanner;


abstract class Shape {
	abstract double calculateArea();
	abstract double calculatePerimeters();

}

class Circle extends Shape{
	
	double radius,Area,Perimeter;
	
	Circle(){
		
		
		Scanner input = new Scanner(System.in);
		System.out.print("Input Circle's Radius: ");
		
		radius = input.nextDouble();
		
		
	}
	
	double calculateArea() {
		
		Area =(radius*radius)*Math.PI;		
		return Area; 
		
	}
	double calculatePerimeters() {
		
		Perimeter = 2*Math.PI*radius;
		
	return Perimeter;
	}
		
}
class Triangle extends Shape{
	
	double S,Area,P,side1,side2,side3;
	
	Triangle(){
		
		Scanner input = new Scanner(System.in);
		double[] m = new double[3];
		
		for(int i=0;i<=2;i++) {
			System.out.print("Input triangle's Sides: ");
			 m[i] = input.nextDouble();
		}
		side1 = m[0];
		side2 = m[1];
		side3 = m[2];
		
		S = ((side1+side2+side3)/2);
		
	}
	
	double calculateArea() {
		
		
		Area = S*((S-side1)*(S-side2)*(S-side3));
		
		return Area;
		
	}
	
	double calculatePerimeters() {
		
		P = side1+side2+side3;
		
		return P;
	}
	
	
		

}

	
	