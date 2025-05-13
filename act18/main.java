package act18;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class main {

	public static void main(String[] args) {

		new colorsMain();

	}

}

class colorsMain extends JFrame implements ActionListener {

	JFrame frame;
	JPanel section, colorPane;
	JToggleButton red, green, blue;
	Color Color,currentColor;

	colorsMain() {

		addFrame();
		addPanels();
		addButtons();
		addColorPane();
		frame.setVisible(true);
	}

	void addFrame() {

		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 500);
		frame.setLocationRelativeTo(null);
		frame.setTitle("Jtoggle Exercise");

	}

	void addPanels() {

		section = new JPanel();
		section.setLayout(null);
		section.setBounds(50, 50, 700, 500); // x, y, width, height
		frame.setLayout(null);
		frame.add(section);
	}

	void addButtons() {

		red = new JToggleButton("Red");
		green = new JToggleButton("Green");
		blue = new JToggleButton("Blue");

		red.setBounds(50, 50, 100, 50); // x, y, width, height
		green.setBounds(50, 150, 100, 50); // x, y, width, height
		blue.setBounds(50, 250, 100, 50); // x, y, width, height

		red.addActionListener(this);
		green.addActionListener(this);
		blue.addActionListener(this);

		red.setFocusPainted(false);
		green.setFocusPainted(false);
		blue.setFocusPainted(false);

		section.add(red);
		section.add(green);
		section.add(blue);

	}

	void addColorPane() {

		colorPane = new JPanel();
		colorPane.setLayout(null);
		colorPane.setBounds(250, 25, 300, 300); // x, y, width, height
		colorPane.setBackground(Color.BLACK);
		section.add(colorPane);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		 currentColor = colorPane.getBackground();
	        int red = currentColor.getRed();
	        int green = currentColor.getGreen();
	        int blue = currentColor.getBlue();
		
		if(e.getActionCommand() == "Red") {
			if (red == 0) {
				red = 255;
			}
			else {
				red = 0;
			}
		}
		else if(e.getActionCommand() == "Green") {
			if (green == 0) {
				green = 255;
			}
			else {
				green = 0;
			}
		}
		else {
			if (blue == 0) {
				blue = 255;
			}
			else {
				blue = 0;
			}
		}
		
		Color = new Color(red, green, blue);
		colorPane.setBackground(Color);

	}
}
