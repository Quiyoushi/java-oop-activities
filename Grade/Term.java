package Grade;


public class Term {

	public static void main(String[] args) { 
		
	System.out.println("\n\t\tPRELIMINARY GRADES");
	Termgrade Term_score_Prelims = new Termgrade();
	Term_score_Prelims.InputGrade();
	
	System.out.println("\n\t\tMIDTERM GRADES");
	Termgrade Term_score_Midterm = new Termgrade();
	Term_score_Midterm.InputGrade();
	
	System.out.println("\n\t\tFINALS GRADES");
	Termgrade Term_score_Finals = new Termgrade();
	Term_score_Finals.InputGrade();
	 
	}
}
			
		
	

