package act13;

import javax.swing.*;
import java.awt.*;

public class main {

	public static void main(String[] args) {

		// Frame declaration
		JFrame frame = new JFrame();
		frame.setSize(820, 825);
		frame.setLocationRelativeTo(null);
		frame.setTitle("VALIDATION FORM");
		
		ImageIcon icon = new ImageIcon("/C://Users//Acer//Pictures//Screenshots//Screenshot 2024-05-08 212301.png");
		frame.setLayout(new GridLayout(2, 1));// Row, Column
		frame.setIconImage(icon.getImage());
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1st container
		JPanel container1 = new JPanel();
		container1.setLayout(new BorderLayout());

		// Panels for container1
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();

		// Panel Background for container1
		panel1.setBackground(Color.LIGHT_GRAY);
		panel2.setBackground(Color.LIGHT_GRAY);
		panel3.setBackground(Color.WHITE);
		panel4.setBackground(Color.LIGHT_GRAY);
		panel5.setBackground(Color.LIGHT_GRAY);
		

		// Panel sizes for container1   width,height
		panel1.setPreferredSize(new Dimension(100, 75));
		panel2.setPreferredSize(new Dimension(25, 100));
		panel3.setPreferredSize(new Dimension(100, 100));
		panel4.setPreferredSize(new Dimension(25, 100));
		panel5.setPreferredSize(new Dimension(100, 25));
			//-------------------------sub-panel-------------
			panel1.setLayout(new FlowLayout(FlowLayout.CENTER));
	
			// Create a new JLabel with your text
			JLabel headerLabel = new JLabel("VALIDATION");
	
			// Get the current font of the JLabel
			Font currentFont = headerLabel.getFont();
	
			// Create a new Font object 
			Font newFont = new Font(currentFont.getName(), Font.BOLD, 35);
	
			// Set the new font to the JLabel
			headerLabel.setFont(newFont);
			
			panel1.add(headerLabel);
			
			//-------------------------sub-panel-------------
		
		
			//-------------------------sub-panel-------------
				// panel3 layout
				panel3.setLayout(new BorderLayout());
				JPanel title1 = new JPanel();
				JLabel personal = new JLabel("PERSONAL INFORMATION");
				JPanel contents = new JPanel();
				
				// title settings upper
				title1.setBackground(Color.GRAY);
				title1.add(personal);
				
				// Dimensions settings width,height
				title1.setPreferredSize(new Dimension(100, 25));
				contents.setPreferredSize(new Dimension(100, 100));
				
						//-------------------------sub-sub-panel-------------
						
						//content settings
						contents.setLayout(new BorderLayout());
						
						//content settings
				        contents.setLayout(new GridLayout(0, 2, 5, 5)); 
	
				        //content labels and fields
				        JLabel usernameLabel = new JLabel("USERNAME:");
				        JTextField usernameField = new JTextField(15);
				        
				        JLabel passwordLabel = new JLabel("PASSWORD:");
				        JTextField passwordField = new JTextField(15);
				        
				        JLabel confirmPasswordLabel = new JLabel("CONFIRM PASSWORD:");
				        JTextField confirmPasswordField = new JTextField(15);
				        
				        JLabel nameLabel = new JLabel("NAME:");
				        JTextField nameField = new JTextField(15);
				        
				        JLabel ycsLabel = new JLabel("YEAR, COURSE, SECTION: ");
				        JPanel comboPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
				        
				          // combo box settings
				        String[] year = {"1", "2", "3", "4"};
				        String[] course = {"BSCE", "BSCPE", "BSECE", "BSEE"};
				        String[] section = {"GA", "GB", "GC", "GD", "GE", "GF", "GG", "GH"};
				        
				        JComboBox comboBox1 = new JComboBox(year);
				        JComboBox comboBox2 = new JComboBox(course);
				        JComboBox comboBox3 = new JComboBox(section);
				        comboPanel.add(comboBox1);
				        comboPanel.add(comboBox2);
				        comboPanel.add(comboBox3);
				        
				        // bday
				        JLabel bday = new JLabel("DATE OF BIRTH");
				        JTextField bdayField= new JTextField(15);
				        
				        // age
				        JLabel age = new JLabel("AGE: ");
				        JTextField ageField= new JTextField(15);
				        
				        //gender
				        JLabel genderLabel = new JLabel("GENDER:");
				        JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
				        
				       // radio settings
				        JRadioButton maleRadioButton = new JRadioButton("Male");
				        JRadioButton femaleRadioButton = new JRadioButton("Female");
				        JRadioButton LGBTQRadioButton = new JRadioButton("LGBTQ+");
				        JRadioButton notRadioButton = new JRadioButton("Prefer not say");
				        
				        ButtonGroup genderGroup = new ButtonGroup();
				        genderGroup.add(maleRadioButton);
				        genderGroup.add(femaleRadioButton);
				        genderGroup.add(LGBTQRadioButton);
				        genderGroup.add(notRadioButton);

				        genderPanel.add(maleRadioButton);
				        genderPanel.add(femaleRadioButton);
				        genderPanel.add(LGBTQRadioButton);
				        genderPanel.add(notRadioButton);
				        
				       
				        
				        // Add labels and fields to the contents panel
				        contents.add(usernameLabel);
				        contents.add(usernameField);
				        contents.add(passwordLabel);
				        contents.add(passwordField);
				        contents.add(confirmPasswordLabel);
				        contents.add(confirmPasswordField);
				        contents.add(nameLabel);
				        contents.add(nameField);
				        contents.add(ycsLabel);
				        contents.add(comboPanel);
				        contents.add(bday);
				        contents.add(bdayField);
				        contents.add(age);
				        contents.add(ageField);
				        contents.add(genderLabel);
				        contents.add(genderPanel);
				        
				       
						
						
					
						
						//-------------------------sub-panel-------------
					
				// Contents Added to panel3
				panel3.add(title1, BorderLayout.NORTH);
				panel3.add(contents, BorderLayout.CENTER);
				
			
			
			//-------------------------sub-panel-------------
			
		// 2nd container
		JPanel container2 = new JPanel();
		container2.setLayout(new BorderLayout());

		// Panels for container 2
		JPanel panel2_1 = new JPanel();
		JPanel panel2_2 = new JPanel();
		JPanel panel2_3 = new JPanel();
		JPanel panel2_4 = new JPanel();
		JPanel panel2_5 = new JPanel();

		// Panel Background
		panel2_1.setBackground(Color.LIGHT_GRAY);
		panel2_2.setBackground(Color.LIGHT_GRAY);
		panel2_3.setBackground(Color.WHITE);
		panel2_4.setBackground(Color.LIGHT_GRAY);
		panel2_5.setBackground(Color.LIGHT_GRAY);

		// Panel size     width,height
		panel2_1.setPreferredSize(new Dimension(100, 25));
		panel2_2.setPreferredSize(new Dimension(25, 100));
		panel2_3.setPreferredSize(new Dimension(100, 100));
		panel2_4.setPreferredSize(new Dimension(25, 100));
		panel2_5.setPreferredSize(new Dimension(100, 50));
		
			//-------------------------sub-panel-------------
		
				// Panel2_3 layout
				panel2_3.setLayout(new BorderLayout());
				JPanel title2_1 = new JPanel();
				JLabel info = new JLabel("ADDITIONAL INFO");
				JPanel contents2_1 = new JPanel();
				
				// Title settings lower
				title2_1.setBackground(Color.GRAY);
				title2_1.add(info);
			
				// Dimension for contents  width,height
				title2_1.setPreferredSize(new Dimension(100, 25));
				contents2_1.setPreferredSize(new Dimension(100, 100));
				
					//-------------------------sub-sub-panel-------------
					
					//content settings
					contents2_1.setLayout(new BorderLayout());
					
					//content settings
					contents2_1.setLayout(new GridLayout(0, 2, 5, 5)); 
	
			        //content labels and fields
			        JLabel citizenshipLabel = new JLabel("CITIZENSHIP:");
			        JTextField citizenshipField = new JTextField(15);
			        
			        JLabel religionLabel = new JLabel("RELIGION:");
			        JTextField religionField = new JTextField(15);
			        
			        JLabel contactLabel = new JLabel("CONTACT NUMBER:");
			        JTextField contactField = new JTextField(15);
			        
			        JLabel fatherLabel = new JLabel("FATHER'S NAME:");
			        JTextField fatherField = new JTextField(15);
			        
			        JLabel motherLabel = new JLabel("MOTHER'S NAME:");
			        JTextField motherField = new JTextField(15);
			       
			        JLabel mottoLabel = new JLabel("MOTTO:");
			        JTextArea mottoArea = new JTextArea(15,20);
			        
			        JLabel skillLabel = new JLabel("SKILLS:");
			        JTextArea skillArea = new JTextArea(15,20);
			        
			        JLabel seminarsLabel = new JLabel("SEMINARS ATTENDED:");
			        JTextArea seminarArea = new JTextArea(15,20);
			        
			        
			        
			        
			       
			       // add label and fields in the content
			        contents2_1.add(citizenshipLabel);
			        contents2_1.add(citizenshipField);
			        contents2_1.add(religionLabel);
			        contents2_1.add(religionField);
			        contents2_1.add(contactLabel);
			        contents2_1.add(contactField);
			        contents2_1.add(fatherLabel);
			        contents2_1.add(fatherField);
			        contents2_1.add(motherLabel);
			        contents2_1.add(motherField);
			        contents2_1.add(mottoLabel);
			        contents2_1.add(mottoArea);
			        contents2_1.add(mottoLabel);
			        contents2_1.add(mottoArea);
			        contents2_1.add(skillLabel);
			        contents2_1.add(skillArea);
			        contents2_1.add(seminarsLabel);
			        contents2_1.add(new JScrollPane(seminarArea));
			                
			        
					//-------------------------sub-sub-panel-------------
				
				// Contents Added to panel2_3
				panel2_3.add(title2_1, BorderLayout.NORTH);
				panel2_3.add(contents2_1, BorderLayout.CENTER);
					
				
					
			
			
			//-------------------------sub-panel-------------
				
		
		// Buttons
		
		
		panel2_5.setLayout(new FlowLayout(FlowLayout.CENTER));
		JButton submit = new JButton("CONFIRM");
		submit.setBackground(Color.GREEN);
		JButton reset = new JButton("RESET");
		reset.setBackground(Color.RED);
		JButton validate = new JButton("VALIDATE");
		validate.setBackground(Color.YELLOW);
		
		panel2_5.add(submit);
		panel2_5.add(reset);
		panel2_5.add(validate);

		// Panel added to container
		container1.add(panel1, BorderLayout.NORTH);
		container1.add(panel2, BorderLayout.EAST);
		container1.add(panel3, BorderLayout.CENTER);
		container1.add(panel4, BorderLayout.WEST);
		container1.add(panel5, BorderLayout.SOUTH);
		
		// Panel added to container
		container2.add(panel2_1, BorderLayout.NORTH);
		container2.add(panel2_2, BorderLayout.EAST);
		container2.add(panel2_3, BorderLayout.CENTER);
		container2.add(panel2_4, BorderLayout.WEST);
		container2.add(panel2_5, BorderLayout.SOUTH);

		// container added to frame
		frame.add(container1);
		frame.add(container2);

		// Frame visibility
		frame.setVisible(true);

	}

}
