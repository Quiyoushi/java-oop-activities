package project_finals;

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class evaluate implements ActionListener {

	private String buttonName;

	public evaluate(String buttonName) {
		this.buttonName = buttonName;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// Create a new JFrame for the separate panel
		JFrame newFrame = new JFrame(buttonName);
		newFrame.setSize(800, 800);
		newFrame.setLocationRelativeTo(null);
		newFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		// Create and add a new panel to the new frame based on the button name
		JPanel newPanel = new JPanel();
		newPanel.setLayout(new GridLayout(1, 2));
		JPanel picturePanel = new JPanel();
		JPanel descriptionPanel = new JPanel();
		Border border = BorderFactory.createLineBorder(Color.BLACK);

		switch (buttonName) {
		case "NALUNAO":

			descriptionPanel
					.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(5, 5, 5, 5)));
			descriptionPanel.setLayout(new GridLayout(0, 1, 5, 5));
			descriptionPanel.setBorder(border);
			descriptionPanel.add(new JLabel("BARANGAY NAME: "));
			descriptionPanel.add(new JLabel("          NALUNAO "));
			descriptionPanel.add(new JLabel("TOPOGRAPHY: "));
			descriptionPanel.add(new JLabel("          Plains"));
			descriptionPanel.add(new JLabel("THREATS: "));
			descriptionPanel.add(new JLabel("       Falling Trees, Flying Debris"));
			descriptionPanel.add(new JLabel("NEAREST EVACUATION AREA: "));
			descriptionPanel.add(new JLabel("      Kalangay Barangay Hall   "));
			descriptionPanel.add(new JLabel("RISK ASSESSMENT: "));
			descriptionPanel.add(new JLabel("      Moderate Risk"));
			
			//picture of place added 
			
			

			// add to newPanel
			newPanel.add(picturePanel);
			newPanel.add(descriptionPanel);

			break;
		case "KALYAAT":

			descriptionPanel
					.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(5, 5, 5, 5)));
			descriptionPanel.setLayout(new GridLayout(0, 1, 5, 5));
			descriptionPanel.setBorder(border);
			descriptionPanel.add(new JLabel("BARANGAY NAME: "));
			descriptionPanel.add(new JLabel("          KALYAAT"));
			descriptionPanel.add(new JLabel("TOPOGRAPHY: "));
			descriptionPanel.add(new JLabel("          HILLS"));
			descriptionPanel.add(new JLabel("THREATS: "));
			descriptionPanel.add(new JLabel("   Landslide and Falling trees"));
			descriptionPanel.add(new JLabel("NEAREST EVACUATION AREA: "));
			descriptionPanel.add(new JLabel("     Paaralang Elementary ng Nakal"));
			descriptionPanel.add(new JLabel("RISK ASSESSMENT: "));
			descriptionPanel.add(new JLabel("       HIGH RISK "));

			// add to newPanel
			newPanel.add(picturePanel);
			newPanel.add(descriptionPanel);

			break;
		case "IGANG":
			descriptionPanel
					.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(5, 5, 5, 5)));
			descriptionPanel.setLayout(new GridLayout(0, 1, 5, 5));
			descriptionPanel.setBorder(border);
			descriptionPanel.add(new JLabel("BARANGAY NAME: "));
			descriptionPanel.add(new JLabel("          IGANG "));
			descriptionPanel.add(new JLabel("TOPOGRAPHY: "));
			descriptionPanel.add(new JLabel("          Plains"));
			descriptionPanel.add(new JLabel("THREATS: "));
			descriptionPanel.add(new JLabel("       Falling Branches, Falling Trees"));
			descriptionPanel.add(new JLabel("NEAREST EVACUATION AREA: "));
			descriptionPanel.add(new JLabel("     Barangay hall of Samil"));
			descriptionPanel.add(new JLabel("RISK ASSESSMENT: "));
			descriptionPanel.add(new JLabel("         MODERATE RISK"));

			// add to newPanel
			newPanel.add(picturePanel);
			newPanel.add(descriptionPanel);
			break;
		case "SAMIL":
			descriptionPanel
					.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(5, 5, 5, 5)));
			descriptionPanel.setLayout(new GridLayout(0, 1, 5, 5));
			descriptionPanel.setBorder(border);
			descriptionPanel.add(new JLabel("BARANGAY NAME: "));
			descriptionPanel.add(new JLabel("          SAMIL "));
			descriptionPanel.add(new JLabel("TOPOGRAPHY: "));
			descriptionPanel.add(new JLabel("        Plains"));
			descriptionPanel.add(new JLabel("THREATS: "));
			descriptionPanel.add(new JLabel("       Falling Branches, Falling Trees"));
			descriptionPanel.add(new JLabel("NEAREST EVACUATION AREA: "));
			descriptionPanel.add(new JLabel("     Barangay hall of Samil"));
			descriptionPanel.add(new JLabel("RISK ASSESSMENT: "));
			descriptionPanel.add(new JLabel("          Moderate Risk"));

			// add to newPanel
			newPanel.add(picturePanel);
			newPanel.add(descriptionPanel);
			break;
		case "MBSC NATIONAL PARK":
			descriptionPanel
					.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(5, 5, 5, 5)));
			descriptionPanel.setLayout(new GridLayout(0, 1, 5, 5));
			descriptionPanel.setBorder(border);
			descriptionPanel.add(new JLabel("BARANGAY NAME: "));
			descriptionPanel.add(new JLabel("          MBSC NATIONAL PARK"));
			descriptionPanel.add(new JLabel("TOPOGRAPHY: "));
			descriptionPanel.add(new JLabel("          HILLS"));
			descriptionPanel.add(new JLabel("THREATS: "));
			descriptionPanel.add(new JLabel("   Landslide, Falling trees"));
			descriptionPanel.add(new JLabel("NEAREST EVACUATION AREA: "));
			descriptionPanel.add(new JLabel("     NONE SINCE IT IS INHABITED AREA"));
			descriptionPanel.add(new JLabel("RISK ASSESSMENT: "));
			descriptionPanel.add(new JLabel("       HIGH RISK "));

			// add to newPanel
			newPanel.add(picturePanel);
			newPanel.add(descriptionPanel);
			break;

		case "KALAYAAN":
			descriptionPanel
					.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(5, 5, 5, 5)));
			descriptionPanel.setLayout(new GridLayout(0, 1, 5, 5));
			descriptionPanel.add(new JLabel("BARANGAY NAME: "));
			descriptionPanel.add(new JLabel("          KALAYAAN"));
			descriptionPanel.add(new JLabel("TOPOGRAPHY: "));
			descriptionPanel.add(new JLabel("          HILLS"));
			descriptionPanel.add(new JLabel("THREATS: "));
			descriptionPanel.add(new JLabel("   Landslide and Falling trees"));
			descriptionPanel.add(new JLabel(" NEAREST EVACUATION AREA: "));
			descriptionPanel.add(new JLabel("     Paaralang Elementary ng Nakal"));
			descriptionPanel.add(new JLabel("RISK ASSESSMENT: "));
			descriptionPanel.add(new JLabel("       HIGH RISK "));

			// add to newPanel
			newPanel.add(picturePanel);
			newPanel.add(descriptionPanel);
			break;

		case "ALILIW":
			descriptionPanel
					.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(5, 5, 5, 5)));
			descriptionPanel.setLayout(new GridLayout(0, 1, 5, 5));
			descriptionPanel.add(new JLabel("BARANGAY NAME: "));
			descriptionPanel.add(new JLabel("          KALAYAAN"));
			descriptionPanel.add(new JLabel("TOPOGRAPHY: "));
			descriptionPanel.add(new JLabel("          HILLS"));
			descriptionPanel.add(new JLabel("THREATS: "));
			descriptionPanel.add(new JLabel("   Landslide and Falling trees"));
			descriptionPanel.add(new JLabel(" NEAREST EVACUATION AREA: "));
			descriptionPanel.add(new JLabel("     Paaralang Elementary ng Nakal"));
			descriptionPanel.add(new JLabel("RISK ASSESSMENT: "));
			descriptionPanel.add(new JLabel("       HIGH RISK "));

			// add to newPanel
			newPanel.add(picturePanel);
			newPanel.add(descriptionPanel);

			break;
		case "ABANG":
			descriptionPanel
					.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(5, 5, 5, 5)));
			descriptionPanel.setLayout(new GridLayout(0, 1, 5, 5));
			descriptionPanel.add(new JLabel("BARANGAY NAME: "));
			descriptionPanel.add(new JLabel("          ABANG"));
			descriptionPanel.add(new JLabel("TOPOGRAPHY: "));
			descriptionPanel.add(new JLabel("         Urban"));
			descriptionPanel.add(new JLabel("THREATS: "));
			descriptionPanel.add(new JLabel("   Falling Post, Flying Branches"));
			descriptionPanel.add(new JLabel(" NEAREST EVACUATION AREA: "));
			descriptionPanel.add(new JLabel("   Nagsinamo Elementary School"));
			descriptionPanel.add(new JLabel("RISK ASSESSMENT: "));
			descriptionPanel.add(new JLabel("    MODERATE RISK"));

			// add to newPanel
			newPanel.add(picturePanel);
			newPanel.add(descriptionPanel);

			break;
		case "AYUTI":
			descriptionPanel
					.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(5, 5, 5, 5)));
			descriptionPanel.setLayout(new GridLayout(0, 1, 5, 5));
			descriptionPanel.add(new JLabel("BARANGAY NAME: "));
			descriptionPanel.add(new JLabel("          AYUTI"));
			descriptionPanel.add(new JLabel("TOPOGRAPHY: "));
			descriptionPanel.add(new JLabel("         Urban"));
			descriptionPanel.add(new JLabel("THREATS: "));
			descriptionPanel.add(new JLabel("   Falling Post, Flying Branches"));
			descriptionPanel.add(new JLabel(" NEAREST EVACUATION AREA: "));
			descriptionPanel.add(new JLabel("  Southern Luzon State University Ayuti "));
			descriptionPanel.add(new JLabel("RISK ASSESSMENT: "));
			descriptionPanel.add(new JLabel("    SLIGHTLY MODERATE RISK"));

			// add to newPanel
			newPanel.add(picturePanel);
			newPanel.add(descriptionPanel);

			break;
		case "POBLACION":
			descriptionPanel
					.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(5, 5, 5, 5)));
			descriptionPanel.setLayout(new GridLayout(0, 1, 5, 5));
			descriptionPanel.add(new JLabel("BARANGAY NAME: "));
			descriptionPanel.add(new JLabel("          POBLACION"));
			descriptionPanel.add(new JLabel("TOPOGRAPHY: "));
			descriptionPanel.add(new JLabel("         Urban"));
			descriptionPanel.add(new JLabel("THREATS: "));
			descriptionPanel.add(new JLabel("   Falling Post, Flying Branches, Flash FLoods"));
			descriptionPanel.add(new JLabel(" NEAREST EVACUATION AREA: "));
			descriptionPanel.add(new JLabel("  Southern Luzon State University Ayuti "));
			descriptionPanel.add(new JLabel("RISK ASSESSMENT: "));
			descriptionPanel.add(new JLabel("    MODERATE RISK"));

			// add to newPanel
			newPanel.add(picturePanel);
			newPanel.add(descriptionPanel);

			break;
		case "PALOLA":
			descriptionPanel
					.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(5, 5, 5, 5)));
			descriptionPanel.setLayout(new GridLayout(0, 1, 5, 5));
			descriptionPanel.add(new JLabel("BARANGAY NAME: "));
			descriptionPanel.add(new JLabel("          PALOLA"));
			descriptionPanel.add(new JLabel("TOPOGRAPHY: "));
			descriptionPanel.add(new JLabel("         HILLS"));
			descriptionPanel.add(new JLabel("THREATS: "));
			descriptionPanel.add(new JLabel("   Landslides, Flying Branches, Flash FLoods"));
			descriptionPanel.add(new JLabel(" NEAREST EVACUATION AREA: "));
			descriptionPanel.add(new JLabel("  Banahaw View Academy, Inc."));
			descriptionPanel.add(new JLabel("RISK ASSESSMENT: "));
			descriptionPanel.add(new JLabel("    SLIGHTLY MODERATE RISK"));

			// add to newPanel
			newPanel.add(picturePanel);
			newPanel.add(descriptionPanel);
			break;
		case "M.PARANG":
			descriptionPanel
					.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(5, 5, 5, 5)));
			descriptionPanel.setLayout(new GridLayout(0, 1, 5, 5));
			descriptionPanel.add(new JLabel("BARANGAY NAME: "));
			descriptionPanel.add(new JLabel("        MAHABANG PARANG"));
			descriptionPanel.add(new JLabel("TOPOGRAPHY: "));
			descriptionPanel.add(new JLabel("         HILLS"));
			descriptionPanel.add(new JLabel("THREATS: "));
			descriptionPanel.add(new JLabel("   Landslides, Flying Branches, Flash FLoods"));
			descriptionPanel.add(new JLabel(" NEAREST EVACUATION AREA: "));
			descriptionPanel.add(new JLabel("   Paaralang Elementarya ng Piis"));
			descriptionPanel.add(new JLabel("RISK ASSESSMENT: "));
			descriptionPanel.add(new JLabel("    SLIGHTLY MODERATE RISK"));

			// add to newPanel
			newPanel.add(picturePanel);
			newPanel.add(descriptionPanel);
			break;
		case "KABATETE":
			descriptionPanel
					.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(5, 5, 5, 5)));
			descriptionPanel.setLayout(new GridLayout(0, 1, 5, 5));
			descriptionPanel.setBorder(border);
			descriptionPanel.add(new JLabel("BARANGAY NAME: "));
			descriptionPanel.add(new JLabel("          KABATETE "));
			descriptionPanel.add(new JLabel("TOPOGRAPHY: "));
			descriptionPanel.add(new JLabel("          HILLS"));
			descriptionPanel.add(new JLabel("THREATS: "));
			descriptionPanel.add(new JLabel("        Landslides,Fallin trees,Flash Floods "));
			descriptionPanel.add(new JLabel("NEAREST EVACUATION AREA: "));
			descriptionPanel.add(new JLabel("       Paaralang Elementarya ng Piis"));
			descriptionPanel.add(new JLabel("RISK ASSESSMENT: "));
			descriptionPanel.add(new JLabel("          HIGH RISK "));

			// add to newPanel
			newPanel.add(picturePanel);
			newPanel.add(descriptionPanel);
			break;
		case "KILIB":
			descriptionPanel
					.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(5, 5, 5, 5)));
			descriptionPanel.setLayout(new GridLayout(0, 1, 5, 5));
			descriptionPanel.setBorder(border);
			descriptionPanel.add(new JLabel("BARANGAY NAME: "));
			descriptionPanel.add(new JLabel("          KILIB "));
			descriptionPanel.add(new JLabel("TOPOGRAPHY: "));
			descriptionPanel.add(new JLabel("          HILLS"));
			descriptionPanel.add(new JLabel("THREATS: "));
			descriptionPanel.add(new JLabel("        Landslides,Fallin trees,Flash Floods "));
			descriptionPanel.add(new JLabel("NEAREST EVACUATION AREA: "));
			descriptionPanel.add(new JLabel("        Bahay Pamahalaan Brgy, Kilib"));
			descriptionPanel.add(new JLabel("RISK ASSESSMENT: "));
			descriptionPanel.add(new JLabel("          HIGH RISK "));

			// add to newPanel
			newPanel.add(picturePanel);
			newPanel.add(descriptionPanel);
			break;
		case "KULAPI":
			descriptionPanel
					.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(5, 5, 5, 5)));
			descriptionPanel.setLayout(new GridLayout(0, 1, 5, 5));
			descriptionPanel.setBorder(border);
			descriptionPanel.add(new JLabel("BARANGAY NAME: "));
			descriptionPanel.add(new JLabel("          KULAPI "));
			descriptionPanel.add(new JLabel("TOPOGRAPHY: "));
			descriptionPanel.add(new JLabel("          HILLS"));
			descriptionPanel.add(new JLabel("THREATS: "));
			descriptionPanel.add(new JLabel("      Vulnerable to landslides and Falling Trees"));
			descriptionPanel.add(new JLabel("NEAREST EVACUATION AREA: "));
			descriptionPanel.add(new JLabel("     Barangay Hall of Kulapi"));
			descriptionPanel.add(new JLabel("RISK ASSESSMENT: "));
			descriptionPanel.add(new JLabel("          HIGH RISK "));

			// add to newPanel
			newPanel.add(picturePanel);
			newPanel.add(descriptionPanel);
			break;
		case "TINAMNAN":
			descriptionPanel
					.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(5, 5, 5, 5)));
			descriptionPanel.setLayout(new GridLayout(0, 1, 5, 5));
			descriptionPanel.setBorder(border);
			descriptionPanel.add(new JLabel("BARANGAY NAME: "));
			descriptionPanel.add(new JLabel("          TINAMNAN "));
			descriptionPanel.add(new JLabel("TOPOGRAPHY: "));
			descriptionPanel.add(new JLabel("         HILLSIDE"));
			descriptionPanel.add(new JLabel("THREATS: "));
			descriptionPanel.add(new JLabel("      Vulnerable to landslides and Falling Trees"));
			descriptionPanel.add(new JLabel("NEAREST EVACUATION AREA: "));
			descriptionPanel.add(new JLabel("     Kamay ni hesus "));
			descriptionPanel.add(new JLabel("RISK ASSESSMENT: "));
			descriptionPanel.add(new JLabel("         SLIGHTLY HIGH RISK "));

			// add to newPanel
			newPanel.add(picturePanel);
			newPanel.add(descriptionPanel);
			break;
		case "MANASA":
			descriptionPanel
					.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(5, 5, 5, 5)));
			descriptionPanel.setLayout(new GridLayout(0, 1, 5, 5));
			descriptionPanel.setBorder(border);
			descriptionPanel.add(new JLabel("BARANGAY NAME: "));
			descriptionPanel.add(new JLabel("          MANASA"));
			descriptionPanel.add(new JLabel("TOPOGRAPHY: "));
			descriptionPanel.add(new JLabel("          Plains"));
			descriptionPanel.add(new JLabel("THREATS: "));
			descriptionPanel.add(new JLabel("          KALYAAT "));
			descriptionPanel.add(new JLabel("NEAREST EVACUATION AREA: "));
			descriptionPanel.add(new JLabel("    Our Lady of the Most Holy Rosary Seminary"));
			descriptionPanel.add(new JLabel("RISK ASSESSMENT: "));
			descriptionPanel.add(new JLabel("         MODERATE RISK"));

			// add to newPanel
			newPanel.add(picturePanel);
			newPanel.add(descriptionPanel);
			break;
		case "PIIS":
			descriptionPanel
					.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(5, 5, 5, 5)));
			descriptionPanel.setLayout(new GridLayout(0, 1, 5, 5));
			descriptionPanel.setBorder(border);
			descriptionPanel.add(new JLabel("BARANGAY NAME: "));
			descriptionPanel.add(new JLabel("          PIIS "));
			descriptionPanel.add(new JLabel("TOPOGRAPHY: "));
			descriptionPanel.add(new JLabel("          HILLS"));
			descriptionPanel.add(new JLabel("THREATS: "));
			descriptionPanel.add(new JLabel("        Landslides,Fallin trees,Flash Floods "));
			descriptionPanel.add(new JLabel("NEAREST EVACUATION AREA: "));
			descriptionPanel.add(new JLabel("       Paaralang Elementarya ng Piis"));
			descriptionPanel.add(new JLabel("RISK ASSESSMENT: "));
			descriptionPanel.add(new JLabel("          HIGH RISK "));

			// add to newPanel
			newPanel.add(picturePanel);
			newPanel.add(descriptionPanel);
			break;
		case "ADOLINAO":
			descriptionPanel
					.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(5, 5, 5, 5)));
			descriptionPanel.setLayout(new GridLayout(0, 1, 5, 5));
			descriptionPanel.setBorder(border);
			descriptionPanel.add(new JLabel("BARANGAY NAME: "));
			descriptionPanel.add(new JLabel("          ADOLINAO "));
			descriptionPanel.add(new JLabel("TOPOGRAPHY: "));
			descriptionPanel.add(new JLabel("          HILLS"));
			descriptionPanel.add(new JLabel("THREATS: "));
			descriptionPanel.add(new JLabel("        Landslides,Fallin trees,Flash Floods"));
			descriptionPanel.add(new JLabel("NEAREST EVACUATION AREA: "));
			descriptionPanel.add(new JLabel("        Atulinao Barangay Hall"));
			descriptionPanel.add(new JLabel("RISK ASSESSMENT: "));
			descriptionPanel.add(new JLabel("          HIGH RISK "));

			// add to newPanel
			newPanel.add(picturePanel);
			newPanel.add(descriptionPanel);
			break;
		case "MALUPAK":
			descriptionPanel
					.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(5, 5, 5, 5)));
			descriptionPanel.setLayout(new GridLayout(0, 1, 5, 5));
			descriptionPanel.setBorder(border);
			descriptionPanel.add(new JLabel("BARANGAY NAME: "));
			descriptionPanel.add(new JLabel("          MALUPAK "));
			descriptionPanel.add(new JLabel("TOPOGRAPHY: "));
			descriptionPanel.add(new JLabel("          HILLS"));
			descriptionPanel.add(new JLabel("THREATS: "));
			descriptionPanel.add(new JLabel("        Landslides,Fallin trees,Flash Floods"));
			descriptionPanel.add(new JLabel("NEAREST EVACUATION AREA: "));
			descriptionPanel.add(new JLabel("        Kamay ni hesus"));
			descriptionPanel.add(new JLabel("RISK ASSESSMENT: "));
			descriptionPanel.add(new JLabel("          MODERATE RISK "));

			// add to newPanel
			newPanel.add(picturePanel);
			newPanel.add(descriptionPanel);
			break;
		case "TIAWE":
			descriptionPanel
					.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(5, 5, 5, 5)));
			descriptionPanel.setLayout(new GridLayout(0, 1, 5, 5));
			descriptionPanel.setBorder(border);
			descriptionPanel.add(new JLabel("BARANGAY NAME: "));
			descriptionPanel.add(new JLabel("          TIAWE "));
			descriptionPanel.add(new JLabel("TOPOGRAPHY: "));
			descriptionPanel.add(new JLabel("          PLAINS"));
			descriptionPanel.add(new JLabel("THREATS: "));
			descriptionPanel.add(new JLabel("      FLOODS, FALLING TREES "));
			descriptionPanel.add(new JLabel("NEAREST EVACUATION AREA: "));
			descriptionPanel.add(new JLabel("    KAMAY NI HESUS    "));
			descriptionPanel.add(new JLabel("RISK ASSESSMENT: "));
			descriptionPanel.add(new JLabel("         SLIGHLY MODERATE RISK"));

			// add to newPanel
			newPanel.add(picturePanel);
			newPanel.add(descriptionPanel);
			break;
		case "MAY-IT":
			descriptionPanel
					.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(5, 5, 5, 5)));
			descriptionPanel.setLayout(new GridLayout(0, 1, 5, 5));
			descriptionPanel.setBorder(border);
			descriptionPanel.add(new JLabel("BARANGAY NAME: "));
			descriptionPanel.add(new JLabel("          MAY-IT "));
			descriptionPanel.add(new JLabel("TOPOGRAPHY: "));
			descriptionPanel.add(new JLabel("          Plains"));
			descriptionPanel.add(new JLabel("THREATS: "));
			descriptionPanel.add(new JLabel("        Fying Debris, Falling Trees"));
			descriptionPanel.add(new JLabel("NEAREST EVACUATION AREA: "));
			descriptionPanel.add(new JLabel("      Bahay Pamahalaan Barangay May-It"));
			descriptionPanel.add(new JLabel("RISK ASSESSMENT: "));
			descriptionPanel.add(new JLabel("          SLIGHTLY MODERATE RISK"));

			// add to newPanel
			newPanel.add(picturePanel);
			newPanel.add(descriptionPanel);
			break;
		case "NAGSINAMO":
			descriptionPanel
					.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(5, 5, 5, 5)));
			descriptionPanel.setLayout(new GridLayout(0, 1, 5, 5));
			descriptionPanel.setBorder(border);
			descriptionPanel.add(new JLabel("BARANGAY NAME: "));
			descriptionPanel.add(new JLabel("          NAGISNAMO "));
			descriptionPanel.add(new JLabel("TOPOGRAPHY: "));
			descriptionPanel.add(new JLabel("          Urban"));
			descriptionPanel.add(new JLabel("THREATS: "));
			descriptionPanel.add(new JLabel("        Fying Debris, Falling Trees, Flash Floods"));
			descriptionPanel.add(new JLabel("NEAREST EVACUATION AREA: "));
			descriptionPanel.add(new JLabel("       Nagsinamo Elementary School "));
			descriptionPanel.add(new JLabel("RISK ASSESSMENT: "));
			descriptionPanel.add(new JLabel("          SLIGHTLY MODERATE RISK"));

			// add to newPanel
			newPanel.add(picturePanel);
			newPanel.add(descriptionPanel);
			break;

		default:
			newPanel.add(new JLabel("Unknown location!"));
			break;
		}

		newFrame.add(newPanel);

		// Make the new frame visible
		newFrame.setVisible(true);
	}
}
