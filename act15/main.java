package act15;

import java.awt.*;
import javax.swing.*;

public class main {

    public static void main(String[] args) {
        
        JFrame frame = new JFrame();
        
        // frame layout & settings
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(520, 425);
        frame.setLocationRelativeTo(null);
        frame.setTitle("Microsoft Excel 2007");
        frame.setIconImage(new ImageIcon("C:/Users/Acer/Desktop/icons/Excel-Logo-2007.png").getImage());
        
        // contents added to the frame
        frame.setJMenuBar(fileMenuBar());
        
        
        // frame visibility
        frame.setVisible(true);

    }


    public static JMenuBar fileMenuBar() {
    	
    	// declarations of bars
        JMenuBar mBar = new JMenuBar();
        JMenu mmenu = new JMenu("File");
        JMenu sMenu = new JMenu("Save As");
        JMenu pMenu = new JMenu("Print");
        

        
        // pictures for sub-menus
        sMenu.setIcon(new ImageIcon("C:/Users/Acer/Desktop/icons/saveas.png"));
        pMenu.setIcon(new ImageIcon("C:/Users/Acer/Desktop/icons/print.png"));
        
        // for contents
        JMenuItem c1 = new JMenuItem("New");
        JMenuItem c2 = new JMenuItem("Open");
        JMenuItem c3 = new JMenuItem("Save");
        JMenuItem c4 = new JMenuItem("Workbook");
        JMenuItem c5 = new JMenuItem("Macro-Enabled Workbook");
        JMenuItem c6 = new JMenuItem("Binary Workbook");
        JMenuItem c7 = new JMenuItem("Excel 97-2003 Workbook");
        JMenuItem c8 = new JMenuItem("Open Document Spreadsheet");
        JMenuItem c9 = new JMenuItem("PDF or XPS");
        JMenuItem c10 = new JMenuItem("Print");
        JMenuItem c11 = new JMenuItem("Quick Print");
        
        
        //  setting picture
        c1.setIcon(new ImageIcon("C:/Users/Acer/Desktop/icons/newfile.png"));
        c2.setIcon(new ImageIcon("C:/Users/Acer/Desktop/icons/open.png"));
        c3.setIcon(new ImageIcon("C:/Users/Acer/Desktop/icons/save.png"));
        c4.setIcon(new ImageIcon("C:/Users/Acer/Desktop/icons/workbook.png"));
        c5.setIcon(new ImageIcon("C:/Users/Acer/Desktop/icons/macro-enabledworkbook.png"));
        c6.setIcon(new ImageIcon("C:/Users/Acer/Desktop/icons/binary-workbook.png"));
        c7.setIcon(new ImageIcon("C:/Users/Acer/Desktop/icons/excel91-2003-workbook.png"));
        c8.setIcon(new ImageIcon("C:/Users/Acer/Desktop/icons/opendocspreadsheet.png"));
        c9.setIcon(new ImageIcon("C:/Users/Acer/Desktop/icons/pdforxps.png"));
        c10.setIcon(new ImageIcon("C:/Users/Acer/Desktop/icons/quickprint.png"));
        c11.setIcon(new ImageIcon("C:/Users/Acer/Desktop/icons/qprint.png"));
      
        
        
        //additions of settings
        mmenu.add(c1);
        mmenu.add(c2);
        mmenu.add(c3);
        
        // for save-menu
        sMenu.add(c4);
        sMenu.add(c5);
        sMenu.add(c6);
        sMenu.add(c7);
        sMenu.add(c8);
        sMenu.add(c9);
        sMenu.add(c10);
        
        
        //for print-menu
        pMenu.add(c10);
        pMenu.add(c11);
  
      
        // added to mBar
        mmenu.add(sMenu);
        mmenu.add(pMenu);
        mBar.add(mmenu);
     
        
        return mBar;
    }
}
