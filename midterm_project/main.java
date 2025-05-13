package midterm_project;

import javax.swing.*;

import java.util.Scanner;

public class main {

	public static void main(String[] args) throws Exception {

		// Jose Quinito T. Fajardo BSCPE II - GF

		// Scanner
		Scanner input = new Scanner(System.in);

		// Array for stored messages
		String[] messages = {
				"\tTRIANGLE TRIANGLULATOR\n\nA simple calculator for a triangle that uses trigonometry mainly"
						+ "\n\n1. Law of Cosine\n2. Law of Sine\n3. Law of Tangent \n\nTo Calculate the sides of the triangle\n OR"
						+ "\nTo Calculate the missing angle using sides of the triangle"
						+ "\n\nDo you want to proceed?", };

		String[] opt = { "Law of Cosine", "Law of Sine", "Law of Tangent" };

		String[] mia = { "Unknown Side", "Unkown Angle" };

		// A Class instantiation for formula specifically unknown sides
		formula triangle = new formula();

		// Inherited class for unknown angle
		formula angle = new angle();

		// Inherited Class instantiation for cosine
		acquisition acquire = new acquisition();

		// Class instantiation for sine
		acquisition acquire_sn = new acquisition_sn();

		// Class instantiation for tangent
		acquisition acquire_tn = new acquisition_tn();

		// Variable for rerun
		int rerun;

		// Rerun initiate
		do {
			// Confirmation
			int pass = JOptionPane.showConfirmDialog(null, messages[0], "Confirmation", JOptionPane.OK_CANCEL_OPTION);

			// Condition for confirmation
			if (pass == JOptionPane.OK_OPTION) {

				// Option selector for law selected by the user
				int choice = JOptionPane.showOptionDialog(null, "Choose an option:", "Trigonometry Calculation",
						JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opt, opt[0]);

				// Switch case
				switch (choice) {

				// If the user selects cosine
				case 0:
					int missing_c = JOptionPane.showOptionDialog(null, "Choose what do you want to find? ",
							"Trigonometry Calculation", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null,
							mia, mia[0]);
					// nested switch-case for missing side or angle
					switch (missing_c) {

					// Method call for missing SIDES using cosine law
					case 0:
						acquire.acquire_s();
						break;

					// Method call for missing ANGLE using cosine law
					case 1:
						acquire.acquire_a();
						break;

					// Default Option for Cosine
					default:
						JOptionPane.showMessageDialog(null, "Invalid angle. Please Try Again.", "Error",
								JOptionPane.ERROR_MESSAGE);
					}

					break;
				// Case for Sine Law
				case 1:
					int missing_s = JOptionPane.showOptionDialog(null, "Choose what do you want to find? ",
							"Trigonometry Calculation", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null,
							mia, mia[0]);

					switch (missing_s) {

					// Side missing for sine law to use
					case 0:
						acquire_sn.acquire_s();
						break;

					// Missing angle for sine
					case 1:
						acquire_sn.acquire_a();
						break;

					// default output for sine law
					default:
						JOptionPane.showMessageDialog(null, "Invalid angle. Please Try Again.", "Error",
								JOptionPane.ERROR_MESSAGE);
					}

					break;

				// For tangent law
				case 2:
					int missing_t = JOptionPane.showOptionDialog(null, "Choose what do you want to find? ",
							"Trigonometry Calculation", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null,
							mia, mia[0]);

					switch (missing_t) {

					// Unknown sides to find using the tangent law
					case 0:
						acquire_tn.acquire_s();

						break;

					// Unknown angle for tangent law to use
					case 1:
						acquire_tn.acquire_a();

						break;

					default:

					}

					break;

				// Default option for LAW selection
				default:
					JOptionPane.showMessageDialog(null, "Invalid Input. Please Try Again.", "Error",
							JOptionPane.ERROR_MESSAGE);

				}
				// end of the condition
			} else

				JOptionPane.showMessageDialog(null, "Thank You For using the Program", "Confirmation",
						JOptionPane.PLAIN_MESSAGE);

			// rerun variable subject to change
			rerun = JOptionPane.showConfirmDialog(null, "Do you want a Rerun?", "Confirmation",
					JOptionPane.OK_CANCEL_OPTION);

			// rerun for changing
		} while (rerun == 0);

	}

}

//acquisition class
class acquisition {

	// acquisition for missing side cosine law
	void acquire_s() {

		double[] s = new double[3];

		for (int i = 0; i < 2; i++) {

			s[i] = Double.parseDouble(
					JOptionPane.showInputDialog(null, "Enter Side " + (i + 1), "Input", JOptionPane.PLAIN_MESSAGE));
		}

		s[2] = Double
				.parseDouble(JOptionPane.showInputDialog(null, "Enter angle ", "Input", JOptionPane.PLAIN_MESSAGE));

		// method call
		double c_triangle = formula.cosinelaw(s[0], s[1], s[2]);

		String[] a = { "\nSide 1: " + s[0] + "\nside 2: " + s[1] + "\nAngle: " + s[2] };

		if (s[2] < 90 && s[2] > 0) {

			JOptionPane.showMessageDialog(null, a[0] + "\nThe Unknown Side of the Acute triangle: " + c_triangle);

		} else if (s[2] > 90 && s[2] < 360) {

			JOptionPane.showMessageDialog(null, a[0] + "\nThe Unknown Side of the obtuse triangle: " + c_triangle);

		} else if (s[2] == 90) {

			JOptionPane.showMessageDialog(null, a[0] + "\nThe Unknown Side of the Right triangle: " + c_triangle);

		} else {

			JOptionPane.showMessageDialog(null, "Invalid angle. Please input a valid angle.", "Error",
					JOptionPane.ERROR_MESSAGE);
		}

	}

	// acquisition for missing angle cosine law
	void acquire_a() {

		double[] s = new double[3];

		for (int i = 0; i < 3; i++) {

			s[i] = Double.parseDouble(
					JOptionPane.showInputDialog(null, "Enter Side " + (i + 1), "Input", JOptionPane.PLAIN_MESSAGE));
		}
		String[] m = { "\nSide 1: " + s[0] + "\nside 2: " + s[1] + "\nSide 3: " + s[2] };

		// method call
		double c_triangle = angle.cosinelaw(s[0], s[1], s[2]);

		JOptionPane.showMessageDialog(null, m[0] + "\nThe Angle of the Triangle using Law of Cosine: " + c_triangle);

	}

}

//Inherited class for Sine law
class acquisition_sn extends acquisition {

	// Method for missing side using sine law
	void acquire_s() {
		double[] s = new double[3];

		for (int i = 0; i < 2; i++) {

			s[i] = Double.parseDouble(
					JOptionPane.showInputDialog(null, "Enter angle " + (i + 1), "Input", JOptionPane.PLAIN_MESSAGE));
		}

		s[2] = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter side ", "Input", JOptionPane.PLAIN_MESSAGE));

		// method call
		double sn_triangle = formula.sinelaw(s[0], s[1], s[2]);

		String[] a = { "\nAngle 1: " + s[0] + "\nOpposite angle 2: " + s[1] + "\nSide: " + s[2] };

		if (360 > s[0] && s[1] > 0) {

			JOptionPane.showMessageDialog(null,
					a[0] + "\nThe Unknown Side of the triangle using Sine Law: " + sn_triangle);

		} else {

			JOptionPane.showMessageDialog(null, "Invalid angle. Please input a valid angle.", "Error",
					JOptionPane.ERROR_MESSAGE);
		}

	}

	// Method for missing Angle using sine law
	void acquire_a() {

		double[] s = new double[2];

		s[0] = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter Side ", "Input", JOptionPane.PLAIN_MESSAGE));

		s[1] = Double.parseDouble(
				JOptionPane.showInputDialog(null, "Enter opposite angle ", "Input", JOptionPane.PLAIN_MESSAGE));

		String[] m = { "\nSide : " + s[0] + "\nOpposite Angle: " + s[1] };

		// method call
		double sn_triangle = angle.sinelaw(s[0], s[1]);

		JOptionPane.showMessageDialog(null, m[0] + "\nThe Angle of the Triangle using Law of sine: " + sn_triangle);

	}

}

//inherited tangent class for the parent basically the sibling of the sine method
class acquisition_tn extends acquisition {

	// acquiring input to solve for the missing side
	void acquire_s() {

		double[] s = new double[2];

		s[0] = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter Side ", "Input", JOptionPane.PLAIN_MESSAGE));

		s[1] = Double
				.parseDouble(JOptionPane.showInputDialog(null, "Enter angle ", "Input", JOptionPane.PLAIN_MESSAGE));

		String[] m = { "\nSide : " + s[0] + "\n Angle: " + s[1] };

		// Method call
		double tn_triangle = formula.tangentlaw(s[0], s[1]);

		JOptionPane.showMessageDialog(null, m[0] + "\nThe Angle of the Triangle using Law of sine: " + tn_triangle);

	}

	// Missing angle for tangent to get
	void acquire_a() {

		double[] s = new double[2];

		for (int i = 0; i < 2; i++) {

			s[i] = Double.parseDouble(
					JOptionPane.showInputDialog(null, "Enter Side " + (i + 1), "Input", JOptionPane.PLAIN_MESSAGE));
		}
		String[] m = { "\nSide 1: " + s[0] + "\nside 2: " + s[1] };

		// method call
		double tn_triangle = angle.tangentlaw(s[0], s[1]);

		JOptionPane.showMessageDialog(null, m[0] + "\nThe Angle of the Triangle using Law of Tangent: " + tn_triangle);

	}

}

//Class for collected formulas 
class formula {

	// cosine law for side calculation
	static double cosinelaw(double side1, double side2, double angle) {

		return Math.sqrt(side1 * side1 + side2 * side2 - 2 * side1 * side2 * Math.cos(Math.toRadians(angle)));
	}

	// sine law for side calculation
	static double sinelaw(double angle1, double angle2, double side) {

		return (side * Math.sin(Math.toRadians(angle1)) / Math.sin(Math.toRadians(angle2)));

	}

	// tangent law for side calculation
	static double tangentlaw(double side, double angle) {

		return side * Math.tan(Math.toRadians(angle));

	}

}

//Inherited class for the angle formula for each law
class angle extends formula {

	// angle formula cosine
	static double cosinelaw(double side1, double side2, double side3) {

		return Math.toDegrees(side1 * side1 + side2 * side2 - side3 * side3) / (2 * side1 * side2);

	}

	// missing angle formula for cosine
	static double sinelaw(double angle, double side) {

		return Math.toDegrees(Math.asin(angle / side));

	}

	// unknown angle for tangent method to solve
	static double tangentlaw(double side1, double side2) {

		return Math.toDegrees(Math.atan(side1 / side2));

	}

}
