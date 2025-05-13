package act12;

import javax.swing.JOptionPane;


public class num2 {

	public static void main(String[] args) {
		
		
		new evaluation();
		
		
	}

}

class evaluation{
	
	int speed;
	
	evaluation(){
		
		int speed = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter speed of Automobile","Input",JOptionPane.QUESTION_MESSAGE));
		
		this.speed = speed;
		
		
		
		result();
		
		
	}
 void result() {

		if(speed<55&&speed>0) {
			
			JOptionPane.showMessageDialog(null,"Speed: "+speed+"\nDrive Safely!","Info",JOptionPane.INFORMATION_MESSAGE);
			
		}else if(speed<=60&&speed>=55){
			
			JOptionPane.showMessageDialog(null,"Speed: "+speed+"\nOverspeeding!!\nPenalty: 200","WARNING!",JOptionPane.WARNING_MESSAGE);
			
		}else if(speed<=70&&speed>=61){
			
			JOptionPane.showMessageDialog(null,"Speed: "+speed+"\nOverspeeding!!\nPenalty: 250","WARNING!",JOptionPane.WARNING_MESSAGE);
			
		}else if(speed<=71&&speed>=80){
			
			JOptionPane.showMessageDialog(null,"Speed: "+speed+"\nOverspeeding!!\nPenalty: 300","WARNING!",JOptionPane.WARNING_MESSAGE);
			
		}else if(speed<=120&&speed>80){
			
			JOptionPane.showMessageDialog(null,"Speed: "+speed+"\nOverspeeding!!\nPenalty: 300","WARNING!",JOptionPane.WARNING_MESSAGE);
			
		}else {
			
			JOptionPane.showMessageDialog(null,"Not a valid Speed","Info",JOptionPane.INFORMATION_MESSAGE);
		}
	 
	 
	 
	
		
	}
	
	
	
	
	
	
	
}
