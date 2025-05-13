package act10;

import java.util.Scanner;


public class questions {
	
	 questions() {
		 Scanner input = new Scanner(System.in);
		 int score = 0;
			
		 String [] questions  = {"How many continents are there?",
				 "What is the summer Capital of Quezon?",
				 "The Capital of Quezon Province?",
				 "Brand of this laptop?",
				 "What IDE is used on this program?",
				 "How many students are in this class?",
				 "What brand of Processor this laptop has?",
				 "What programming languange is used in this activity? ",
				 "The third day of the week?",
				 "Name of Course?"};
		 String [] keyanswers = {"7",
				 "lucban",
				 "lucena",
				 "Acer",
				 "Eclipes",
				 "19",
				 "AMD",
				 "Java",
				 "Wednesday",
				 "Computer Engineering",};
		 
		 
		 
		 for(int i = 0;i<10;i++){
			 System.out.print("\nQuestion "+(i+1)+" : "+questions[i]);
			 String answer = input.next();
			 
			 checker o = new checker(questions[i], keyanswers[i]);
			 
			 if (o.checkAnswer(answer)) {
	                System.out.println("Correct!");
	                score++;
	            } else {
	            	
	                System.out.println("Incorrect! The correct answer is: " + o.getAnswer());
	            }
			 
			
		 }
		 System.out.println("\nQuiz complete! Your score is: " + score + "/10");
		 
	}
	 
class checker{
		    private String question;
		    private String answer;

		    public checker (String question, String answer) {
		        this.question = question;
		        this.answer = answer;
		    }

		    public String getQuestion() {
		        return question;
		    }

		    public boolean checkAnswer(String userAnswer) {
		        return answer.equalsIgnoreCase(userAnswer);
		    }

		    public String getAnswer() {
		        return answer;
		    }
		}
	
}
