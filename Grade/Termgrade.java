package Grade;

import java.util.Scanner;

class Termgrade {
		
		private double PerformanceOutput;
		private double Participation;
		private double quizzes;
		private double exam;
		private double PerformanceOutput_T;
		private double Participation_T;
		private double quizzes_T;
		private double exam_T;
		
		void InputGrade(){
			
			Scanner input = new Scanner(System.in);
			
			System.out.print("Enter Performance Score: ");
			PerformanceOutput = input.nextDouble();
			System.out.print("Enter Total Performance Items: ");
			PerformanceOutput_T = input.nextDouble();
			
			System.out.print("Enter Participation Score: ");
			Participation = input.nextDouble();
			System.out.print("Enter Total Participation Items: ");
			Participation_T = input.nextDouble();
			
			System.out.print("Enter Quiz Score:");
			quizzes = input.nextDouble();
			System.out.print("Enter Total Quiz Items: ");
			quizzes_T = input.nextDouble();
			
			System.out.print("Enter Exam Score:");
			exam = input.nextDouble();
			System.out.print("Enter Total Exam Items: ");
			exam_T = input.nextDouble();
			

			
			CalculateGrade();
			
		}
		public double Calculate(){
			double RawScore = (((PerformanceOutput/PerformanceOutput_T)*100)*.40)+(((Participation/Participation_T)*100)*.15)+(((quizzes/quizzes_T)*100)*.15)+(((exam/exam_T)*100)*.30);
			
			return RawScore;
		}
		void CalculateGrade(){
			
			double Computed_Grade = Calculate()*.625 + 37.5 ;
			
			if (Computed_Grade>=75){
				System.out.println("\nTerm Grade: "+Computed_Grade+" PASSED");
				
			}else if(Computed_Grade<75){
				System.out.println("\nTerm Grade: "+Computed_Grade+" FAILED");
				
			}else
				System.out.println("Error Please Re-Input The grades.");
			
			
			
		}
}
class termgarde{
	
	
}