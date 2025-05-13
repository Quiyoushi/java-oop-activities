package act11;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class file {

	public static void main(String[] args) throws Exception {
		
		File stuff1 = new File("C:\\Users\\Acer\\Desktop\\stuff1.txt");
		
		if(stuff1.exists()) {
			
			System.out.println("File Already Exist");
			System.exit(0);
			
		}
	
		PrintWriter output = new PrintWriter(stuff1);
		Scanner input = new Scanner(System.in);
		
		System.out.print("Type Your Name: ");		
		output.println(input.next());
		System.out.print("Your Age: ");
		output.println(input.next());
		
		input.close();
		output.close();
		
		File stuff2 = new File("C:\\Users\\Acer\\Desktop\\stuff2.txt");
		
		Scanner input1 = new Scanner(stuff1);
		
		PrintWriter output1 = new PrintWriter(stuff2);
		

		do {
			
		output1.println(input1.next());
		
		}while(input1.hasNext());
		
		output1.close();
		
		input1.close();
		
		
		System.out.println("File Created\nSee Stuff 2 for the output.");
		
		
		
		

	}

}
