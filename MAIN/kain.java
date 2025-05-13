package MAIN;

import java.util.Scanner;

public class kain {

public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("\nInput Name: ");
	String S_Name = input.next();
	
	
	System.out.print("\nInput Roll_no: ");
	int R_No = input.nextInt();
	
	System.out.print("\nInput Percentage: ");
	double percentage = input.nextDouble();
	
	System.out.print("\nInput Total: ");
	double total = input.nextDouble();
	
	
	double[] m = new double[3];
	
	
	for(int i = 0; i<3 ; i++) {
		
		System.out.print("\nEnter your Marks :" );
		 m[i] = input.nextDouble();
		 
		
	}
	
	 double m1 = m[0];
	 double m2 = m[1];
	 double m3 = m[2];
	 
	
	 
	marks newMarks = new marks(m1,m2,m3,total,percentage);
	
	student newStudent = new student();
	newStudent.student_info(S_Name,R_No);
	
	System.out.println("\nStudent Name: "+newStudent.name+"\nRoll number: "+newStudent.roll_no+
			"\nm1: "+newMarks.m1+"\nm2: "+newMarks.m2+"\nm3: "+newMarks.m3+"\nTotal: "+newMarks.total+"\nPercentage: "+newMarks.percentage);
	
	

	
	
			
	}

}

