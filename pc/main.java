package pc;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score = 0;

      
        Question[] questions = {
                new Question("What is the capital of France?", "Paris"),
                new Question("What is the largest planet in our solar system?", "Jupiter"),
                new Question("How many continents are there?", "7"),
                new Question("What is the chemical symbol for water?", "H2O"),
                new Question("What is the process of converting food into energy called?", "Metabolism"),
                new Question("Which programming language is known for its platform independence?", "Java"),
                new Question("Who wrote 'Romeo and Juliet'?", "Shakespeare"),
                new Question("Which ocean is the largest?", "Pacific"),
                new Question("What is the powerhouse of the cell?", "Mitochondria"),
                new Question("What is the square root of 64?", "8")
        };

        
        for (Question q : questions) {
            System.out.println(q.getQuestion());
            
            String answer = input.nextLine();
            
            if (q.checkAnswer(answer)) {
                System.out.println("Correct!");
                score++;
            } else {
            	
                System.out.println("Incorrect! The correct answer is: " + q.getAnswer());
            }
        }

        System.out.println("Quiz complete! Your score is: " + score + "/10");
    }
}
