package act12;

import javax.swing.JOptionPane;

public class num1 {

	public static void main(String[] args) {
		
		new panel();
		
	}

}

class panel{
	
	panel(){
		
		Object[] choices = {"Dog","Cat","Bird","Fish"};
		
		String input = (String)JOptionPane.showInputDialog(null, "Choose your Favorite Pet", "Pet", 
				JOptionPane.QUESTION_MESSAGE, null, choices, choices[0]);
		
		JOptionPane.showMessageDialog(null, "Your Favorite Pet is "+input,"Info",JOptionPane.INFORMATION_MESSAGE);
		
		
		
		
		
	}
	
	
} 
