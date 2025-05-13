package project_finals;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main {

	public static void main(String[] args) {
		new Frame();
	}
}

class Frame extends JFrame {

	JFrame frame;
	JPanel mainPanel;
	CardLayout cardLayout;
	JButton start, options, instructions, credits, exit;
	JMenu mainMenu;

	JPanel menuPanel, startPanel, optionPanel, instructionPanel, creditsPanel;

	Frame() {
		// for adding the main panel/frame
		addFrame();
		addMainPanel();

		// menu panel
		addMenuPanel();

		// start panel
		addStartPanel();

		// options panel
		addOptionPanel();

		// instructions panel
		addInstructionsPanel();

		// credits panel
		addCreditsPanel();

		// frame visibility
		frame.setVisible(true);
	}

	// frame settings
	void addFrame() {
		frame = this;
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1520, 820);
		frame.setLocationRelativeTo(null);
		frame.setTitle("Notepad");
	}

	// panel settings
	void addMainPanel() {
		cardLayout = new CardLayout();
		mainPanel = new JPanel(cardLayout);
		frame.add(mainPanel);
	}

	// menu panel settings
	void addMenuPanel() {
		// Create a custom JPanel for the background
		menuPanel = new JPanel(new GridBagLayout()) {
			private static final long serialVersionUID = 1L;

			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				ImageIcon backgroundImage = new ImageIcon("C:/Users/Acer/Pictures/Saved Pictures/Untitled.png");
				Image img = backgroundImage.getImage();
				g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
			}
		};

		menuPanel.setOpaque(false);

		// Create title label
		JLabel titleLabel = new JLabel("Main Menu", SwingConstants.CENTER);
		titleLabel.setFont(new Font("Arial", Font.BOLD, 36));

		// for buttons
		Dimension buttonSize = new Dimension(200, 50);

		// button list
		start = new JButton("Start");
		options = new JButton("Options");
		instructions = new JButton("Instructions");
		credits = new JButton("Credits");
		exit = new JButton("Exit");

		// Set preferred size for all buttons
		start.setPreferredSize(buttonSize);
		options.setPreferredSize(buttonSize);
		instructions.setPreferredSize(buttonSize);
		credits.setPreferredSize(buttonSize);
		exit.setPreferredSize(buttonSize);

		// Remove focus from buttons
		start.setFocusable(false);
		options.setFocusable(false);
		instructions.setFocusable(false);
		credits.setFocusable(false);
		exit.setFocusable(false);

		// lay-out for the components
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(10, 10, 10, 10);
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.anchor = GridBagConstraints.CENTER;

		// Add title label to the panel
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		menuPanel.add(titleLabel, gbc);

		// for buttons
		gbc.gridwidth = 1;
		gbc.gridy = GridBagConstraints.RELATIVE;

		// Add buttons to the panel
		menuPanel.add(start, gbc);
		menuPanel.add(options, gbc);
		menuPanel.add(instructions, gbc);
		menuPanel.add(credits, gbc);
		menuPanel.add(exit, gbc);

		mainPanel.add(menuPanel, "Menu");

		// add action listener to the start
		start.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(mainPanel, "Start");
			}
		});

		// add action listener to the options
		options.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(mainPanel, "Options");
			}
		});

		// add action listener to the instructions
		instructions.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(mainPanel, "Instructions");
			}
		});

		// add action listener to the credits
		credits.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(mainPanel, "Credits");
			}
		});

		// add action listener to the exit
		exit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}

	void addStartPanel() {
		// Start panel settings
		startPanel = new JPanel(new BorderLayout());

		// The label for the start panel content
		ImageIcon originalIcon = new ImageIcon("C:/Users/Acer/Desktop/icons/lucban.png");
		Image resizedImage = originalIcon.getImage().getScaledInstance(1000, 1000, Image.SCALE_SMOOTH);
		ImageIcon resizedIcon = new ImageIcon(resizedImage);
		JLabel imageLabel = new JLabel(resizedIcon);

		// Create a JLayeredPane
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setPreferredSize(new Dimension(1000, 1000));

		// Add the image label as the bottom layer
		imageLabel.setBounds(300, 5, 1000, 850);

		layeredPane.add(imageLabel, JLayeredPane.DEFAULT_LAYER);

		// Create buttons
		JButton button1 = new JButton("NALUNAO");
		button1.setBounds(600, 150, 100, 50); // Position the button at (100, 100)
		button1.setContentAreaFilled(false);
		button1.setBorderPainted(false);
		button1.setPreferredSize(new Dimension(100, 50));
		button1.setFocusable(false);
		button1.addActionListener(new evaluate(button1.getText()));
		layeredPane.add(button1, JLayeredPane.PALETTE_LAYER);

		JButton button2 = new JButton("KALYAAT");
		button2.setBounds(550, 200, 100, 50); // Position the button at (100, 100)
		button2.setContentAreaFilled(false);
		button2.setBorderPainted(false);
		button2.setPreferredSize(new Dimension(100, 50));
		button2.setFocusable(false);
		button2.addActionListener(new evaluate(button2.getText()));
		layeredPane.add(button2, JLayeredPane.PALETTE_LAYER);

		JButton button3 = new JButton("IGANG");
		button3.setBounds(525, 250, 100, 50); // Position the button at (100, 100)
		button3.setContentAreaFilled(false);
		button3.setBorderPainted(false);
		button3.setPreferredSize(new Dimension(100, 50));
		button3.setFocusable(false);
		button3.addActionListener(new evaluate(button3.getText()));
		layeredPane.add(button3, JLayeredPane.PALETTE_LAYER);
		
	    
		JButton button4 = new JButton("SAMIL");
		button4.setBounds(525, 325, 100, 50); // Position the button at (100, 100)
		button4.setContentAreaFilled(false);
		button4.setBorderPainted(false);
		button4.setPreferredSize(new Dimension(100, 50));
		button4.setFocusable(false);
		button4.addActionListener(new evaluate(button4.getText()));
		layeredPane.add(button4, JLayeredPane.PALETTE_LAYER);

		JButton button5 = new JButton("MBSC NATIONAL PARK");
		button5.setBounds(525, 450, 100, 50); // Position the button at (100, 100)
		button5.setContentAreaFilled(false);
		button5.setBorderPainted(false);
		button5.setPreferredSize(new Dimension(100, 50));
		button5.setFocusable(false);
		button5.addActionListener(new evaluate(button5.getText()));
		layeredPane.add(button5, JLayeredPane.PALETTE_LAYER);

		JButton button6 = new JButton("KALAYAAN");
		button6.setBounds(660, 175, 100, 50); // Position the button at (100, 100)
		button6.setContentAreaFilled(false);
		button6.setBorderPainted(false);
		button6.setPreferredSize(new Dimension(100, 50));
		button6.setFocusable(false);
		button6.addActionListener(new evaluate(button6.getText()));
		layeredPane.add(button6, JLayeredPane.PALETTE_LAYER);

		JButton button7 = new JButton("ALILIW");
		button7.setBounds(685, 245, 100, 50); // Position the button at (100, 100)
		button7.setContentAreaFilled(false);
		button7.setBorderPainted(false);
		button7.setPreferredSize(new Dimension(100, 50));
		button7.setFocusable(false);
		button7.addActionListener(new evaluate(button7.getText()));
		layeredPane.add(button7, JLayeredPane.PALETTE_LAYER);

		JButton button8 = new JButton("ABANG");
		button8.setBounds(670, 275, 100, 50); // Position the button at (100, 100)
		button8.setContentAreaFilled(false);
		button8.setBorderPainted(false);
		button8.setPreferredSize(new Dimension(100, 50));
		button8.setFocusable(false);
		button8.addActionListener(new evaluate(button8.getText()));
		layeredPane.add(button8, JLayeredPane.PALETTE_LAYER);

		JButton button9 = new JButton("AYUTI");
		button9.setBounds(630, 320, 100, 50); // Position the button at (100, 100)
		button9.setContentAreaFilled(false);
		button9.setBorderPainted(false);
		button9.setPreferredSize(new Dimension(100, 50));
		button9.setFocusable(false);
		button9.addActionListener(new evaluate(button9.getText()));
		layeredPane.add(button9, JLayeredPane.PALETTE_LAYER);

		JButton button10 = new JButton("POBLACION");
		button10.setBounds(675, 340, 100, 50); // Position the button at (100, 100)
		button10.setContentAreaFilled(false);
		button10.setBorderPainted(false);
		button10.setPreferredSize(new Dimension(100, 50));
		button10.setFocusable(false);
		button10.addActionListener(new evaluate(button10.getText()));
		layeredPane.add(button10, JLayeredPane.PALETTE_LAYER);

		JButton button11 = new JButton("PALOLA");
		button11.setBounds(665, 445, 100, 50); // Position the button at (100, 100)
		button11.setContentAreaFilled(false);
		button11.setBorderPainted(false);
		button11.setPreferredSize(new Dimension(100, 50));
		button11.setFocusable(false);
		button11.addActionListener(new evaluate(button11.getText()));
		layeredPane.add(button11, JLayeredPane.PALETTE_LAYER);

		JButton button12 = new JButton("M.PARANG");
		button12.setBounds(745, 200, 100, 50); // Position the button at (100, 100)
		button12.setContentAreaFilled(false);
		button12.setBorderPainted(false);
		button12.setPreferredSize(new Dimension(100, 50));
		button12.setFocusable(false);
		button12.addActionListener(new evaluate(button12.getText()));
		layeredPane.add(button12, JLayeredPane.PALETTE_LAYER);

		JButton button13 = new JButton("KABATETE");
		button13.setBounds(770, 240, 100, 50); // Position the button at (100, 100)
		button13.setContentAreaFilled(false);
		button13.setBorderPainted(false);
		button13.setPreferredSize(new Dimension(100, 50));
		button13.setFocusable(false);
		button13.addActionListener(new evaluate(button13.getText()));
		layeredPane.add(button13, JLayeredPane.PALETTE_LAYER);

		JButton button14 = new JButton("KILIB");
		button14.setBounds(770, 275, 100, 50); // Position the button at (100, 100)
		button14.setContentAreaFilled(false);
		button14.setBorderPainted(false);
		button14.setPreferredSize(new Dimension(100, 50));
		button14.setFocusable(false);
		button14.addActionListener(new evaluate(button14.getText()));
		layeredPane.add(button14, JLayeredPane.PALETTE_LAYER);

		JButton button15 = new JButton("KULAPI");
		button15.setBounds(750, 330, 100, 50); // Position the button at (100, 100)
		button15.setContentAreaFilled(false);
		button15.setBorderPainted(false);
		button15.setPreferredSize(new Dimension(100, 50));
		button15.setFocusable(false);
		button15.addActionListener(new evaluate(button15.getText()));
		layeredPane.add(button15, JLayeredPane.PALETTE_LAYER);

		JButton button16 = new JButton("TINAMNAN");
		button16.setBounds(725, 400, 100, 50); // Position the button at (100, 100)
		button16.setContentAreaFilled(false);
		button16.setBorderPainted(false);
		button16.setPreferredSize(new Dimension(100, 50));
		button16.setFocusable(false);
		button16.addActionListener(new evaluate(button16.getText()));
		layeredPane.add(button16, JLayeredPane.PALETTE_LAYER);

		JButton button17 = new JButton("PIIS");
		button17.setBounds(860, 220, 100, 50); // Position the button at (100, 100)
		button17.setContentAreaFilled(false);
		button17.setBorderPainted(false);
		button17.setPreferredSize(new Dimension(100, 50));
		button17.setFocusable(false);
		button17.addActionListener(new evaluate(button17.getText()));
		layeredPane.add(button17, JLayeredPane.PALETTE_LAYER);

		JButton button24 = new JButton("MANASA");
		button24.setBounds(740, 490, 100, 50); // Position the button at (100, 100)
		button24.setContentAreaFilled(false);
		button24.setBorderPainted(false);
		button24.setPreferredSize(new Dimension(100, 50));
		button24.setFocusable(false);
		button24.addActionListener(new evaluate(button24.getText()));
		layeredPane.add(button24, JLayeredPane.PALETTE_LAYER);

		JButton button18 = new JButton("ADOLINAO");
		button18.setBounds(900, 300, 100, 50); // Position the button at (100, 100)
		button18.setContentAreaFilled(false);
		button18.setBorderPainted(false);
		button18.setPreferredSize(new Dimension(100, 50));
		button18.setFocusable(false);
		button18.addActionListener(new evaluate(button18.getText()));
		layeredPane.add(button18, JLayeredPane.PALETTE_LAYER);

		JButton button19 = new JButton("KAKAWIT");
		button19.setBounds(860, 330, 100, 50); // Position the button at (100, 100)
		button19.setContentAreaFilled(false);
		button19.setBorderPainted(false);
		button19.setPreferredSize(new Dimension(100, 50));
		button19.setFocusable(false);
		button19.addActionListener(new evaluate(button19.getText()));
		layeredPane.add(button19, JLayeredPane.PALETTE_LAYER);

		JButton button20 = new JButton("MALUPAK");
		button20.setBounds(820, 375, 100, 50); // Position the button at (100, 100)
		button20.setContentAreaFilled(false);
		button20.setBorderPainted(false);
		button20.setPreferredSize(new Dimension(100, 50));
		button20.setFocusable(false);
		button20.addActionListener(new evaluate(button20.getText()));
		layeredPane.add(button20, JLayeredPane.PALETTE_LAYER);

		JButton button21 = new JButton("TIAWE");
		button21.setBounds(850, 450, 100, 50); // Position the button at (100, 100)
		button21.setContentAreaFilled(false);
		button21.setBorderPainted(false);
		button21.setPreferredSize(new Dimension(100, 50));
		button21.setFocusable(false);
		button21.addActionListener(new evaluate(button21.getText()));
		layeredPane.add(button21, JLayeredPane.PALETTE_LAYER);

		JButton button22 = new JButton("MAY-IT");
		button22.setBounds(815, 500, 100, 50); // Position the button at (100, 100)
		button22.setContentAreaFilled(false);
		button22.setBorderPainted(false);
		button22.setPreferredSize(new Dimension(100, 50));
		button22.setFocusable(false);
		button22.addActionListener(new evaluate(button22.getText()));
		layeredPane.add(button22, JLayeredPane.PALETTE_LAYER);

		JButton button23 = new JButton("NAGSINAMO");
		button23.setBounds(1000, 400, 100, 50); // Position the button at (100, 100)
		button23.setContentAreaFilled(false);
		button23.setBorderPainted(false);
		button23.setPreferredSize(new Dimension(100, 50));
		button23.setFocusable(false);
		button23.addActionListener(new evaluate(button23.getText()));
		layeredPane.add(button23, JLayeredPane.PALETTE_LAYER);

		//
		JPanel titleCard = new JPanel();
		JLabel title = new JLabel("MAP OF LUCBAN ");
		title.setFont(new Font("Arial", Font.BOLD, 36));
		titleCard.setBackground(Color.LIGHT_GRAY);
		titleCard.add(title);

		// Add the layeredPane to the start panel
		startPanel.add(layeredPane, BorderLayout.CENTER);
		startPanel.add(titleCard, BorderLayout.SOUTH);

		// Add JMenu to the start panel
		addJMenu();

		// Add the start panel to the main panel
		mainPanel.add(startPanel, "Start");
	}

	void addJMenu() {
		// Create the menu bar
		JMenuBar menuBar = new JMenuBar();

		// Create the menus
		JMenu Navigation = new JMenu("Navigation");
		JMenu helpMenu = new JMenu("Help");

		// Create menu items for File menu
		JMenuItem refMenuItem = new JMenuItem("Refresh");
		JMenuItem credMenuItem = new JMenuItem("Credits");
		JMenuItem insMenuItem = new JMenuItem("Instructions");
		JMenuItem exitMenuItem = new JMenuItem("Exit");
		JMenuItem backMenuItem = new JMenuItem("Back");

		// Add menu items to File menu
		Navigation.add(refMenuItem);
		Navigation.add(credMenuItem);
		Navigation.add(insMenuItem);
		Navigation.addSeparator();
		Navigation.add(backMenuItem);
		Navigation.add(exitMenuItem);

		// Create menu items for Help menu
		JMenuItem aboutMenuItem = new JMenuItem("About");

		// Add menu items to Help menu
		helpMenu.add(aboutMenuItem);

		// Add menus to menu bar
		menuBar.add(Navigation);
		menuBar.add(helpMenu);

		// Set the menu bar for the start panel
		startPanel.add(menuBar, BorderLayout.NORTH);

		// Action listeners for menu items
		credMenuItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(mainPanel, "Credits");
			}
		});

		insMenuItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(mainPanel, "Instructions");
			}
		});

		credMenuItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(mainPanel, "Credits");
			}
		});

		backMenuItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(mainPanel, "Menu");
			}
		});

		exitMenuItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

	
	}

	void addOptionPanel() {
		optionPanel = new JPanel();
		optionPanel.setLayout(new BorderLayout());

		// Create the back button
		JButton backButton = new JButton("Back");
		backButton.setContentAreaFilled(false);
		backButton.setBorderPainted(false);
		backButton.setPreferredSize(new Dimension(100, 50));
		backButton.setFocusable(false);

		// for the back button
		JPanel backButtonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		backButtonPanel.add(backButton);
		optionPanel.add(backButtonPanel, BorderLayout.NORTH);
		

				
		JPanel settingsPanel =new JPanel(new BorderLayout());
		JPanel settingsContainer =new JPanel(new GridLayout(0,1));
		
		settingsContainer.setPreferredSize(new Dimension(640, 480));
		JSlider slider = new JSlider();

		settingsContainer.add(slider);
		
		settingsPanel.add(settingsContainer,BorderLayout.CENTER);
 
		optionPanel.add(settingsPanel, BorderLayout.CENTER);

		// listener to the back button
		backButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(mainPanel, "Menu");
			}
		});

		// start panel to the main panel
		mainPanel.add(optionPanel, "Options");
	}

	void addInstructionsPanel() {
		instructionPanel = new JPanel();
		instructionPanel.setLayout(new BorderLayout());

		// the label for the instruction
		JLabel instructionsLabel = new JLabel("Instructions", SwingConstants.CENTER);
		instructionsLabel.setFont(new Font("Arial", Font.BOLD, 24));
		instructionPanel.add(instructionsLabel, BorderLayout.CENTER);

		// for back button
		JButton backButton = new JButton("Back");
		backButton.setContentAreaFilled(false);
		backButton.setBorderPainted(false);
		backButton.setPreferredSize(new Dimension(100, 50));
		backButton.setFocusable(false);

		// for the back settings
		JPanel backButtonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		backButtonPanel.add(backButton);
		instructionPanel.add(backButtonPanel, BorderLayout.NORTH);

		// action listener to the back button
		backButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(mainPanel, "Menu");
			}
		});

		// Add the main panel
		mainPanel.add(instructionPanel, "Instructions");
	}

	void addCreditsPanel() {
		creditsPanel = new JPanel();
		creditsPanel.setLayout(new BorderLayout());

		// label for the credits panel
		JLabel creditsLabel = new JLabel("Credits", SwingConstants.CENTER);
		creditsLabel.setFont(new Font("Arial", Font.BOLD, 24));
		creditsPanel.add(creditsLabel, BorderLayout.CENTER);

		// back button
		JButton backButton = new JButton("Back");
		backButton.setContentAreaFilled(false);
		backButton.setBorderPainted(false);
		backButton.setPreferredSize(new Dimension(100, 50));
		backButton.setFocusable(false);

		// back button settings
		JPanel backButtonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		backButtonPanel.add(backButton);
		creditsPanel.add(backButtonPanel, BorderLayout.NORTH);

		// Add action listener to the back button
		backButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(mainPanel, "Menu");
			}
		});

		// to the main panel
		mainPanel.add(creditsPanel, "Credits");
	}
}
