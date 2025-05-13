	package act16;

import java.awt.*;

import javax.swing.*;


public class note extends JFrame{
	
	JFrame frame;
	JTextArea field;
	JScrollPane scroller;
	JMenuBar menuBar;
	JMenu file,edit,view;
	JMenuItem iNew,iOpen,iSave,iSaveas,iExit,iUndo,iCut,iCopy,iPaste,iDelete,iZoom;
	JCheckBoxMenuItem iStatusbar;
	JLabel statusBar;
	
	note(){
		
		addFrame();
		addField();
		addMenuBar();
		addStatusBar();
		addJmenuItemsFile();
		addJmenuItemsEdit();
		addJmenuItemsView();
		frame.setVisible(true);
		
		
	}
	
	void addFrame() {
		
		frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setTitle("Notepad");
        
      
	}
	
	void addField() {
		
		field = new JTextArea();
		scroller = new JScrollPane(field, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scroller.setBorder(BorderFactory.createEmptyBorder());
		frame.add(scroller);
			

	}
	
	void addMenuBar() {
		
		menuBar= new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		file = new JMenu("File");
		menuBar.add(file);
		
		edit = new JMenu("Edit");
		menuBar.add(edit);
		
		view = new JMenu("View");
		menuBar.add(view);
		
		
		
	}
	
	void addJmenuItemsFile() {
		
		iNew= new JMenuItem("New            CTRL + N");
		file.add(iNew);
		
		iOpen= new JMenuItem("Open          CTRL + O");
		file.add(iOpen);
		
		iSave= new JMenuItem("Save          CTRL + S");
		file.add(iSave);
		
		iSaveas= new JMenuItem("Save As     CTRL + Shift + N");
		file.add(iSaveas);
		
		iExit = new JMenuItem("Exit");
		file.add(iExit);
		
	}

	void addJmenuItemsEdit() {
		
		iUndo= new JMenuItem("Undo            CTRL + Z");
		edit.add(iUndo);
		
		iCut= new JMenuItem("Cut               CTRL + X");
		edit.add(iCut);
		
		iCopy= new JMenuItem("Copy             CTRL + C");
		edit.add(iCopy);
		
		iPaste= new JMenuItem("Paste           CTRL + V");
		edit.add(iPaste);
		
		iDelete = new JMenuItem("Delete         Del");
		edit.add(iDelete);
		
		
	}
	
	void addJmenuItemsView() {
		
		iZoom = new JMenuItem("Zoom");
		view.add(iZoom);
		
		iStatusbar= new JCheckBoxMenuItem("Show Status Bar");
		view.add(iStatusbar);
		
		
	}
	
	void addStatusBar() {
		
		statusBar = new JLabel("Status Bar");
		frame.add(statusBar, BorderLayout.SOUTH);
		
		
	}
	

	
}
