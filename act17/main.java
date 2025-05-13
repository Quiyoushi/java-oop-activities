package act17;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class main {

	public static void main(String[] args) throws Exception {

		// frame declaration
		JFrame frame = new JFrame();
		frame.setLayout(new BorderLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(720, 525);
		frame.setLocationRelativeTo(null);
		frame.setTitle("Calculator");

		// panel declarations
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();

		// panel settings
		panel1.setBackground(null);
		panel2.setBackground(Color.LIGHT_GRAY);
		panel1.setPreferredSize(new Dimension(100, 100));
		panel2.setPreferredSize(new Dimension(100, 100));

		// panel1 contents
		panel1.setLayout(new BorderLayout());
		JTextArea mainArea = new JTextArea(100, 100);
		 mainArea.setEditable(false); // Make the text area non-editable
	     mainArea.setFont(new Font("Arial", Font.PLAIN, 30)); // Set font size


		panel1.add(mainArea, BorderLayout.CENTER);

		// panel2 contents
		panel2.setLayout(new BorderLayout());

		// operations panel
		JPanel operationsPanel = new JPanel();
		operationsPanel.setPreferredSize(new Dimension(100, 100));// width height
		operationsPanel.setBackground(Color.WHITE);

		operationsPanel.setLayout(new GridLayout(3, 0, 5, 3));
		JButton sinButton = new JButton("SIN");
		sinButton.setBackground(Color.LIGHT_GRAY);
		sinButton.setForeground(Color.BLACK);

		JButton cosButton = new JButton("COS");
		cosButton.setBackground(Color.LIGHT_GRAY);
		cosButton.setForeground(Color.BLACK);

		JButton tanButton = new JButton("TAN");
		tanButton.setBackground(Color.LIGHT_GRAY);
		tanButton.setForeground(Color.BLACK);

		JButton asinButton = new JButton("ArcSIN");
		asinButton.setBackground(Color.LIGHT_GRAY);
		asinButton.setForeground(Color.BLACK);

		JButton acosButton = new JButton("ArcCOS");
		acosButton.setBackground(Color.LIGHT_GRAY);
		acosButton.setForeground(Color.BLACK);

		JButton atanButton = new JButton("ArcTAN");
		atanButton.setBackground(Color.LIGHT_GRAY);
		atanButton.setForeground(Color.BLACK);

		JButton opButton = new JButton("(");
		opButton.setBackground(Color.LIGHT_GRAY);
		opButton.setForeground(Color.BLACK);

		JButton delButton = new JButton("DEL");
		delButton.setBackground(Color.LIGHT_GRAY);
		delButton.setForeground(Color.BLACK);

		JButton clButton = new JButton(")");
		clButton.setBackground(Color.LIGHT_GRAY);
		clButton.setForeground(Color.BLACK);

		// buttons added to operations panel
		operationsPanel.add(sinButton);
		operationsPanel.add(cosButton);
		operationsPanel.add(tanButton);
		operationsPanel.add(asinButton);
		operationsPanel.add(acosButton);
		operationsPanel.add(atanButton);
		operationsPanel.add(opButton);
		operationsPanel.add(clButton);
		operationsPanel.add(delButton);

		// Numbers panel
		JPanel digitPanel = new JPanel();
		digitPanel.setLayout(new GridLayout(4, 3, 5, 5));

		JButton[] digitButtons = new JButton[10];
		for (int i = 1; i <= 9; i++) {
			digitButtons[i] = new JButton(Integer.toString(i));
			digitButtons[i].setBackground(Color.LIGHT_GRAY);
			digitButtons[i].setForeground(Color.BLACK);
			digitPanel.add(digitButtons[i]);
		}

		JButton eqButton = new JButton("=");
		eqButton.setBackground(Color.LIGHT_GRAY);
		eqButton.setForeground(Color.BLACK);

		JButton zeroButton = new JButton("0");
		zeroButton.setBackground(Color.LIGHT_GRAY);
		zeroButton.setForeground(Color.BLACK);

		JButton clrButton = new JButton("CLR");
		clrButton.setBackground(Color.LIGHT_GRAY);
		clrButton.setForeground(Color.BLACK);

		digitPanel.add(eqButton);
		digitPanel.add(zeroButton);
		digitPanel.add(clrButton);

		// operations panel
		JPanel functionPanel = new JPanel();
		functionPanel.setLayout(new GridLayout(0, 1, 5, 5));
		functionPanel.setPreferredSize(new Dimension(100, 100));

		JButton plusButton = new JButton("+");
		plusButton.setBackground(Color.LIGHT_GRAY);
		plusButton.setForeground(Color.BLACK);

		JButton minusButton = new JButton("-");
		minusButton.setBackground(Color.LIGHT_GRAY);
		minusButton.setForeground(Color.BLACK);

		JButton divideButton = new JButton("÷");
		divideButton.setBackground(Color.LIGHT_GRAY);
		divideButton.setForeground(Color.BLACK);

		JButton multiplyButton = new JButton("×");
		multiplyButton.setBackground(Color.LIGHT_GRAY);
		multiplyButton.setForeground(Color.BLACK);

		// functions added to panel functions
		functionPanel.add(plusButton);
		functionPanel.add(minusButton);
		functionPanel.add(divideButton);
		functionPanel.add(multiplyButton);

		// panel2 additions
		panel2.add(operationsPanel, BorderLayout.NORTH);
		panel2.add(digitPanel, BorderLayout.CENTER);
		panel2.add(functionPanel, BorderLayout.EAST);

		// panel added to frame
		frame.add(panel1, BorderLayout.NORTH);
		frame.add(panel2, BorderLayout.CENTER);

		// Add Action Listeners
		ButtonClickListener listener = new ButtonClickListener(mainArea);

		// Add listeners to digit buttons
		for (int i = 1; i <= 9; i++) {
			digitButtons[i].addActionListener(listener);
		}
		zeroButton.addActionListener(listener);
		eqButton.addActionListener(listener);
		clrButton.addActionListener(listener);

		// Add listeners to function buttons
		sinButton.addActionListener(listener);
		cosButton.addActionListener(listener);
		tanButton.addActionListener(listener);
		asinButton.addActionListener(listener);
		acosButton.addActionListener(listener);
		atanButton.addActionListener(listener);
		opButton.addActionListener(listener);
		clButton.addActionListener(listener);
		delButton.addActionListener(listener);
		plusButton.addActionListener(listener);
		minusButton.addActionListener(listener);
		divideButton.addActionListener(listener);
		multiplyButton.addActionListener(listener);

		// frame visibility
		frame.setVisible(true);

	}


    static class ButtonClickListener implements ActionListener {

        JTextArea mainArea;
        StringBuilder currentExpression;
        String firstOperand = "";
        String secondOperand = "";
        String operator = "";
        boolean isSecondOperand = false;

        public ButtonClickListener(JTextArea mainArea) {
            this.mainArea = mainArea;
            this.currentExpression = new StringBuilder();
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            switch (command) {
                case "SIN":
                case "COS":
                case "TAN":
                case "ArcSIN":
                case "ArcCOS":
                case "ArcTAN":
                    operator = command;
                    isSecondOperand = true;
                    currentExpression.append(" " + operator + " ");
                    mainArea.setText(currentExpression.toString());
                    break;
                case "+":
                case "-":
                case "×":
                case "÷":
                    operator = command;
                    isSecondOperand = true;
                    currentExpression.append(" " + operator + " ");
                    mainArea.setText(currentExpression.toString());
                    mainArea.setText("");
                    break;
                case "=":
                	
                    double result = evaluateExpression(firstOperand, secondOperand, operator);
                    currentExpression.append(" = "+result);
                    mainArea.setText(currentExpression.toString());
                    break;
                case "DEL":
                    if (currentExpression.length() > 0) {
                        currentExpression.deleteCharAt(currentExpression.length() - 1);
                        mainArea.setText(currentExpression.toString());
                    }
                    break;
                case "CLR":
                    currentExpression.setLength(0);
                    firstOperand = "";
                    secondOperand = "";
                    operator = "";
                    isSecondOperand = false;
                    mainArea.setText("");
                    break;
                default:
                    if (isSecondOperand) {
                        if (secondOperand.isEmpty()) {
                            mainArea.setText(""); // Clear the text area when starting to input the second operand
                        }
                        secondOperand += command;
                    } else {
                        firstOperand += command;
                    }
                    currentExpression.append(command);
                    mainArea.setText(currentExpression.toString());
                    break;
            }
        }

        double evaluateExpression(String firstOperand, String secondOperand, String operator) {
        	
            double num1 = Double.parseDouble(firstOperand);
            double num2 = Double.parseDouble(secondOperand);
            
            switch (operator) {
                case "+":
                    return num1 + num2;
                case "-":
                    return num1 - num2;
                case "×":
                    return num1 * num2;
                case "÷":
                    return num1 / num2;
       
                default:
                	
                    System.out.println("error");
            }
			return 0;
        }
    }

}
